package br.com.alura.Teste;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import br.com.alura.Model.Produto;

public class SistemaVideo3 {
	
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = fabrica.newDocumentBuilder();
		Document document = builder.parse("src/vendasVideo3.xml");
		
		NodeList produtos = document.getElementsByTagName("produto");
		
		for(int i= 0;i < produtos.getLength();i++){
			Element produto = (Element) produtos.item(i);
			
			
			String nome = produto.getElementsByTagName("nome").item(0).getTextContent();
			double preco =  Double.parseDouble(produto.getElementsByTagName("preco").item(0).getTextContent());
			Produto result = new Produto(nome,preco);
			
			System.out.println(result);
		}
	}

}
