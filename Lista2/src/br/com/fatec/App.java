package br.com.fatec;

public class App {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 1000);
        Produto produto1 = new Produto("Celular", 700);

        CalculadorPreco descX = new CalculadorPreco(produto);
        CalculadorPreco descY = new CalculadorPreco(produto1);

        CalculoDesconto descontoX = new DescontoX();
        CalculoDesconto descontoY = new DescontoY();

        descX.setCalculoDesconto(descontoX);
        descY.setCalculoDesconto(descontoY);

        System.out.println(descX.getCalculoDesconto().calculoDesconto(produto));
        System.out.println(descY.getCalculoDesconto().calculoDesconto(produto1));


    }
}
