package br.com.alura.Teste;

import java.io.FileInputStream;
import java.io.InputStream;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class LerArquivoXmlDeOutraForma {
	
	public static void main(String[] args) throws Exception {
		XMLReader leitor = XMLReaderFactory.createXMLReader();
		LeitorXml logica = new LeitorXml();
		leitor.setContentHandler(logica);
		InputStream ips = new FileInputStream("src/vendasVideo3.xml");
		InputSource is = new InputSource(ips);
		leitor.parse(is);
		
		System.out.println(logica.produtos);
		
	}

}
