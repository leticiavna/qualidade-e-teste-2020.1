package uff.qet.aula2;

import uff.qet.common.classes.ClassModel;

public class Pagamento extends ClassModel {
    private double valorPago;
    private String tipo;
    private Boleto boleto;

    public Pagamento(double valorPago, String tipo, Boleto boleto) {
        this.valorPago = valorPago;
        this.tipo = tipo;
        this.boleto = boleto;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }
}
