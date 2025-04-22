package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class AutoEnAlquiler {

	private int cantidadPlazas;
	private double precioPorDia; 
	private String marca;
	private PoliticaCancelacion politicaCancelacion;
	
	public AutoEnAlquiler (int cantidadPlazas, double precioPorDia,String marca,PoliticaCancelacion politicaCancelacion)
	{
		this.cantidadPlazas = cantidadPlazas;
		this.precioPorDia = precioPorDia;
		this.marca = marca;
		this.politicaCancelacion = politicaCancelacion;
	}
	
	public void setPoliticaCancelacion (PoliticaCancelacion politicaCancelacion)
	{
		this.politicaCancelacion = politicaCancelacion;
	}
	
	public double getPrecioPorDia()
	{
		return this.precioPorDia;
	}
	
	public double reembolsarAlquiler(LocalDate fechaCancelacion, LocalDate fechaReserva,double montoReserva)
	{
		return politicaCancelacion.reembolsar(fechaCancelacion,fechaReserva,montoReserva);
	}
	
}
