package ar.edu.info.unlp.ejercicioDemo;
public class ConSeguro extends Servicios{
    public ConSeguro(IPaquete wrapped)
    {
        super(wrapped);
    }

    @Override 
    public double obtenerCostoEnvio()
    {
        return super.wrapped.obtenerCostoEnvio() + (this.obtenerValorDeclarado() * 0.20);
    }
    
    @Override 
    public String obtenerDescripcion()
    {
        return super.wrapped.obtenerDescripcion() + " con seguro";
    }
}
