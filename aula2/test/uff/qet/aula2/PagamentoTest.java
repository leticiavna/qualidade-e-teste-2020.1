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
    Pagamento pagamento = new Pagamento(100.00, "BOLETO", fatura, boleto);

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
    void testGetFatura() {
        assertEquals(fatura, pagamento.getFatura());
    }

    @Test
    void testSetFatura() {
        Fatura fatura2 = new Fatura(1000.00, "HAYLEY KIYOKO");
        pagamento.setFatura(fatura2);
        assertEquals(fatura2, pagamento.getFatura());
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