package br.com.alura.Teste;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import br.com.alura.Model.Venda;

public class MapeaXML {
	public static void main(String[] args) throws Exception{
		JAXBContext jaxbContext = JAXBContext.newInstance(Venda.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		Venda venda = (Venda)unmarshaller.unmarshal(new File("src/vendasVideo3.xml"));
		
		System.out.println(venda);
	}

}
