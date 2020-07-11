package uff.qet.aula2.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaturaTest {
    Fatura fatura = new Fatura(100.00, "ADELE");

    @Test
    void getValorTotal() {
        assertEquals(100.00, fatura.getValorTotal());
    }

    @Test
    void setValorTotal() {
        fatura.setValorTotal(600.00);
        assertEquals(600.00, fatura.getValorTotal());
    }

    @Test
    void getNomeCliente() {
        assertEquals("ADELE", fatura.getNomeCliente());
    }

    @Test
    void setNomeCliente() {
        fatura.setNomeCliente("LANA DEL REY");
        assertEquals("LANA DEL REY", fatura.getNomeCliente());
    }
}