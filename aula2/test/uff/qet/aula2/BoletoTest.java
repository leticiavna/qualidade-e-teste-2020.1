package uff.qet.aula2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoletoTest {
    Boleto boleto = new Boleto(50.03);

    @Test
    void testGetValorPago() {
        assertEquals(50.03, boleto.getValorPago());
    }

    @Test
    void testSetValorPago() {
        boleto.setValorPago(49.97);
        assertEquals(49.97, boleto.getValorPago());
    }
}