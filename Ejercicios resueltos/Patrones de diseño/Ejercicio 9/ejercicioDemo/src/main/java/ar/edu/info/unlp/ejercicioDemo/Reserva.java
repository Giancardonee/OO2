package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Reserva {
	private int cantidadDias; 
	private LocalDate fechaReserva;
	private Usuario conductor;
	private AutoEnAlquiler autoAlquilado;
	
	public Reserva (int cantDias, LocalDate fechaReserva, Usuario conductor, AutoEnAlquiler auto)
	{
		this.cantidadDias = cantDias;
		this.fechaReserva = fechaReserva;
		this.conductor = conductor;
		this.autoAlquilado = auto;
	}
	
	public double montoAPagar()
	{
		return this.autoAlquilado.getPrecioPorDia() * this.cantidadDias;
	}
	
	public double montoAReembolsar(LocalDate fechaCancelacion)
	{
		return autoAlquilado.reembolsarAlquiler(fechaCancelacion,this.fechaReserva,this.montoAPagar());
	}
	

}
