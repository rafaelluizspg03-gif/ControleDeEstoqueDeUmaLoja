package ControleDeEstoqueDeUmaLoja;

public class Produto {

    private String Nome;
    private double Preco;
    private int Quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.Nome = nome;
        this.Preco = preco;
        this.Quantidade = quantidade;
    }

    public String getNome(){
        return this.Nome;
    }

    public int getquantidade(){
        return this.Quantidade;
    }

   public void repor(int unidades) {
        if (unidades <= 0) {
            throw new IllegalArgumentException("A reposição deve ser positiva.");
        }
        Quantidade += unidades;
    }

    public boolean vender(int unidades) {
        if (unidades <= 0) {
            throw new IllegalArgumentException("A venda deve ser positiva.");
        }
        if (unidades > Quantidade) {
            return false;
        }
        Quantidade -= unidades;
        return true;
    }

    public double calcularValorEstoque() {
        return Preco * Quantidade;
    }
}
