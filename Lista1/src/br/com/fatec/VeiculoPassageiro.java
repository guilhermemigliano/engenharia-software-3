package br.com.fatec;

public class VeiculoPassageiro extends Veiculo {
    public VeiculoPassageiro(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public String toString() {
        return "Placa: " + placa + " Modelo: " + modelo + " Tipo veiculo: Passageiro";
    }
}
