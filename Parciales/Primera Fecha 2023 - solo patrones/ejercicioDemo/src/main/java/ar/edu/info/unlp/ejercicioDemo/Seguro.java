package ar.edu.info.unlp.ejercicioDemo;
public abstract class Seguro {
    protected Vehiculo vehiculo;
  
    public Seguro (Vehiculo vehiculo)
    {
        this.vehiculo = vehiculo;
    }
    
    // Template Method
    public double calcularPrecioSeguro()
    {
        return this.calcularSeguroVida() + this.calcularCoberturaTerceros() + this.calcularCoberturaPropia();
    }
    
    public abstract double calcularSeguroVida();
    public abstract double calcularCoberturaTerceros();
    
    
    public double calcularCoberturaPropia()
    {
        return this.vehiculo.getPrecio() * 0.5;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
