package ar.edu.info.unlp.ejercicioDemo;

public abstract class Empleado {
    private static double montoBasico = 20000; 
	
	public Double calcularSueldo ()
	{	
		return this.calcularBasico() + this.calcularAdicional() - this.calcularDescuento();
	}
	

	protected double calcularDescuento()
	{
		return
				this.calcularPorcentaje(this.calcularBasico(), 0.13)
				+ this.calcularPorcentaje(this.calcularAdicional(), 0.05) ; 
		
	}
	
	protected double calcularBasico ()
	{
		return montoBasico; 
	}
	
	protected abstract double calcularAdicional(); 
	
	
	private double calcularPorcentaje(Double total, Double porcentaje)
	{
		return total * porcentaje; 
	}
	
}
