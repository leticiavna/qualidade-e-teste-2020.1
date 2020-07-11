package uff.qet.aula2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessadorBoletosTest {
    Fatura fatura = new Fatura(1500.00, "ANA CAROLINA");

    @Test
    void testDeveMarcarPagoQuandoValorMaiorQueTotal() {
        Boleto boleto1 = new Boleto(1000.00);
        Boleto boleto2 = new Boleto(500.00);
        Boleto boleto3 = new Boleto(250.00);

        Boleto[] boletos = { boleto1, boleto2, boleto3 };
        ProcessadorBoletos.processar(boletos, fatura);

        assertEquals(true, fatura.isFaturaPaga());
    }

    @Test
    void testDeveMarcarPagoQuandoValorIgualAoTotal() {
        Boleto boleto1 = new Boleto(1000.00);
        Boleto boleto2 = new Boleto(250.00);
        Boleto boleto3 = new Boleto(250.00);

        Boleto[] boletos = { boleto1, boleto2, boleto3 };
        ProcessadorBoletos.processar(boletos, fatura);

        assertEquals(true, fatura.isFaturaPaga());
    }

    @Test
    void testDeveMarcarNaoPagoQuandoValorMenorAoTotal() {
        Boleto boleto1 = new Boleto(250.00);

        ProcessadorBoletos.processar(boleto1, fatura);

        assertEquals(false, fatura.isFaturaPaga());
    }

    @Test
    void testDeveCriarNumeroCertoDePagamentos() {
        Boleto boleto1 = new Boleto(1000.00);
        Boleto boleto2 = new Boleto(200.00);

        Boleto[] boletos = { boleto1, boleto2 };
        ProcessadorBoletos.processar(boleto1, fatura);

        assertEquals(2, fatura.getPagamentos().size());
    }

    @Test
    void testNaoHaBoletoThrowError() {
        assertThrows(IllegalArgumentException.class, ()-> ProcessadorBoletos.processar({}, fatura));
    }

    @Test
    void testNaoHaFaturaThrowError() {
        Boleto boleto = new Boleto(200.00);
        assertThrows(IllegalArgumentException.class, ()-> ProcessadorBoletos.processar(boleto, {}));
    }
}