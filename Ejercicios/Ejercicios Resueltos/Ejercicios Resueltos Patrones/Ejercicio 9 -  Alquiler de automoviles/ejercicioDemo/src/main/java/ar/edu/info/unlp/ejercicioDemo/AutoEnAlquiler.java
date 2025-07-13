package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class AutoEnAlquiler {
    private String marca;
    private int cantPlazas;
    private double precioPorDia;
    private PoliticaCancelacion politicaCancelacion;
    
    public AutoEnAlquiler(String marca, int cantPlazas,double precioPorDia, PoliticaCancelacion unaPolitica)
    {
        this.marca = marca;
        this.cantPlazas = cantPlazas;
        this.precioPorDia = precioPorDia;
        this.politicaCancelacion = unaPolitica;
    }
    
    public double reembolsar(LocalDate fechaInicioReserva, LocalDate fechaCancelacion,double montoReserva)
    {
        return this.politicaCancelacion.reembolsar(fechaInicioReserva, fechaCancelacion, montoReserva);
    }
    
    public double getPrecioPorDia()
    {
        return this.precioPorDia;
    }
    
    
    public void setPoliticaCancelacion(PoliticaCancelacion unaPolitica)
    {
        this.politicaCancelacion = unaPolitica;
    }
}
