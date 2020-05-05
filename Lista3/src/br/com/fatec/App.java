package br.com.fatec;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Produto prod = new ProdutoUnitario("Prod", 1000.0, "Descricao");
        Produto prod2 = new ProdutoUnitario("Prod 2", 1200.0, "Descricao 2");
        
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        
        produtos.add(prod);
        produtos.add(prod2);
        
        
        ProdutoComposto kit = new ProdutoComposto("Kit", "Descricao", produtos);
        kit.valorProduto = kit.calcularValorTotal();
        kit.descricao = kit.concatenarDescricoes();
        
        System.out.println(kit.calcularValorTotal());
        System.out.println(kit.descricao);
        
        Desconto desc = new DescontoPorcentagem(50.0);

        CalculadorPreco calcPrecoPorcentagem = new CalcPrecoPorcentagem();
        
        System.out.println(calcPrecoPorcentagem.calculadorPreco(kit, desc));

        System.out.println(calcPrecoPorcentagem.calculadorPreco(prod, desc));

    }
}
