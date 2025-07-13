package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Automovil extends Prenda{
    private int modelo;
    private double km;
    private double costo0Km; 
    
    public Automovil (int modelo, double km, double costo0km)
    {
        this.modelo = modelo;
        this.km = km;
        this.costo0Km = costo0km;
    }

    @Override
    protected double getLiquidez() {
       return 0.7;
    }

    @Override
    protected double calcularValor() {
      return this.costo0Km - this.descuentoPorAntiguedad(); 
    }
    
    private double descuentoPorAntiguedad()
    {
        int anhosAntiguedad = LocalDate.now().getYear() - this.modelo;
        
        // para que no se le descuente mas porcentaje de lo que es el %100
        if (anhosAntiguedad>=10) return this.costo0Km; 
        
        // reduce %10 por cada anho de antiguedad
        return (anhosAntiguedad * 0.10) * this.costo0Km;
    }
    
}
