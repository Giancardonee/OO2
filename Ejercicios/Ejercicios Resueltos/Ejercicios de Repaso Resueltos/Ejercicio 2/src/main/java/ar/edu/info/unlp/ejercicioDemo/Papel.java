package ar.edu.info.unlp.ejercicioDemo;

public class Papel implements Jugada {

	@Override
	public String jugarContra(Jugada otraJugada)
	{
		return otraJugada.jugarContraPapel(); 
	}
	
	@Override
	public String jugarContraPapel()
	{
		return "Empate";
	}
	
	@Override 
	public String jugarContraTijera()
	{
		return "Tijera gana"; 
	}
	
	@Override 
	public String jugarContraPiedra()
	{
		return "Papel gana"; 
	}
	
	@Override
	public String jugarContraLagarto()
	{
		return "Gana lagarto";
	}
	
	@Override 
	public String jugarContraSpock()
	{
		return "Gana papel"; 
	}
	
}
