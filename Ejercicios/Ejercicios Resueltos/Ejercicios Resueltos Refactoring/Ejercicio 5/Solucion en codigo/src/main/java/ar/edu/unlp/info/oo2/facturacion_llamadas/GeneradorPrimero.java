package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public class GeneradorPrimero implements GeneradorLinea{

	@Override
	public String obtenerNumero(SortedSet<String> lineas) {
	        String linea = lineas.first();
	        lineas.remove(linea);
	        return linea;
	}

}
