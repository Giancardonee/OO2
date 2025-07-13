package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public class GeneradorUltimo implements GeneradorLinea {

	@Override
	public String obtenerNumero(SortedSet<String> lineas) {
	       String linea = lineas.last();
	        lineas.remove(linea);
	        return linea;
	}

}
