package org.example;

public class TestaCodigos {
    public static void main(String[] args) {

        // Testa a classe Pessoa
//
//        int nota = 6;
//        String a = "Java";
//        String b = "JavaScript";
//        String c = new String("Java");
//        System.out.println("O resultado eh: " + a.equals(b));
//        System.out.println("O resultado eh: " + a.equals(c));
//
//        if (nota >= 6) {
//            System.out.println("Aprovado");
//        } else if (nota >= 3 || nota <= 5) {
//            System.out.println("Recuperação");
//        } else {
//            System.out.println("Reprovado");
//        }
//        Pessoa p1 = new Pessoa("Maria", 20);
//        Pessoa p2 = new Pessoa("José", 40);
//        p1.apresentar();
//        p2.apresentar();
//
          // Testa a classe Calculadora

//        double valor = p1.calcularDesconto(100, 10);
//        System.out.println(p1.getNome() +" o valor com desconto eh: R$ " + valor);
//        System.out.println(p2.getNome() +" o valor com desconto eh: R$ " + valor);
//        Calculadora calc = new Calculadora(10, 0);
//
//        System.out.println("Resultado da multiplicação: "+calc.multiplicar());
//        System.out.println("Resultado da divisão: "+calc.divivir());
//        System.out.println("Resultado da soma: "+calc.somar());
//        System.out.println("Resultado da subtração: "+calc.subtrair());


        // Testa a classe Produto
//
//        Produto produto = new Produto("123", "Notebook", 5000, 10);
//
//        System.out.println("=== Venda de produto ===");
//        System.out.println("Produto: " + produto.getNome());
//        System.out.println("Estoque inicial: " + produto.getEstoque());
//
//
//        try {
//            produto.vender(11);
//            System.out.println("Venda realizada com sucesso!");
//            System.out.println("Estoque atual: " + produto.getEstoque());
//
//            produto.vender(10);
//            System.out.println("Venda realizada com sucesso!");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Não foi possível realizar a venda: " + e.getMessage());
//        }
//        System.out.println("Estoque final: " + produto.getEstoque());

        // Testa a classe CofrinhoDigital
        CofrinhoDigital cofrinho = new CofrinhoDigital();
        cofrinho.depositar(100.00);
        cofrinho.depositar(50.00);
        System.out.println("\n=== Cofrinho digital ===");
        System.out.printf("Saldo: R$ %.2f%n", cofrinho.getSaldo());
        System.out.printf("Valor retirado ao quebrar: R$ %.2f%n", cofrinho.quebrar());
        System.out.printf("Saldo após quebrar: R$ %.2f%n", cofrinho.getSaldo());

        // Compara os meios de transporte para uma distância de 10 km
        double distancia = 10.0;
        MeioTransporte carro = new Carro();
        MeioTransporte bicicleta = new Bicicleta();
        MeioTransporte aPe = new APe();

        System.out.println("\n=== Tempo para percorrer 10 km ===");
        System.out.printf("Carro: %.2f horas%n", carro.calcularTempo(distancia));
        System.out.printf("Bicicleta: %.2f horas%n", bicicleta.calcularTempo(distancia));
        System.out.printf("A pé: %.2f horas%n", aPe.calcularTempo(distancia));

        // Testa as formas de pagamento
        double valorPedido = 100.00;
        System.out.println("\n=== Pagamentos ===");
        exibirValorFinal("Pix", new Pedido(valorPedido, new Pix()));
        exibirValorFinal("Cartão de crédito", new Pedido(valorPedido, new CartaoCredito()));
        exibirValorFinal("Boleto", new Pedido(valorPedido, new Boleto()));
    }

    private static void exibirValorFinal(String nomePagamento, Pedido pedido) {
        double valorFinal = pedido.processarPagamento();
        System.out.printf("%s: valor final R$ %.2f%n", nomePagamento, valorFinal);
    }
}
