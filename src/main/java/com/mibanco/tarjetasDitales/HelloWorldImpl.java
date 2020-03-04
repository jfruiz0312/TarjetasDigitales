
package com.mibanco.tarjetasDitales;

import javax.jws.WebService;

@WebService(endpointInterface = "com.mibanco.tarjetasDitales.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public String sayBy(String nombre) {
		
		return "Adios:"+nombre;
	}
    
}

