package br.com.fatec;

public class VeiculoPasseio extends Veiculo {
    public VeiculoPasseio(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public String toString() {
        return "Placa: " + placa + " Modelo: " + modelo + " Tipo veiculo: Passeio";
    }
}
