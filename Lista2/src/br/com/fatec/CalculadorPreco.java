package br.com.fatec;

public class CalculadorPreco {
    Produto produto;
    protected CalculoDesconto calculoDesconto;

    public CalculadorPreco(Produto produto) {
        this.produto = produto;
    }

    public void setCalculoDesconto(CalculoDesconto calculoDesconto){
        this.calculoDesconto = calculoDesconto;
    }

    public CalculoDesconto getCalculoDesconto() {
        return calculoDesconto;
    }
}
