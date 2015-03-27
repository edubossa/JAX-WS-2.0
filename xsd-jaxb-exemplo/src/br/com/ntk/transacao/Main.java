package br.com.ntk.transacao;

import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;

public class Main {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		Cartao cartao = new Cartao();
		cartao.setNumCartao("3214 4565 8974 1457");
		cartao.setVia(00);
		cartao.setTipo(05);
		Cartao.Validade cv = new Cartao.Validade();
		cv.setAno(2014);
		cv.setMes(12);
		cartao.setValidade(cv);
		
		Transacao transacao = new Transacao();
		transacao.setCartao(cartao);
		transacao.setNsu("00914547");
		transacao.setTipoTransacao(TipoTransacao.CREDITO);
		transacao.setValor(new BigDecimal("5478.12"));
		transacao.setDataHora(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
		
		StringWriter xml = new StringWriter(); 
		
		JAXBContext.newInstance("br.com.ntk.transacao").createMarshaller()
			.marshal(new ObjectFactory().createTransacao(transacao), xml); 
		
		System.out.println(xml); 
		
		JAXBElement<Transacao> element = (JAXBElement<Transacao>) JAXBContext.newInstance("br.com.ntk.transacao")
			.createUnmarshaller().unmarshal(new StringReader(xml.toString()));
		
		Transacao newTransacao = element.getValue();
		
		System.out.println(newTransacao.getNsu()); 
		
	}
	
}