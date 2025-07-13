package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public abstract class PoliticaCancelacion {
 
    public abstract double reembolsar(LocalDate fechaInicioReserva, LocalDate fechaDeCancelacion, double montoReserva);
    
    protected int diasEntre(LocalDate fechaInicioReserva, LocalDate fechaCancelacion)
    {
        return (int) (ChronoUnit.DAYS.between(fechaCancelacion, fechaInicioReserva));
    }
}
