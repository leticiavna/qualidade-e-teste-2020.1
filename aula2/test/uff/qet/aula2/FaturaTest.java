package uff.qet.aula2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FaturaTest {
    Pagamento pagamento = new Pagamento(50.00, "BOLETO");
    Fatura fatura = new Fatura(1000.00, "ADELE");

    @BeforeEach
    void setUp() {
        fatura.setPagamentos(pagamento);
    }

    @Test
    void testGetValorTotal() {
        assertEquals(1000.00, fatura.getValorTotal());
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
        fatura.setFaturaPaga();
        assertEquals(true, fatura.isFaturaPaga());
    }

    @Test
    void testGetPagamentos() {
        assertEquals(pagamento, fatura.getPagamentos().get(0));
    }

    @Test
    void testSetPagamentos() {
        Pagamento pagamento2 = new Pagamento(50.00, "BOLETO");
        Pagamento pagamento3 = new Pagamento(50.00, "BOLETO");
        fatura.setPagamentos(pagamento2);
        fatura.setPagamentos(pagamento3);

        assertEquals(3, fatura.getPagamentos().size());
    }

}