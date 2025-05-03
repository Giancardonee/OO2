package ar.edu.info.unlp.ejercicioDemo;

public class Inmueble extends Prenda{
	private String direccion;
	private double superficie;
	private double costo_m2;
	
	public Inmueble (String direccion,double superficie,double costo)
	{
		this.direccion = direccion;
		this.superficie = superficie;
		this.costo_m2 = costo;
	}
	
	@Override
	public double liquidez() {
		return 0.2;
	}

	@Override
	public double valor() {
		return this.superficie * this.costo_m2;
	}

}
