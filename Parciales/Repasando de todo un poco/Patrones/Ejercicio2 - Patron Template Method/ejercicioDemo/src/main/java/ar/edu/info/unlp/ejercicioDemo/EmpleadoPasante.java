package ar.edu.info.unlp.ejercicioDemo;
public class EmpleadoPasante extends Empleado{
    private int cantidadExamenesRendidos; 
    
    public EmpleadoPasante (int examenesRendidos)
    {
        this.cantidadExamenesRendidos = examenesRendidos;
    }
    
    @Override
    protected double calcularBasico() {
       return 20000;
    }

    @Override
    protected double calcularAdicional() {
        return 2000 * this.cantidadExamenesRendidos;
    }
}
