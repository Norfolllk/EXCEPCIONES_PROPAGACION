package com.krakeDev.Taller.Excepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GuardarContacto {

	private static final Logger Log = LogManager.getLogger(GuardarContacto.class);

	public static void guardar() { 
	    FileWriter escritor = null;
	    try {
	        escritor = new FileWriter("contactos.txt");
	        escritor.write("Nombre: Maria \n");
	        escritor.write("Apellido: Gomez \n"); 
	        escritor.write("Telefono: 0981234567 \n");
	        Log.info("Se guardo exitosamente");
	    } catch (Exception e) {
	        Log.error("Ocurrio un error: " + e); 
	    } finally {
	        try { 
	            escritor.close(); 
	            Log.info("Se cerro el escritor exitosamente"); 
	        } catch (IOException e) { 
	            e.printStackTrace();
	        }
	    }
	}
}
