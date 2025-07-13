package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class FileOO2 implements FileComponent {
	  private String nombre;
	  private String extension;
	  private int tam;
	  private LocalDate fechaCreacion;
	  private LocalDate fechaModificacion;
	  private String permisos;
	
	  public FileOO2(String nombre, String extension, int tam, 
              LocalDate fechaCreacion, LocalDate fechaModificacion, 
              String permisos) {
			   this.nombre = nombre;
			   this.extension = extension;
			   this.tam = tam;
			   this.fechaCreacion = fechaCreacion;
			   this.fechaModificacion = fechaModificacion;
			   this.permisos = permisos;
	  }
	  
	 public String getNombre() { return nombre; }
	 public String getExtension() { return extension; }
	 public int getTam() { return tam; }
	 public LocalDate getFechaCreacion() { return fechaCreacion; }
	 public LocalDate getFechaModificacion() { return fechaModificacion; }
	 public String getPermisos() { return permisos; } 
	
	 // Es responsabilidad de cada concretDecorator retornar un valor desde prettyPrint
	@Override
	public String prettyPrint() {
		return "";
	}
	
	

}
