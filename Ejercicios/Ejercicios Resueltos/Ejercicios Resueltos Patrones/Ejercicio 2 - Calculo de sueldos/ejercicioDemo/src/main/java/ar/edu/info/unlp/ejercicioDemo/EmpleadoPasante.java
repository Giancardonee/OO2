package ar.edu.info.unlp.ejercicioDemo;

public class EmpleadoPasante extends Empleado{
	private int cantExamRendidos; 
	
	public EmpleadoPasante (int cantExamenesRendidos)
	{
		this.cantExamRendidos = cantExamenesRendidos;
	}
	
	@Override 
	protected double calcularAdicional()
	{
		return 2000 * this.cantExamRendidos;
	}
	
}
