package ar.edu.info.unlp.ejercicioDemo;

public abstract class SandwichBuilder {
	protected Sandwich sandwich;
	
	public SandwichBuilder ()
	{
		this.sandwich = new Sandwich(); 
	}
	
	public abstract void construirPan(); 
	public abstract void construirPrincipal(); 
	public abstract void construirAderezo();
	public abstract void construirAdicional();
	
	
    public Sandwich obtenerSandwich() {
        return sandwich;
    }

}
