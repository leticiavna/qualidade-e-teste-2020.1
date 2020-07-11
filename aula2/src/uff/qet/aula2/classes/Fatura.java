package uff.qet.aula2.classes;

import uff.qet.common.classes.ClassModel;

public class Fatura extends ClassModel {
    private double valorTotal;
    private String nomeCliente;

    public Fatura(double valorTotal, String nomeCliente) {
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
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
}
