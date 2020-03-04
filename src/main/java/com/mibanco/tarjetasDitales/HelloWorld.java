package com.mibanco.tarjetasDitales;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    
    String sayBy(String nombre);
}

