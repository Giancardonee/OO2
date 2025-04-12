package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Producto {
	private double precio;
	
	public Producto (double precio)
	{
		this.precio = precio;
	}
	
	public double getPrecio()
	{
		return this.precio;
	}
	
}
