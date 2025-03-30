package ar.edu.info.unlp.ejercicioDemo;

public class Spock implements Jugada {
	@Override
	public String jugarContra(Jugada otraJugada)
	{
		return otraJugada.jugarContraSpock(); 
	}
	
	@Override
	public String jugarContraPapel()
	{
		return "Gana papel";
	}
	
	@Override 
	public String jugarContraTijera()
	{
		return "Gana spock"; 
	}
	
	@Override 
	public String jugarContraPiedra()
	{
		return "Gana spock"; 
	}
	
	@Override 
	public String jugarContraLagarto()
	{
		return "Gana lagarto"; 
	}
	
	@Override 
	public String jugarContraSpock()
	{
		return "Empate"; 
	}
	
}
