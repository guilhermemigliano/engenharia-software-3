package br.com.fatec;

public class PagamentoCartao extends Pagamento {		
	
	
	PagamentoCartao(String nome, String CPF, String bancoRecebimento, String bancoPagamento, String data, double valor) {
		super(nome, CPF, bancoRecebimento, bancoPagamento, data, valor);
		// TODO Auto-generated constructor stub
	}
	
	private String numeroCartao;
	private String nomeTitular;
	private int parcelas;
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	public String imprimir() {
		
		String validaCPF = super.getCPF();
		
		if(ValidaCPF.isCPF(validaCPF) == false) {
			
			
			validaCPF = validaCPF + " (CPF Inválido)";
			super.setCPF(validaCPF);
		}
		
		String remessa = "\nNome: " + super.getNome() + "\nCPF: " + super.getCPF() + "\nBanco Recebimento: " + super.getBancoRecebimento() + "\nBanco Pagamento: " + super.getBancoPagamento() + "\nData: " + super.getData() + "\nValor: " + super.getValor()
		+ "\nNumero Cartao: " + this.numeroCartao +"\nNome titular: " + this.nomeTitular + "\nParcelas: " + this.parcelas;
		
		
		remessa = remessa + "\n--------------------------\n";
		
		return remessa;
	}; 
	

}
