package br.com.fatec;

public class DescontoX implements CalculoDesconto {
    @Override
    public double calculoDesconto(Produto produto) {
        return produto.getValorProduto() / 2;
    }
}
