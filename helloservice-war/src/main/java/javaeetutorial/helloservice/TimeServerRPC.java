package javaeetutorial.helloservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface TimeServerRPC {

	@WebMethod
	public Cliente getCLiente(Cliente cliente);
	
}
