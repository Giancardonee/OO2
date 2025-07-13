package ar.edu.info.unlp.ejercicioDemo;

public class DecoratorFechaModificacion extends FileDecorator {

	public DecoratorFechaModificacion(FileComponent component) {
		super(component);
	}

	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " - " + this.getFechaModificacion().toString();
	}
}
