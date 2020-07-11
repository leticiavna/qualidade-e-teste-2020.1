package uff.qet.aula2.classes;

import uff.qet.common.classes.ClassModel;

public class Pagamento extends ClassModel {
    private double valorPago;
    private String tipo;

    public Pagamento(double valorPago, String tipo) {
        this.valorPago = valorPago;
        this.tipo = tipo;
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
}
