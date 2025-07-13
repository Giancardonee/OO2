package ar.edu.info.unlp.ejercicioDemo;

public class Componente {
	private String nombre;
	private String descripcion;
	private double precio;
	private double consumo;
	
	public Componente(String nombre, String descripcion, double precio, double consumo)
	{
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.consumo = consumo;
	}

	public double getPrecio ()
	{
		return this.precio;
	}
	
	public double getConsumo ()
	{
		return this.consumo;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public String getDescripcion()
	{
		return this.descripcion;
	}
}
