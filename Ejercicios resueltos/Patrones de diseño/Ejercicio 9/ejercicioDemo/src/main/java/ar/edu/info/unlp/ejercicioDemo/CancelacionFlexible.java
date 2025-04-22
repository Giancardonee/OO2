package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class CancelacionFlexible extends PoliticaCancelacion {

	@Override
	public double reembolsar(LocalDate fechaCancelacion, LocalDate fechaReserva, double montoReserva) {
		if (this.seCancelaAntesDeInicioDeReserva(fechaCancelacion, fechaReserva)) 
		{
			return montoReserva;
		}
		else return 0;
	}

	private boolean seCancelaAntesDeInicioDeReserva(LocalDate fechaDesde, LocalDate fechaHasta)
	{
		return this.diasEntre(fechaDesde, fechaHasta) > 0;
	}
	
	
}
