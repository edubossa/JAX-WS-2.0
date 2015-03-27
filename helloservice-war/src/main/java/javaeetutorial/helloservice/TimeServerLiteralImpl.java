package javaeetutorial.helloservice;

import javax.jws.WebService;

@WebService(endpointInterface="javaeetutorial.helloservice.TimeServerLiteral")
public class TimeServerLiteralImpl implements TimeServerLiteral {


	public Cliente getCLiente(Cliente cliente) {
		System.out.println(cliente); 
		return new Cliente(7845, "Eduardo Wallace");
	}

}
