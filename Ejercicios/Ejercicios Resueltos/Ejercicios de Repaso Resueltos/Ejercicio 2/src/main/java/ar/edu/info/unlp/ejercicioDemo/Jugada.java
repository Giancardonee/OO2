package ar.edu.info.unlp.ejercicioDemo;

public interface Jugada {
	
	public  String jugarContra(Jugada otraJugada); 
	public String jugarContraPiedra();
	public String jugarContraPapel();
	public String jugarContraTijera();
	public String jugarContraLagarto(); 
	public String jugarContraSpock();

}
