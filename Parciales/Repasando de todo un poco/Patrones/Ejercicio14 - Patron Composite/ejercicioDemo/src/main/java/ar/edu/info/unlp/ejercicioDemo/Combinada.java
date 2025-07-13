package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;

public class Combinada extends Prenda{
    List<Prenda> prendas;
    
    
    public Combinada()// por si no recibe ninguna lista de prendas...
    {
        this.prendas = new LinkedList<>();
    }
    
    public Combinada(List<Prenda> prendas)
    {
        this.prendas = prendas;
    }
    
    public void agregarPrenda(Prenda prenda)
    {
        this.prendas.add(prenda);
    }
    
    public void eliminarPrenda(Prenda prenda)
    {
        this.prendas.remove(prenda);
    }
    
    @Override
    protected double getLiquidez() {
        return 0.5; 
    }

    @Override
    protected double calcularValor() {
       return this.prendas.stream()
               .mapToDouble(prenda -> prenda.calcularValor())
               .sum();
    }
    
}
