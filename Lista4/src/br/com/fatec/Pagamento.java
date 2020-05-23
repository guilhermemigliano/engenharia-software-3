package br.com.fatec;

public abstract class Pagamento {
	
	private String nome;
	private String CPF;
	private String bancoRecebimento;
	private String bancoPagamento;
	private String data;
	private double valor;
	
	//private String numeroCartao;
	//private String nomeTitular;
	//private int parcelas;
	
	//private String numeroBoleto;
	
	Pagamento(String nome, String CPF, String bancoRecebimento, String bancoPagamento, String data, double valor){
		this.nome = nome;
		this.CPF = CPF;
		this.bancoRecebimento = bancoRecebimento;
		this.bancoPagamento = bancoPagamento;
		this.data = data;
		this.valor = valor;
		//this.numeroCartao = numeroCartao;
		//this.nomeTitular = nomeTitular;
		//this.parcelas = parcelas;
		//this.numeroBoleto = numeroBoleto;
	}
	
	protected abstract String imprimir();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getBancoRecebimento() {
		return bancoRecebimento;
	}

	public void setBancoRecebimento(String bancoRecebimento) {
		this.bancoRecebimento = bancoRecebimento;
	}

	public String getBancoPagamento() {
		return bancoPagamento;
	}

	public void setBancoPagamento(String bancoPagamento) {
		this.bancoPagamento = bancoPagamento;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	

}
