package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	private LocalDate fechaAlta;
	
	public Cliente ()
	{
		this.fechaAlta = LocalDate.now();
	}
	
	public LocalDate getFechaAlta()
	{
		return this.fechaAlta;
	}
	
	public int calcularAnhosFechaAlta()
	{
		return Period.between(fechaAlta, LocalDate.now()).getYears();
	}
}
