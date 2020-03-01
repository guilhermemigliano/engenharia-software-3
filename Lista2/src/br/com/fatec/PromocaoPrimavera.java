package br.com.fatec;

public class PromocaoPrimavera implements CalculoDesconto {
    @Override
    public double calculoDesconto(Produto produto) {
        return produto.getValorProduto() - produto.getValorProduto() * 0.10;
    }
}
