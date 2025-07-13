package ar.edu.info.unlp.ejercicioDemo;
public abstract class Empleado {
     
    // Template Method
    public final double calcularSueldo()
    {
       return this.calcularBasico() + this.calcularAdicional() - this.calcularDescuento();
    }
    
    protected abstract double calcularBasico();
    protected abstract double calcularAdicional();
    
    protected double calcularDescuento()
    {
        return this.calcularPorcentaje(this.calcularBasico(), 0.13) 
             + this.calcularPorcentaje(this.calcularAdicional(), 0.05);
    }
    
    private double calcularPorcentaje(double valor, double porcentaje)
    {
        return valor * porcentaje;
    }
            
}
