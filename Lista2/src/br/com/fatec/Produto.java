package br.com.fatec;

public class Produto {
    protected String nome;
    protected double valorProduto;

    public double getValorProduto() {
        return valorProduto;
    }

    public Produto(String nome, double valorProduto) {
        this.nome = nome;
        this.valorProduto = valorProduto;
    }
}
