package ar.edu.info.unlp.ejercicioDemo;

public class Efectivo implements FormaDePago{

	@Override
	public double calcularExtraPago(double costoProducto)
	{
		return costoProducto * 0;
	}
}
