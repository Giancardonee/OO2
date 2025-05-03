package ar.edu.info.unlp.ejercicioDemo;

public class SubteWay {
	private SandwichBuilder builder; 
	
	public SubteWay (SandwichBuilder unBuilder)
	{
		this.builder = unBuilder;
	}
	
	public Sandwich construirSandwich()
	{
		builder.construirPan();
		builder.construirPrincipal();
		builder.construirAderezo();
		builder.construirAdicional();
		
		return builder.obtenerSandwich();
	}
}
