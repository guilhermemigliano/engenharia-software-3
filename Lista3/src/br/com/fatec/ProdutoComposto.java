package br.com.fatec;

import java.util.ArrayList;

public class ProdutoComposto extends Produto {
    public ArrayList<Produto> produtos = new ArrayList<Produto>();

    public ProdutoComposto(String nome, double valorProduto, String descricao, ArrayList<Produto> produtos) {
        super(nome, valorProduto, descricao);
        this.produtos = produtos;
    }
    
    public ProdutoComposto(String nome, String descricao, ArrayList<Produto> produtos) {
        super(nome, 0.0, descricao);
        this.produtos = produtos;
    }
    
    public double calcularValorTotal(){
        double soma = 0;
        for (int i=0; i < produtos.size(); i++) {
            soma = soma + produtos.get(i).valorProduto;
        }
        return soma;
    }
    
    public String concatenarDescricoes() {
    	String descricao = "";
    	for (int i=0; i < produtos.size(); i++) {
    		descricao = descricao + produtos.get(i).descricao + " ";
    	}
    	return descricao;
    }
}
