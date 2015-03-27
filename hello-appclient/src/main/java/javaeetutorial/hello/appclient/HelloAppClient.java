/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package javaeetutorial.hello.appclient;


import javaeetutorial.helloservice.Hello;
import javaeetutorial.helloservice.HelloService;

import javax.xml.ws.WebServiceRef;

public class HelloAppClient {
   // @WebServiceRef(wsdlLocation = 
     // "http://localhost:8080/helloservice-war/Hello?wsdl")
   // private static HelloService service;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(sayHello("Eduardo Wallace"));
    }

    private static String sayHello(java.lang.String arg0) {
    	HelloService service = new HelloService();
    	Hello port = service.getHelloPort();
        return port.sayHello(arg0);
    }
}
