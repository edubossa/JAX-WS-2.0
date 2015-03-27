package javaeetutorial.helloservice;

import javax.jws.WebService;

@WebService(endpointInterface="javaeetutorial.helloservice.TimeServerRPC")
public class TimeServerRPCImpl implements TimeServerRPC {


	public Cliente getCLiente(Cliente cliente) {
		System.out.println(cliente); 
		return new Cliente(7845, "Eduardo Wallace");
	}

}
