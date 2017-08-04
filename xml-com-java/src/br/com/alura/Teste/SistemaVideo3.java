package br.com.alura.Teste;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class SistemaVideo3 {
	
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = fabrica.newDocumentBuilder();
		Document document = builder.parse("src/vendasVideo3.xml");
		
		NodeList formasDePagamento = document.getElementsByTagName("nome");
		Element fdp = (Element) formasDePagamento.item(0);
		String nome = fdp.getTextContent();
		System.out.println(nome);
		
		
	}

}
