package org.example;

public class CofrinhoDigital {
    private double saldo;

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero");
        }
        saldo += valor;
    }

    public double quebrar() {
        double total = saldo;
        saldo = 0;
        return total;
    }

    public double getSaldo() {
        return saldo;
    }
}
