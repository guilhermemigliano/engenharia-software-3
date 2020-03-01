package br.com.fatec;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        ArrayList<ContaEstacionamento> ativos = new ArrayList<ContaEstacionamento>();

        int opVeiculo, opMenu = 50, opConta;
        String placa, modelo;

        Controle controle = new Controle();

        while (opMenu != 0){
            System.out.println("#### MENU ####");
            System.out.println("1 - Registrar entrada");
            System.out.println("2 - Registrar saida");
            System.out.println("3 - Listar ativos");
            System.out.println("0 - Sair");
            opMenu = controle.opcao();
            if (opMenu == 1){
                Calendar entrada = Calendar.getInstance();

                System.out.println("Digite a placa: ");
                placa = controle.texto();

                System.out.println("Digite o modelo: ");
                modelo = controle.texto();

                System.out.println("Escolha o tipo de veiculo:");
                System.out.println("1 - Passeio");
                System.out.println("2 - Carga");
                System.out.println("3 - Passageiro");
                opVeiculo = controle.opcao();

                if (opVeiculo == 1){
                    Veiculo veiculo = new VeiculoPasseio(placa, modelo);
                    ContaEstacionamento conta = new ContaEstacionamento(entrada, veiculo);
                    ativos.add(conta);
                }

                else if (opVeiculo == 2){
                    Veiculo veiculo = new VeiculoCarga(placa, modelo);
                    ContaEstacionamento conta = new ContaEstacionamento(entrada, veiculo);
                    ativos.add(conta);
                }

                else if (opVeiculo == 3){
                    Veiculo veiculo = new VeiculoPassageiro(placa, modelo);
                    ContaEstacionamento conta = new ContaEstacionamento(entrada, veiculo);
                    ativos.add(conta);
                }
            }

            else if (opMenu == 2){
                Calendar saida = Calendar.getInstance();

                System.out.println("Para qual veiculo deseja registrar saida?");
                for (int i=0; i < ativos.size(); i++) {
                    System.out.printf("%d - %s\n", i, ativos.get(i));
                }
                opConta = controle.opcao();

                ativos.get(opConta).setSaida(saida);

                long periodo = Duration.between(ativos.get(opConta).getEntrada().toInstant(), ativos.get(opConta).getSaida().toInstant()).toMillis();

                if (periodo < 43200000){
                    CalculoValor calc = new ValorHora();

                    ativos.get(opConta).setCalculoValor(calc);

                    double valorFinal = calc.valorConta(periodo, ativos.get(opConta).getVeiculo());

                    System.out.println(valorFinal);

                    ativos.remove(opConta);
                }

                else if (periodo > 43200000 && periodo < 1296000000) {
                    CalculoValor calc = new ValorDiaria();

                    ativos.get(opConta).setCalculoValor(calc);

                    double valorFinal = calc.valorConta(periodo, ativos.get(opConta).getVeiculo());

                    System.out.println(valorFinal);

                    ativos.remove(opConta);
                }

                else {
                    CalculoValor calc = new ValorMensal();

                    ativos.get(opConta).setCalculoValor(calc);

                    double valorFinal = calc.valorConta(periodo, ativos.get(opConta).getVeiculo());

                    System.out.println(valorFinal);

                    ativos.remove(opConta);
                }
            }

            else if (opMenu == 3){
                for (int i=0; i < ativos.size(); i++) {
                    System.out.printf("%d - %s\n", i, ativos.get(i));
                }
            }
        }
    }
}
