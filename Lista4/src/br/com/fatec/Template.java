package br.com.fatec;

//import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Template {	
	
	protected String cabecalho() {
		String cabecalho = "## Arquivo de envio de remesssa ##";
		return cabecalho;
	}
	
	protected String rodape() {
		String rodape = "## Fim do arquivo ##";
		return rodape;
	}
	
	protected abstract String construirArquivo() throws IOException;
	
	public String escreverArquivo() throws IOException {
		return cabecalho() + construirArquivo() + rodape();
	}

}
