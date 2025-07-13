package ar.edu.info.unlp.ejercicioDemo;
public class Inmueble extends Prenda {
    private String direccion;
    private double superficie;
    private double costoM2;
    
    
    public Inmueble (String direccion, double superficie, double costoM2)
    {
        this.direccion = direccion;
        this.superficie = superficie;
        this.costoM2 = costoM2;
    }
    
    @Override
    protected double getLiquidez() {
       return 0.2;
    }

    @Override
    protected double calcularValor() {
        return this.superficie * this.costoM2;
    }
    
}
