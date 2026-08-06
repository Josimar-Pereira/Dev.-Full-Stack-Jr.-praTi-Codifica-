package org.example;

public class Calculadora {
    private double n1;
    private double n2;

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

//    public Calculadora() {
//        this.n1 = 0;
//        this.n2 = 0;
//    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double somar() {
        return n1 + n2;
    }

    public double subtrair() {
        return n1 - n2;
    }

    public double multiplicar() {
        return n1 * n2;
    }

    public double divivir() {
        if (n2 == 0) {
            System.out.println("ERRO_DIVISAO_POR_ZERO");
        }
        return n1 / n2;
    }
}
