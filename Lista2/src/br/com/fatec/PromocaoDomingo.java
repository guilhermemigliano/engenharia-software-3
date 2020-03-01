package br.com.fatec;

public class PromocaoDomingo implements CalculoDesconto{
    @Override
    public double calculoDesconto(Produto produto) {
        return produto.getValorProduto() - produto.getValorProduto() * 0.05;
    }
}
