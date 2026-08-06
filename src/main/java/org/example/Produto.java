package org.example;

public class Produto {
    private final String codigo;
    private String nome;
    private  double preco;
    private int estoque;

    public Produto(String codigo, String nome, double preco, int estoque) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código eh obrigatorio");
        }
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException(
                    "A quantidade deve ser maior que zero"
            );
        }

        if (quantidade > estoque) {
            throw new IllegalArgumentException(
                    "Estoque insuficiente"
            );
        }
        estoque -= quantidade;
    }

    public void comprar(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException(
                    "A quantidade deve ser maior que zero"
            );
        }
        estoque += quantidade;
    }

    public String getCodigo() {return codigo; }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getEstoque() {
        return estoque;
    }
}
