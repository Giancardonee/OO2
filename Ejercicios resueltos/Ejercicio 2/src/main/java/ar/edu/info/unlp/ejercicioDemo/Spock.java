package ar.edu.info.unlp.ejercicioDemo;

public class Spock extends Jugada {
	@Override
	public String jugarContra(Jugada otraJugada)
	{
		return otraJugada.jugarContraTijera(); 
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
