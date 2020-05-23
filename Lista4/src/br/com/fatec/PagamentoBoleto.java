package br.com.fatec;

public class PagamentoBoleto extends Pagamento {

	
	
	PagamentoBoleto(String nome, String CPF, String bancoRecebimento, String bancoPagamento, String data, double valor) {
		super(nome, CPF, bancoRecebimento, bancoPagamento, data, valor);
		// TODO Auto-generated constructor stub
	}
	
	private String numeroBoleto;

	public String getNumeroBoleto() {
		return numeroBoleto;
	}

	public void setNumeroBoleto(String numeroBoleto) {
		this.numeroBoleto = numeroBoleto;
	}

	

	@Override
	public String imprimir() {
		
		
		String validaCPF = super.getCPF();
		
		if(ValidaCPF.isCPF(validaCPF) == false) {
			validaCPF = validaCPF + " (CPF Inválido)";
			super.setCPF(validaCPF);
		}
		
		String remessa = "\nNome: " + super.getNome() + "\nCPF: " + super.getCPF() + "\nBanco Recebimento: " + super.getBancoRecebimento() + "\nBanco Pagamento: " + super.getBancoPagamento() + "\nData: " + super.getData() + "\nValor: " + super.getValor()
		+ "\nNumero boleto: " + this.numeroBoleto;
		
		
		remessa = remessa + "\n--------------------------\n";
		
		return remessa;
	}; 
	

}
