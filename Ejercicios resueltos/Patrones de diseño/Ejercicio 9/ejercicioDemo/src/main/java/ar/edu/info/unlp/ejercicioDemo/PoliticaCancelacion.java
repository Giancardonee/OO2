package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class PoliticaCancelacion {

	public abstract double reembolsar(LocalDate fechaCancelacion,LocalDate fechaReserva, double montoReserva);
	
	protected int diasEntre (LocalDate fechaDesde, LocalDate fechaHasta)
	{
		return (int) ChronoUnit.DAYS.between(fechaDesde, fechaHasta); 
	}
}
