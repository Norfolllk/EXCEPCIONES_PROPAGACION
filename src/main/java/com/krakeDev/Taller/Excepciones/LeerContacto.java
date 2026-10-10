package com.krakeDev.Taller.Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerContacto {

    private static final Logger log = LoggerFactory.getLogger(LeerContacto.class);

    public static void leer() { 
        FileReader lectorArchivo = null;
        BufferedReader lector = null;
        
        try { 
            lectorArchivo = new FileReader("contactos.txt");
            
            lector = new BufferedReader(lectorArchivo);
            
            System.out.println(lector.readLine());
            
            log.info("Se pudo leer exitosamente");
        } catch (FileNotFoundException e) {
            log.error("Ocurrio un error al buscar el archivo: " + e); 
        } catch (IOException e) {
            log.error("Ocurrio un error al encontrar el archivo: " + e); 
        } finally { 
            try {
                lectorArchivo.close();
            	lector.close(); 
                log.info("Se cerro exitosamente"); 
            } catch (IOException e) { 
                e.printStackTrace();
            }
        }
    }
}
