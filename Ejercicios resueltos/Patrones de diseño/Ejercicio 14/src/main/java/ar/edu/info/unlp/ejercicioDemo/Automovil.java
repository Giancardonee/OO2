package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Automovil extends Prenda{
	private int modelo;
	private double kilometraje;
	private double costo_0_km; 
	
	public Automovil(int modelo, double km, double costo_0KM)
	{
		this.costo_0_km = costo_0KM;
		this.modelo = modelo;
		this.kilometraje = km;
	}
	
	@Override
	public double liquidez() {
		return 0.7;
	}

	@Override
	public double valor() {
	    double descuentoPorAntiguedad = 0.10 * this.getAnhosAntiguedad();
	    double valorCalculado = this.costo_0_km * (1 - descuentoPorAntiguedad);
	    return Math.max(0, valorCalculado); // Asegura que el valor no sea menor que 0
	}

	private int getAnhosAntiguedad()
	{
		return LocalDate.now().getYear() - this.modelo;
	}
	
}
