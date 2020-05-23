package br.com.fatec;


//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int op = 3;		
		
		
		while(op != 0) {
			System.out.println("Selecione o tipo de arquivo:");
			System.out.println("1 - Remessa JSON");
			System.out.println("2 - Remessa XML");
			System.out.println("0 - Sair");
			
			op = sc.nextInt();
			
			if(op == 1) {
				Template template = new TemplateJSON();
				
				System.out.println(template.escreverArquivo());
			}	
			
			if(op == 2) {
				Template template = new TemplateXML();
				
				System.out.println(template.escreverArquivo());
			}	
			
		}
		
		
		//System.out.println(op);	
		
		
        
		
		
		
		sc.close();
		
		


	}

}
