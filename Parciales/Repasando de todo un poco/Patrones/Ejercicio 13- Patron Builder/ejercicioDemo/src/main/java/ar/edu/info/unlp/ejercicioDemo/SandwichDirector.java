package ar.edu.info.unlp.ejercicioDemo;
public class SandwichDirector {
    private SandwichBuilder builder;
    
    
    public SandwichDirector(SandwichBuilder builder)
    {
        this.builder = builder;
    }
    
    public Sandwich construirSandwich()
    {
        builder.construirPan();
        builder.construirAderezo();
        builder.construirPrincipal();
        builder.construirAdicional();
       return  builder.getSandwich();
    }
            
            
    public void cambiarBuilder(SandwichBuilder builder)
    {
        this.builder = builder;
    }
    
    
}
