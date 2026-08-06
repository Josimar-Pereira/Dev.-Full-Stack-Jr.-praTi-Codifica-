package org.example;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void apresentar() {
        System.out.println("Meu nome eh "+ nome+" tenho "+idade+" anos.");
    }

    double calcularDesconto(double valor, double percentagem) {
        return valor * percentagem / 100;
    }
}
