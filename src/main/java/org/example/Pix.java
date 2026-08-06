package org.example;

public class Pix implements FormaPagamento {
    @Override
    public void processar(double valor) {
        validarValor(valor);
    }

    @Override
    public double calcularTaxa(double valor) {
        validarValor(valor);
        return 0.0;
    }

    private void validarValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero");
        }
    }
}
