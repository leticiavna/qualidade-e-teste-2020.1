package uff.qet.aula2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes para a classe de pagamento
 * Getters e Setters
 */
class PagamentoTest {
    Boleto boleto = new Boleto(100.00);
    Fatura fatura = new Fatura(500.00, "HAYLEY KIYOKO");
    Pagamento pagamento = new Pagamento(100.00, "BOLETO", boleto);

    @Test
    void testGetValorPago() {
        assertEquals(100.00, pagamento.getValorPago());
    }

    @Test
    void testSetValorPago() {
        pagamento.setValorPago(200.00);
        assertEquals(200.00, pagamento.getValorPago());
    }

    @Test
    void testGetTipo() {
        assertEquals("BOLETO", pagamento.getTipo());
    }

    @Test
    void testSetTipo() {
        pagamento.setTipo("CARTAO");
        assertEquals("CARTAO", pagamento.getTipo());
    }

    @Test
    void testGetBoleto() {
        assertEquals(boleto, pagamento.getBoleto());
    }

    @Test
    void testSetBoleto() {
        Boleto boleto2 = new Boleto(60.00);
        pagamento.setBoleto(boleto2);
        assertEquals(boleto2, pagamento.getBoleto());
    }
}