package ar.edu.info.unlp.ejercicioDemo;

public class Piedra implements Jugada {
	
	@Override
	public String jugarContra(Jugada otraJugada)
	{
		return otraJugada.jugarContraPiedra(); 
	}
	
	@Override
	public String jugarContraPapel()
	{
		return "Papel gana";
	}
	
	@Override 
	public String jugarContraTijera()
	{
		return "Piedra gana"; 
	}
	
	@Override 
	public String jugarContraPiedra()
	{
		return "Empate"; 
	}
	\
	@Override
	public String jugarContraLagarto()
	{
		return "Piedra gana";
	}
	
	@Override
	public String jugarContraSpock()
	{
		return "Spock gana";
	}
	
	
}
