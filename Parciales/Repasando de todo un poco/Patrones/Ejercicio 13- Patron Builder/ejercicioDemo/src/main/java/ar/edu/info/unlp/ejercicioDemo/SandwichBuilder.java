package ar.edu.info.unlp.ejercicioDemo;
public abstract class SandwichBuilder {
    protected Sandwich sandwich;
    
    public SandwichBuilder()
    {
        
    }
    
    public abstract void construirPan(); 
    public abstract void construirAderezo();
    public abstract void construirPrincipal();
    public abstract void construirAdicional(); 
    
    public Sandwich getSandwich()
    {
        return this.sandwich;
    }
    
}
