package org.example;

public class Pedido {
    private final double valor;
    private final FormaPagamento formaPagamento;

    public Pedido(double valor, FormaPagamento formaPagamento) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do pedido deve ser maior que zero");
        }
        if (formaPagamento == null) {
            throw new IllegalArgumentException("A forma de pagamento é obrigatória");
        }
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public double calcularValorFinal() {
        return valor + formaPagamento.calcularTaxa(valor);
    }

    public double processarPagamento() {
        formaPagamento.processar(valor);
        return calcularValorFinal();
    }
}
