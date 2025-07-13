package ar.edu.info.unlp.ejercicioDemo;
public class Fragil extends Servicios{
    
    public Fragil (IPaquete wrapped)
    {
        super(wrapped);
    }
    
    @Override
    public String obtenerDescripcion()
    {
        return super.obtenerDescripcion() + " fragil";
    }
}

