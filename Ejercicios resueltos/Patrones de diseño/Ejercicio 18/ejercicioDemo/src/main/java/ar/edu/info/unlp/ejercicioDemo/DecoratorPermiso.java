package ar.edu.info.unlp.ejercicioDemo;



public class DecoratorPermiso extends FileDecorator {
	
	public DecoratorPermiso(FileComponent component) {
		super(component);
	}

	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " - " + this.getPermisos();
	}
	
}
