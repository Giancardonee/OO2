package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Reserva {
    private int cantDias;
    private LocalDate fechaInicioReserva; 
    private AutoEnAlquiler alquiler;
    
    public Reserva (int cantDias, LocalDate fechaInicioReserva, AutoEnAlquiler autoAlquilado)
    {
        this.cantDias = cantDias;
        this.fechaInicioReserva = fechaInicioReserva;
        this.alquiler = autoAlquilado;
    }
 
    public double montoAReembolsar(LocalDate fechaDeReembolso)
    {
        return this.alquiler.reembolsar(fechaInicioReserva, fechaDeReembolso, this.calcularMontoReserva());
    }
    
    private double calcularMontoReserva()
    {
        return this.cantDias * this.alquiler.getPrecioPorDia();
    }
    
}
