package uff.qet.aula2;

import uff.qet.common.classes.ClassModel;

public class Boleto extends ClassModel {
    private double valorPago;

    public Boleto(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
}
