package br.com.fatec;

import java.text.DateFormat;
import java.util.Calendar;

public class ContaEstacionamento {
    protected Calendar entrada, saida;
    protected Veiculo veiculo;
    protected CalculoValor calculoValor;

    public Calendar getEntrada() {
        return entrada;
    }

    public Calendar getSaida() {
        return saida;
    }

    public void setSaida(Calendar saida) {
        this.saida = saida;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setCalculoValor(CalculoValor calculoValor) {
        this.calculoValor = calculoValor;
    }

    public ContaEstacionamento(Calendar entrada, Veiculo veiculo) {
        this.entrada = entrada;
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        DateFormat dtHora = DateFormat.getDateTimeInstance();
        return veiculo + " Hora de entrada: " + dtHora.format(entrada.getTime());
    }
}
