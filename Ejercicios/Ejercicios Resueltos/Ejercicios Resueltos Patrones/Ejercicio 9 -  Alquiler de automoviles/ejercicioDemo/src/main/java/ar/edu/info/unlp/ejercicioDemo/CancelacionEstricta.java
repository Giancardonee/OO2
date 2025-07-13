package ar.edu.info.unlp.ejercicioDemo;
import java.time.LocalDate;
public class CancelacionEstricta extends PoliticaCancelacion{
    @Override
    public double reembolsar(LocalDate fechaInicioReserva, LocalDate fechaDeCancelacion, double montoReserva) {
       return 0;
    }
}
