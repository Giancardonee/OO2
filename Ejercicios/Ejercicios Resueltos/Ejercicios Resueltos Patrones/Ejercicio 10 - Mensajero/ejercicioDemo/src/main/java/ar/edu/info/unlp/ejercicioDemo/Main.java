package ar.edu.info.unlp.ejercicioDemo;


// Consultar, capaz tenga que hacer algo para mandarle la clase sin el adapter.
public class Main {
	  public static void main(String[] args) {
	        Mensajero m = new Mensajero(new AdapterFeistel(null));
	        String mensaje = "Hola mundo";

	        m.enviar(mensaje);  // Usa Feistel

	        m.setEstrategia(new AdapterRC4(mensaje));   // Cambia a RC4

	        m.recibir(mensaje);  // Usa RC4
	    }
}
