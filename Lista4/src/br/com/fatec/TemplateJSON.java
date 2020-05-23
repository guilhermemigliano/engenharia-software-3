package br.com.fatec;


import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.json.*;





public class TemplateJSON extends Template{	
	
	
	@Override
	protected String construirArquivo() throws IOException{
		
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/guilhermemigliano/eclipse-workspace/Pratica04/src/br/com/fatec/remessa.json"));
//
//        Gson gson = new Gson();
//        List<Pagamento> pagamento = gson.fromJson(bufferedReader, new TypeToken<List<PagamentoCartao>>() {}.getType());
//		
//		String remessa = "";
//		
//		
//		for(Pagamento item : pagamento){
//		    remessa = remessa + item.imprimir();
//		}
//		
//		//json.forEach(json.get(1).bancoPagamento);
//		//System.out.println(json.get(1).bancoPagamento);
//		
//		bufferedReader.close();
//		
//		return remessa;		
		String remessa = "";
		 
		try {
	        List<Pagamento> pagamento = new ArrayList();
	        
	        JSONParser parser = new JSONParser();
	        JSONArray jsonList;
	        Gson gson = new Gson();

	        jsonList = (JSONArray) parser.parse(new FileReader("/Users/guilhermemigliano/eclipse-workspace/Pratica04/src/br/com/fatec/remessa.json"));

	        Iterator listOfJsonObject = jsonList.iterator();
	        JSONObject jsonObject;
	        while (listOfJsonObject.hasNext()) {
	            jsonObject = (JSONObject) listOfJsonObject.next();
	            if (jsonObject.get("numeroBoleto") != null) {
	                pagamento.add(gson.fromJson(jsonObject.toString(), PagamentoBoleto.class));
	                continue;
	            }
	            pagamento.add(gson.fromJson(jsonObject.toString(), PagamentoCartao.class));
	        }
	        
	        
	        
	        for(Pagamento item : pagamento){
			    remessa = remessa + item.imprimir();
			}
	        
	        

	        // you can use your list of car and motorcycle further

	    } catch (IOException | ParseException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
		
		return remessa;	
		
	}

	
	
	
	

}
