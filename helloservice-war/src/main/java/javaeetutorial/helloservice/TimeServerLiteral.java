package javaeetutorial.helloservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(use=Use.LITERAL)
public interface TimeServerLiteral {
	
	@WebMethod
	public Cliente getCLiente(Cliente cliente);
	
}
