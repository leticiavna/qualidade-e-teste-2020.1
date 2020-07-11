package uff.qet.aula2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProcessadorBoletosTest {
    Fatura fatura = new Fatura(1500.00, "ANA CAROLINA");
    List<Boleto> boletos = new ArrayList<Boleto>();

    @Test
    void testDeveMarcarPagoQuandoValorMaiorQueTotal() {
        Boleto boleto1 = new Boleto(1000.00);
        Boleto boleto2 = new Boleto(500.00);
        Boleto boleto3 = new Boleto(250.00);

        boletos.add(boleto1);
        boletos.add(boleto2);
        boletos.add(boleto3);

        ProcessadorBoletos.processar(boletos, fatura);

        assertEquals(true, fatura.isFaturaPaga());
    }

    @Test
    void testDeveMarcarPagoQuandoValorIgualAoTotal() {
        Boleto boleto1 = new Boleto(1000.00);
        Boleto boleto2 = new Boleto(250.00);
        Boleto boleto3 = new Boleto(250.00);

        boletos.add(boleto1);
        boletos.add(boleto2);
        boletos.add(boleto3);

        ProcessadorBoletos.processar(boletos, fatura);

        assertEquals(true, fatura.isFaturaPaga());
    }

    @Test
    void testDeveMarcarNaoPagoQuandoValorMenorAoTotal() {
        Boleto boleto1 = new Boleto(250.00);

        boletos.add(boleto1);
        ProcessadorBoletos.processar(boletos, fatura);

        assertEquals(false, fatura.isFaturaPaga());
    }

    @Test
    void testDeveCriarNumeroCertoDePagamentos() {
        Boleto boleto1 = new Boleto(1000.00);
        Boleto boleto2 = new Boleto(200.00);

        boletos.add(boleto1);
        boletos.add(boleto2);

        ProcessadorBoletos.processar(boletos, fatura);

        assertEquals(2, fatura.getPagamentos().size());
    }

    @Test
    void testNaoHaBoletoThrowError() {
        assertThrows(IllegalArgumentException.class, ()-> ProcessadorBoletos.processar(null, fatura));
    }

    @Test
    void testNaoHaFaturaThrowError() {
        Boleto boleto = new Boleto(200.00);
        boletos.add(boleto);
        assertThrows(IllegalArgumentException.class, ()-> ProcessadorBoletos.processar(boletos, null));
    }
}