package ar.edu.info.unlp.ejercicioDemo;

public class SubteWay {
	private SandwichBuilder builder; 
	
	public SubteWay (SandwichBuilder unBuilder)
	{
		this.builder = unBuilder;
	}
	
        public void setBuilder (SandwichBuilder builder)
        {
            this.builder = builder;
        }
        
        public SandwichBuilder getBuilder ()
        {
            return this.builder;
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

