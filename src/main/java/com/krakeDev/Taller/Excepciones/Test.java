package com.krakeDev.Taller.Excepciones;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

    private static final Logger log = LogManager.getLogger(Test.class);

    public static void main(String[] args) {
        try {
            GuardarContacto.guardar();
            log.info("Se guardó el Archivo");
        } catch (IOException e) {
            log.error("Ocurrió un error: ", e);
        }
        System.out.println("El programa se sigue ejecutando");
    }
}
