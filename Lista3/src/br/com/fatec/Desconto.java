package br.com.fatec;

public abstract class Desconto {
    public double valorDesconto;

    public double getValorDesconto() {
        return valorDesconto;
    }

    public Desconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
}
