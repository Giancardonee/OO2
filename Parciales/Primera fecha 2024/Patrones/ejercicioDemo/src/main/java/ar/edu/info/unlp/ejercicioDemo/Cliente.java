package ar.edu.info.unlp.ejercicioDemo;
public class Cliente {
    private String nombre;
    private double salarioMensual;
    
    public Cliente (String nombre, double salarioMensual)
    {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }
    
    public double getSalarioMensual()
    {
        return this.salarioMensual;
    }
    
}
