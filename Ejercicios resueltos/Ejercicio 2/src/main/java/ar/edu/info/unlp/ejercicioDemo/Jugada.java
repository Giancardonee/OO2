package ar.edu.info.unlp.ejercicioDemo;

public abstract class Jugada {
	
	public abstract String jugarContra(Jugada otraJugada); 
	public abstract String jugarContraPiedra();
	public abstract String jugarContraPapel();
	public abstract String jugarContraTijera();
	public abstract String jugarContraLagarto(); 
	public abstract String jugarContraSpock();
	
}
