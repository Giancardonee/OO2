package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public interface FileComponent {
	
	  public  String prettyPrint(); 
	  public  String getNombre();
	  public  String getExtension();
	  public  int getTam();
	  public  LocalDate getFechaCreacion();
	  public  LocalDate getFechaModificacion();
	  public  String getPermisos();
}
