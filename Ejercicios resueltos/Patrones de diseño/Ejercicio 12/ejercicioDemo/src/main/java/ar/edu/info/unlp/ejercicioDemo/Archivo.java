package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Archivo extends ElementoFileSystem{
	
	private int bytesOcupados; 
	
	public Archivo(String nombre, LocalDate fechaCreacion, int bytesOcupados) {
		super(nombre, fechaCreacion);
		this.bytesOcupados = bytesOcupados;
	}

	@Override
	public int getBytesOcupados() {
		return this.bytesOcupados;
	}

	@Override
	public Archivo getArchivoMasGrande() {
		return this;
	}

	@Override
	public Archivo getArchivoMasNuevo() {
		return this;
	}

	
	@Override
	public ElementoFileSystem getElementoPorNombre(String nombre) {
		return this.coincideNombre(nombre) ? this : null;
	}

	@Override
	public List<ElementoFileSystem> getTodosElementosPorNombre(String nombre) {
		List<ElementoFileSystem> elementos = new LinkedList<>(); 
		if (this.coincideNombre(nombre))
		{
			elementos.add(this);
		}
		return elementos;
	}
	
}
