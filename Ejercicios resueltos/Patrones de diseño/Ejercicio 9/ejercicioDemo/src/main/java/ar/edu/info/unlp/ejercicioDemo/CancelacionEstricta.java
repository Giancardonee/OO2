package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class CancelacionEstricta extends PoliticaCancelacion {

	@Override
	public double reembolsar(LocalDate fechaCancelacion, LocalDate fechaReserva, double montoReserva) {
		return 0;
	}
}
