package ar.edu.info.unlp.ejercicioDemo;
public class EntregaExpress extends Servicios {
    
    public EntregaExpress (IPaquete wrapped)
    {
        super(wrapped);
    }
    
    @Override
    public double obtenerCostoEnvio()
    {
        return super.obtenerCostoEnvio() + (super.obtenerValorDeclarado() / 2); 
    }
    
    @Override
    public String obtenerDescripcion()
    {
        return super.obtenerDescripcion() + " entrega express"; 
    }

}
