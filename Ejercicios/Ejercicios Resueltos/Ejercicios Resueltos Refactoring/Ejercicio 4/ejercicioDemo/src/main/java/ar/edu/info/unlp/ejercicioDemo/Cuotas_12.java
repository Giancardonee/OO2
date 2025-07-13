package ar.edu.info.unlp.ejercicioDemo;

public class Cuotas_12 implements FormaDePago {

	@Override
	public double calcularExtraPago(double costoProducto)
	{
		return costoProducto * 0.5;
	}
}
