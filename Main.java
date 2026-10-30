package ControleDeEstoqueDeUmaLoja;

import java.util.Locale;

public class Main {
     public static void main(String[] args) {
        Produto produto = new Produto("Mouse sem fio", 79.90, 10);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Venda de 3: " + produto.vender(3));
        System.out.println("Venda de 20: " + produto.vender(20));
        produto.repor(5);

        System.out.println("Quantidade final: " + produto.getquantidade());
        System.out.printf(Locale.forLanguageTag("pt-BR"),
                "Valor em estoque: R$ %,.2f%n", produto.calcularValorEstoque());
    }

}
