package ar.edu.unlp.info.oo2.facturacion_llamadas;


public class LlamadaBuilder {
	
	  public static Llamada crearLlamada(String tipo, Cliente origen, Cliente destino, int duracion) {
	        switch (tipo.toLowerCase()) {
	            case "nacional":
	                return new Llamada_Nacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
	            case "internacional":
	                return new Llamada_Internacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
	            default:
	                throw new IllegalArgumentException("Tipo de llamada no soportado: " + tipo);
	        }
	    }
}
