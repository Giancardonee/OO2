package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

// Rol <Product>
public class Presupuesto {
    private String nombrePersona; 
    private LocalDate fechaPresupuesto;
    private List<Componente> componentes;
    
    public void setearConPersonaNueva(String nombre)
    {
        this.nombrePersona = nombre;
        this.componentes = new LinkedList();
        this.fechaPresupuesto = LocalDate.now();
    }
    
    public void agregarComponente(Componente componente)
    {
        this.componentes.add(componente);
    }
    
    public double calcularConsumo()
    {
        return this.componentes.stream()
                .mapToDouble(component -> component.getConsumo())
                .sum();
    }
    
    public double calcularPrecio()
    {
       double precioSinIva = this.componentes.stream()
               .mapToDouble(component -> component.getPrecio())
               .sum();
       return this.calcularPrecioConIva(precioSinIva);
    }
    
    private double calcularPrecioConIva(double precio)
    {
        return precio + (precio * 0.21);
    }
}
