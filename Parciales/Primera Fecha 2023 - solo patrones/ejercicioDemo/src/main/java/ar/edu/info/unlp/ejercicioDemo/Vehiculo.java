package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vehiculo {
   private String marca;
   private int anho; 
   private double precio;
   private int capacidadMaxima;
   private Persona duenho; 
   
   public Vehiculo(String marca, int anho, double precio, int capacidadMaxima, Persona persona)
   {
       this.marca = marca;
       this.anho = anho;
       this.precio = precio;
       this.capacidadMaxima = capacidadMaxima;
       this.duenho = persona;
   }

    public int getAnho() {
        return anho;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Persona getDuenho() {
        return duenho;
    }
    
   public int getAnhosAntiguedad()
   {
       return (int) ChronoUnit.YEARS.between(LocalDate.of(this.getAnho(), 1, 1), LocalDate.now());
   }
   
}
