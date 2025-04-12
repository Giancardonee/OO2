package ar.edu.info.unlp.ejercicioDemo;

public class EmpleadoTemporario extends Empleado {
    private int cantHorasTrabajadas; 
    private boolean estaCasado;
    private int cantidadHijos; 
    
    
    public EmpleadoTemporario(int cantHsTrabajadas, boolean estaCasado, int cantHijos)
    {
    	this.cantHorasTrabajadas = cantHsTrabajadas;
    	this.estaCasado = estaCasado;
    	this.cantidadHijos = cantHijos;
    }
    
    @Override
    protected double calcularAdicional()
    {
    	double adicional=0;
    	
    	adicional+= 2000 * this.cantidadHijos;
    	if (this.estaCasado) adicional+= 5000;
    
    	return adicional; 
    }
    
	@Override
	protected double calcularBasico()
	{
		return super.calcularBasico() + this.costoSegunHorasTrabajadas(); 
	}
	
	
	private double costoSegunHorasTrabajadas()
	{
		return this.cantHorasTrabajadas * 300.0; 
	}
	
	
}
