package ar.edu.info.unlp.ejercicioDemo;

public abstract class Prenda {

	public abstract double liquidez(); 
	public abstract double valor();
	
	public double valorPrendario()
	{
		return this.liquidez() * this.valor();
	}
}
