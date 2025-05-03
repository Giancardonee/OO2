package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;

public class Computadora {
	private List<Componente> componentes; 

	public Computadora ()
	{
		this.componentes = new LinkedList<Componente>();
	}
	
	public void agregarComponente (Componente componente)
	{
		this.componentes.add(componente);
	}
	
	public double calcularConsumo()
	{
		return this.componentes.stream()
				.mapToDouble(componente -> componente.getConsumo())
				.sum();
	}
	
	public double calcularPrecio ()
	{
		double precioComponentes =  this.componentes.stream()
				.mapToDouble(componente -> componente.getPrecio())
				.sum(); 
		
		return precioComponentes + this.impuestoIVA(precioComponentes);
	}
	
	private double impuestoIVA(double precioComponentes)
	{
		return precioComponentes * 0.21;
	}
	
}
