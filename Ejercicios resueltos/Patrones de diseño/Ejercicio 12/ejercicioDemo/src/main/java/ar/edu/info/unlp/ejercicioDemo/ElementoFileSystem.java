package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.List;

public abstract class ElementoFileSystem {
	private String nombre;
	private LocalDate fechaCreacion;
	
	public ElementoFileSystem(String nombre, LocalDate fechaCreacion)
	{
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	
	public abstract int getBytesOcupados();
	public abstract Archivo getArchivoMasGrande();
	public abstract Archivo getArchivoMasNuevo();
	public abstract ElementoFileSystem getElementoPorNombre(String nombre); 
	public abstract List<ElementoFileSystem> getTodosElementosPorNombre(String nombre);

	protected boolean coincideNombre(String nombreBuscado)
	{
		return this.nombre.equals(nombreBuscado);
	}
	
	
	public String listadoDeContenido(String pathPadre) {
	    return pathPadre + "/" + this.getNombre();
	}
	
	public LocalDate getFechaCreacion()
	{
		return this.fechaCreacion;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}

}
