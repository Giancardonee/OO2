package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Directorio extends ElementoFileSystem {
	private List<ElementoFileSystem> elementos; 
	
	
	public Directorio(String nombre, LocalDate fechaCreacion, List<ElementoFileSystem> elementos) {
		super(nombre, fechaCreacion);
		this.elementos = elementos;
	}

	@Override
	public int getBytesOcupados() {
		int bytesInicial = 32;
		return this.elementos.stream()
				.mapToInt(elemento -> elemento.getBytesOcupados())
				.sum() + bytesInicial; 
	}

	@Override
	public Archivo getArchivoMasGrande() {
		return this.elementos.stream()
				.map(elemento -> elemento.getArchivoMasGrande())
				.filter(elemento -> elemento != null)
				.max(Comparator.comparingInt(Archivo::getBytesOcupados))
	            .orElse(null);
	}
	
	@Override
	public Archivo getArchivoMasNuevo() {
	    return this.elementos.stream()
	    		.map(elemento -> elemento.getArchivoMasNuevo())
	    		.filter(elemento -> elemento != null)
	    		 .max(Comparator.comparing(Archivo::getFechaCreacion))
	             .orElse(null);
	}

	@Override
	public ElementoFileSystem getElementoPorNombre(String nombre)
	{
	    return this.buscarElementosPorNombre(nombre).stream()
	            .findFirst()
	            .orElse(null);
	}
	
	@Override
	public List<ElementoFileSystem> getTodosElementosPorNombre(String nombre)
	{
		return this.buscarElementosPorNombre(nombre);
	}

	private List<ElementoFileSystem> buscarElementosPorNombre(String nombre) {
		return Stream.concat(
	            this.coincideNombre(nombre) ? Stream.of(this) : Stream.empty(),
	            this.elementos.stream()
	                .flatMap(elemento -> elemento.getTodosElementosPorNombre(nombre).stream())
	        )
	        .collect(Collectors.toList());
	}
	
	@Override
	public String listadoDeContenido(String pathPadre) {
	    String pathActual = pathPadre + "/" + this.getNombre();
	    
	    return pathActual + "\n" +
	           this.elementos.stream()
	               .map(elemento -> elemento.listadoDeContenido(pathActual))
	               .collect(Collectors.joining("\n"));
	}


}
