package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;

public abstract class ComputadoraBuilder {
	protected Computadora computadora;
	protected Catalogo catalogo;
	
	public ComputadoraBuilder (Catalogo catalogo)
	{
		this.catalogo = catalogo;
		this.computadora = new Computadora();
	}
	
	
	public abstract void agregarProcesador(); 
	public abstract void agregarMemoriaRAM();
	public abstract void agregarDisco();
	public abstract void agregarTarjetaGrafica();
	public abstract void agregarGabinete();
	
	
	// Como no tenemos director, el builder se encarga de devolver la computadora
	// Por lo tanto, se estaria aplicando el patronTemplate Method 
	public Computadora crearPresupuesto()
	{
		this.agregarProcesador();
		this.agregarMemoriaRAM();
		this.agregarDisco();
		this.agregarTarjetaGrafica();
		this.agregarGabinete();
		
		return this.computadora;
	}
	
}
