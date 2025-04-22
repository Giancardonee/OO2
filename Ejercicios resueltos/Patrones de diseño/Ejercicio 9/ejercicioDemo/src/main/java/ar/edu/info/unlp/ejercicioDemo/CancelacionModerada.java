package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CancelacionModerada extends PoliticaCancelacion{

	@Override
	public double reembolsar(LocalDate fechaCancelacion, LocalDate fechaReserva,double montoReserva) {
		if (this.cancelacionConSemanaAnticipacion(fechaCancelacion, fechaReserva))
		{
			return montoReserva;
		}
		else if (this.cancelacionHastaDosDiasAntes(fechaCancelacion, fechaReserva))
		{
			return montoReserva * 0.5; // % 50 
		}
		else return 0;
	}

	private boolean cancelacionConSemanaAnticipacion(LocalDate fechaCancelacion, LocalDate fechaReserva)
	{
		return this.diasEntre(fechaCancelacion, fechaReserva) >= 7;
	}
	
	private boolean cancelacionHastaDosDiasAntes(LocalDate fechaCancelacion, LocalDate fechaReserva)
	{
		return this.diasEntre(fechaCancelacion, fechaReserva) >= 2;
	}
	
	
}
