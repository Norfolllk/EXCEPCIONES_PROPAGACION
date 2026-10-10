package com.krakeDev.Taller.Excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    private static final Logger Log = LogManager.getLogger(Test.class);

    public static void main(String[] args) {
    	
        try {
            String telefono = "0981234567";
            ValidarContacto.validarTelefono(telefono);
            GuardarContacto.guardar(telefono);
            LeerContacto.leer();

            Log.info("Se guardo el telefono de forma exitosa");
        } catch (IllegalArgumentException e) {
            Log.error("Ocurrio un error: " + e);
        }
    }
}
