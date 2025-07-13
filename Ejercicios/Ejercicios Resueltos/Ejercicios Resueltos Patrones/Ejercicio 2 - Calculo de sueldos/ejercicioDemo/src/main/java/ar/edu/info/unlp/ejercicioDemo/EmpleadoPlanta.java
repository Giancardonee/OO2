package ar.edu.info.unlp.ejercicioDemo;

public class EmpleadoPlanta extends Empleado {
	
	private int cantidadHijos; 
	private boolean estaCasado; 
	private int anhosAntiguedad;
	
	public EmpleadoPlanta (int cantHijos, boolean estaCasado,int anhosAntiguedad)
	{
		this.cantidadHijos = cantHijos;
		this.estaCasado = estaCasado;
		this.anhosAntiguedad = anhosAntiguedad;
	}
	
	@Override
	protected double calcularBasico ()
	{
		return super.calcularBasico() + 30000; 
	}
	
	@Override
	protected double calcularAdicional ()
	{
		double adicional = 0 ; 
		
		adicional+= 2000 * this.anhosAntiguedad;
		adicional+= 2000 * this.cantidadHijos;
		if (this.estaCasado) adicional+= 5000;
		
		return adicional;
	}
}
