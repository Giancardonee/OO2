package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class FileDecorator implements FileComponent{
	protected FileComponent component;
	
	public FileDecorator (FileComponent component)
	{
		this.component = component;
	}
	
	public String prettyPrint() {return this.component.prettyPrint();}
	
	// Va haciendo el pasamanos del get hasta llegar a la clase FileOO2. 
    public String getNombre() { return component.getNombre(); }
    public String getExtension() { return component.getExtension(); }
    public int getTam() { return component.getTam(); }
    public LocalDate getFechaCreacion() { return component.getFechaCreacion(); }
    public LocalDate getFechaModificacion() { return component.getFechaModificacion(); }
    public String getPermisos() { return component.getPermisos(); }
    
    protected FileComponent getComponent() {return this.component;}
}
