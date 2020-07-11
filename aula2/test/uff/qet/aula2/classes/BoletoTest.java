package uff.qet.aula2.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoletoTest {
    Boleto boleto = new Boleto(50.03);

    @Test
    void getValorPago() {
        assertEquals(50.03, boleto.getValorPago());
    }

    @Test
    void setValorPago() {
        boleto.setValorPago(49.97);
        assertEquals(49.97, boleto.getValorPago());
    }
}