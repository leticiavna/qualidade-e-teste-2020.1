package uff.qet.aula2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FaturaTest {
    Boleto boleto = new Boleto(50.00);
    Fatura fatura = new Fatura(100.00, "ADELE");
    Pagamento pagamento = new Pagamento(50.00, "BOLETO", fatura, boleto);

    @BeforeEach
    void setUp() {
        fatura.setPagamento(pagamento);
    }

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

    @Test
    void testGetPagamentos() {
        assertEquals(pagamento, fatura.getPagamentos().get(0));
    }

    @Test
    void testSetPagamentos () {
        Boleto boleto2 = new Boleto(100.00);
        Boleto boleto3 = new Boleto(50.00);

        Pagamento pagamento2 = new Pagamento(100.00, "BOLETO", fatura, boleto2);
        Pagamento pagamento3 = new Pagamento(100.00, "BOLETO", fatura, boleto3);

        List<Pagamento> pagamentos = new ArrayList<Pagamento>();
        pagamentos.add(pagamento2);
        pagamentos.add(pagamento3);

        fatura.setPagamentos(pagamentos);

        assertEquals(3, fatura.getPagamentos().size());

    }
    @Test
    void testSetPagamento() {
        Boleto boleto2 = new Boleto(100.00);
        Pagamento pagamento2 = new Pagamento(100.00, "BOLETO", fatura, boleto);
        fatura.setPagamento(pagamento2);
        assertEquals(2, fatura.getPagamentos().size());
    }

}