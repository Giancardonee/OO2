package ar.edu.info.unlp.ejercicioDemo;

public class Calculadora {
	private double valorAcumulado;
	private EstadoCalculadora estado; 
	
	public Calculadora()
	{
		this.reiniciarCalculadora();
	}
	
	public String getResultado ()
	{
		return this.estado.getResultado(this);
	}
	
	public void borrar()
	{
		this.reiniciarCalculadora();
	}
	
	public void setValor(double unValor)
	{
		this.estado.setValor(unValor, this);
	}
	
	public void mas()
	{
		this.estado.mas(this);
	}
	
	public void menos()
	{
		this.estado.menos(this);
	}
	
	public void por()
	{
		this.estado.por(this);
	}
	
	public void dividido()
	{
		this.estado.dividido(this);
	}
	
	public void setEstado(EstadoCalculadora estado)
	{
		this.estado = estado;
	}
	
	public void setValorAcumulado (double valor)
	{
		this.valorAcumulado = valor;
	}
	
	public double getValorAcumulado ()
	{
		return this.valorAcumulado;
	}
	
	private void reiniciarCalculadora()
	{
		this.valorAcumulado = 0 ;
		this.estado = new Inicial();
	}
	
}
