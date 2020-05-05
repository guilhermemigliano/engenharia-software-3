package br.com.fatec;

public abstract class Produto {
    protected String nome, descricao;
    protected Double valorProduto;

    public Double getValorProduto() {
        return valorProduto;
    }

    public Produto(String nome, Double valorProduto, String descricao) {
        this.nome = nome;
        this.valorProduto = valorProduto;
        this.descricao = descricao;
    }
}
