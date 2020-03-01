package br.com.fatec;

public class VeiculoCarga extends Veiculo {
    public VeiculoCarga(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public String toString() {
        return "Placa: " + placa + " Modelo: " + modelo + " Tipo veiculo: Carga";
    }
}
