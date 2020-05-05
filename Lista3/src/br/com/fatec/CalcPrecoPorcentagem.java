package br.com.fatec;

public class CalcPrecoPorcentagem implements CalculadorPreco {

    @Override
    public double calculadorPreco(Produto produto, Desconto desconto) {
        return produto.getValorProduto() - (produto.getValorProduto() * desconto.getValorDesconto()/100);
    }
}
