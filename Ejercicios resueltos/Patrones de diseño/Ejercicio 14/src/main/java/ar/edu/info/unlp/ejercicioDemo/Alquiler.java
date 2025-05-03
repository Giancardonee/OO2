package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Prenda {
	private LocalDate comienzoContrato; 
	private LocalDate finContrato;
	private double costoMensual;
	
	public Alquiler(LocalDate comienzoContrato, LocalDate finContrato, double costoMensual)
	{
		this.comienzoContrato = comienzoContrato;
		this.finContrato = finContrato;
		this.costoMensual = costoMensual;
	}
	
	@Override
	public double liquidez() {
		return 0.9;
	}

	@Override
	public double valor() {
		return this.getMesesFaltantes() * this.costoMensual;
	}
	
	private int getMesesFaltantes()
	{
		return (int) ChronoUnit.MONTHS.between(comienzoContrato, finContrato);
	}

}
