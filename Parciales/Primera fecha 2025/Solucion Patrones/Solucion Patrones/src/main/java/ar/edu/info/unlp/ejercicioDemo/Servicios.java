package ar.edu.info.unlp.ejercicioDemo;
public abstract class Servicios implements IPaquete{
    protected IPaquete wrapped;
    
    
    public Servicios (IPaquete wrapped)
    {
        this.wrapped = wrapped;
    }

    @Override
    public double obtenerCostoEnvio() {
        return wrapped.obtenerCostoEnvio();
    }

    @Override
    public String obtenerDescripcion() {
        return wrapped.obtenerDescripcion();
    }
    
    @Override 
    public double obtenerValorDeclarado()
    {
        return wrapped.obtenerValorDeclarado();
    }
   
}
