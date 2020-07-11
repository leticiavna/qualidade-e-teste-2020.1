package uff.qet.aula2;

import uff.qet.common.classes.ClassModel;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

public class Fatura extends ClassModel {
    private double valorTotal;
    private String nomeCliente;
    private boolean faturaPaga = false;
    private List<Pagamento> pagamentos;

    public Fatura(double valorTotal, String nomeCliente) {
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
        this.pagamentos = new ArrayList<Pagamento>();
    }

    public Fatura(double valorTotal, String nomeCliente, List<Pagamento> pagamentos) {
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
        this.pagamentos = pagamentos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public boolean isFaturaPaga() {
        return faturaPaga;
    }

    public void setFaturaPaga(boolean faturaPaga) {
        this.faturaPaga = faturaPaga;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos.addAll(pagamentos);
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
    }
}
