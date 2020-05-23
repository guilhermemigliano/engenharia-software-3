package br.com.fatec;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class TemplateXML extends Template {

	@Override
	protected String construirArquivo() throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/guilhermemigliano/eclipse-workspace/Pratica04/src/br/com/fatec/remessa.xml"));
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("br.com.pageseguro.RemessaCartaoCredito", PagamentoCartao.class);
		xstream.alias("br.com.pageseguro.RemessaCartaoDebito", PagamentoCartao.class);
		xstream.alias("br.com.pageseguro.RemessaBoleto", PagamentoBoleto.class);
		
		@SuppressWarnings("unchecked")
		List<Pagamento> pagamento = (List<Pagamento>) xstream.fromXML(bufferedReader);
		
		String remessa = "";
		
		
		for(Pagamento item : pagamento){
		    remessa = remessa + item.imprimir();
		}
		
		bufferedReader.close();
		
		return remessa;
	}

}
