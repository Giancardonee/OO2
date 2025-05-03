package ar.edu.info.unlp.ejercicioDemo;

public class DecoratorFechaCreacion extends FileDecorator {
	
	public DecoratorFechaCreacion(FileComponent component) {
		super(component);
	}
	
	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " - " + this.getFechaCreacion().toString();
	}
	
}
