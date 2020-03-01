package br.com.fatec;

public class App {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 1000);
        Produto produto1 = new Produto("Celular", 700);

        CalculadorPreco descX = new CalculadorPreco(produto);
        CalculadorPreco descY = new CalculadorPreco(produto1);

        CalculoDesconto descontoPrimavera = new PromocaoPrimavera();
        CalculoDesconto descontoDomingo = new PromocaoDomingo();

        descX.setCalculoDesconto(descontoPrimavera);
        descY.setCalculoDesconto(descontoDomingo);

        System.out.println(descX.getCalculoDesconto().calculoDesconto(produto));
        System.out.println(descY.getCalculoDesconto().calculoDesconto(produto1));


    }
}
