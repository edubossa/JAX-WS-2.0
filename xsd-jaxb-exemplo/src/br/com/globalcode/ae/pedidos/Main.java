package br.com.globalcode.ae.pedidos;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

/**
 * Gerar classes a partir do XSD:
 * <p>
 * <b> xjc pedidos.xsd -d src -p br.com.blobalcode.ae.pedidos </b>
 *
 * @author Eduardo Wallace
 *
 */
public class Main {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		Cliente c = new Cliente();
		c.setNome("José da Silva");
		c.setEndereco("Rua das Camelias, 320");
		
		Produto produto1 = new Produto();
		produto1.setId(311);
		produto1.setNome("Camera DC 510");
		produto1.setPreco(1500d);
		produto1.setMarca("Sony");
		
		Item item1 = new Item();
		item1.setProduto(produto1);
		item1.setQuantidade(1);
		
		Produto produto2 = new Produto();
		produto2.setId(312);
		produto2.setNome("HD 80GB");
		produto2.setPreco(400d);
		produto2.setMarca("Samsung");
		
		Item item2 = new Item();
		item2.setProduto(produto2);
		item2.setQuantidade(1);
		
		
		
		Pedido pedido = new Pedido(); 
		pedido.setCliente(c);
		pedido.getItem().add(item1);
		pedido.getItem().add(item2);
		
		//Parse para XML
		JAXBElement<Pedido> element = new ObjectFactory().createPedido(pedido);
		StringWriter xml = new StringWriter();
		JAXBContext.newInstance("br.com.globalcode.ae.pedidos").createMarshaller().marshal(element, xml);
		
		System.out.println(xml);
		
		//Parse para Objeto
		JAXBContext context = JAXBContext.newInstance("br.com.globalcode.ae.pedidos");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		JAXBElement<Pedido> element2 = (JAXBElement<Pedido>) unmarshaller.unmarshal(new StringReader(xml.toString()));
		Pedido p = element2.getValue();
		System.out.println(p.getCliente().getNome());
		
		
	}

}
