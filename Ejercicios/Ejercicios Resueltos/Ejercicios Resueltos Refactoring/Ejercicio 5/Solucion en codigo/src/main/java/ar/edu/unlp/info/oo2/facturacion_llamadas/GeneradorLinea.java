package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

// Strategy
public interface GeneradorLinea {
	String obtenerNumero(SortedSet<String> lineas);
	
}
