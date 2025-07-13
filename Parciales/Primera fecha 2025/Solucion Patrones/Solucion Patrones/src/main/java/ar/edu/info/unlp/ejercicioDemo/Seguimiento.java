package ar.edu.info.unlp.ejercicioDemo;
public class Seguimiento extends Servicios{
    
    public Seguimiento(IPaquete wrapped) {
        super(wrapped);
    }
    
    @Override
    public double obtenerCostoEnvio()
    {
        return super.obtenerCostoEnvio() + 2000; 
    }
}
