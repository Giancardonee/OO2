package ar.edu.info.unlp.ejercicioDemo;
import java.time.LocalDate;
public class CancelacionModerada extends PoliticaCancelacion{
    /*
    Si el automóvil tiene política de cancelación moderada, se reembolsará el monto total si la cancelación se hace hasta una semana antes 
    y 50% si se hace hasta 2 días antes.
    */
    @Override
    public double reembolsar(LocalDate fechaInicioReserva, LocalDate fechaDeCancelacion, double montoReserva) {
                int cantDias = this.diasEntre(fechaInicioReserva, fechaDeCancelacion);
                if (cantDias >=7) return montoReserva; 
                else if(cantDias>=2) return montoReserva/2;
                
                return 0; // Si la cancelacion se hace un dia antes o en el mismo dia
    }
}
