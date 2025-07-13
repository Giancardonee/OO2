package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;

public class Persona {
    private int edad;
    private Promocion promocion;
    private List<Seguro> seguros;
    
    
    public Persona(int edad, Promocion promocion)
    {
        this.edad = edad;
        this.promocion = promocion;
        this.seguros = new LinkedList<>();
    }
     
    public void agregarPoliza(Seguro seguro)
    {
        this.seguros.add(seguro);
    }
     
     
    public double calcularPrecioFinal()
    {
        double precioSeguros = this.seguros.stream()
                .mapToDouble( seguro -> seguro.calcularPrecioSeguro())
                .sum();  
        return precioSeguros - promocion.calcularDescuentoPromocion(seguros);
    }
    
    public void setEstrategiaPromocion(Promocion nuevaEstrategia)
    {
        this.promocion = nuevaEstrategia;
    }
    
    public int getEdad()
    {
        return this.edad;
    }
}
