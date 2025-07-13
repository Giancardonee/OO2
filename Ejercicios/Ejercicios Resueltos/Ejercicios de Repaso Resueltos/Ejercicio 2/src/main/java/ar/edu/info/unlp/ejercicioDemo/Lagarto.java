package ar.edu.info.unlp.ejercicioDemo;

public class Lagarto implements Jugada  {

	@Override
	public String jugarContra(Jugada otraJugada)
	{
		return otraJugada.jugarContraLagarto(); 
	}
	
	@Override
	public String jugarContraPapel()
	{
		return "Gana lagarto";
	}
	
	@Override 
	public String jugarContraTijera()
	{
		return "Tijera gana"; 
	}
	
	@Override 
	public String jugarContraPiedra()
	{
		return "Piedra gana"; 
	}
	
	@Override 
	public String jugarContraLagarto()
	{
		return "Empate"; 
	}
	
	@Override 
	public String jugarContraSpock()
	{
		return "Gana lagarto"; 
	}
	
}
