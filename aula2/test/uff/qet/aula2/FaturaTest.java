package uff.qet.aula2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaturaTest {
    Fatura fatura = new Fatura(100.00, "ADELE");

    @Test
    void testGetValorTotal() {
        assertEquals(100.00, fatura.getValorTotal());
    }

    @Test
    void testSetValorTotal() {
        fatura.setValorTotal(600.00);
        assertEquals(600.00, fatura.getValorTotal());
    }

    @Test
    void testGetNomeCliente() {
        assertEquals("ADELE", fatura.getNomeCliente());
    }

    @Test
    void testSetNomeCliente() {
        fatura.setNomeCliente("LANA DEL REY");
        assertEquals("LANA DEL REY", fatura.getNomeCliente());
    }

    @Test
    void testIsFaturaPaga() {
        assertEquals(false, fatura.isFaturaPaga());
    }

    @Test
    void testSetFaturaPaga() {
        fatura.setFaturaPaga(true);
        assertEquals(true, fatura.isFaturaPaga());
    }

}