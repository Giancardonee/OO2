package ar.edu.info.unlp.ejercicioDemo;
 
public class Tijera implements Jugada {
	
	@Override
	public String jugarContra(Jugada otraJugada)
	{
		return otraJugada.jugarContraTijera(); 
	}
	
	@Override
	public String jugarContraPapel()
	{
		return "Tijera gana";
	}
	
	@Override 
	public String jugarContraTijera()
	{
		return "Empate"; 
	}
	
	@Override 
	public String jugarContraPiedra()
	{
		return "Piedra gana"; 
	}
	@Override
	public String jugarContraLagarto()
	{
		return "Gana tijera";
	}
	
	@Override 
	public String jugarContraSpock()
	{
		return "Gana spock";
	}
}
