package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class CancelacionFlexible extends PoliticaCancelacion{
    /*
    Si el automóvil tiene política de cancelación flexible, se reembolsará el monto total sin importar la fecha de cancelación 
    (que de todas maneras debe ser anterior a la fecha de inicio de la reserva). 
    */
    @Override
    public double reembolsar(LocalDate fechaInicioReserva, LocalDate fechaDeCancelacion, double montoReserva) {
       return this.diasEntre(fechaInicioReserva, fechaDeCancelacion)>0 ? montoReserva : 0;
    }
}
