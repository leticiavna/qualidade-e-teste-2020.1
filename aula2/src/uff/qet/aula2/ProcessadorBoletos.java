package uff.qet.aula2;

import java.util.List;

public abstract class ProcessadorBoletos {

    static void processar(List<Boleto> boletos, Fatura fatura) {
        if (fatura == null) throw new IllegalArgumentException("Fatura enviada para o precessador não existe.");
        if (boletos == null || boletos.isEmpty()) throw new IllegalArgumentException("Boletos enviados para o processador não existem.");
        double totalPagamentos = 0.0;
        for (Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValorPago(), "BOLETO");
            fatura.setPagamentos(pagamento);
            totalPagamentos += pagamento.getValorPago();
        };

        if (fatura.getValorTotal() <= totalPagamentos) fatura.setFaturaPaga();
    }
}
