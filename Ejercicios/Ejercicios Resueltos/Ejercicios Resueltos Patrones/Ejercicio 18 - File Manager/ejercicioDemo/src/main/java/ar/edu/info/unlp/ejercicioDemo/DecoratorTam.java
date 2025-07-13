package ar.edu.info.unlp.ejercicioDemo;

public class DecoratorTam extends FileDecorator {

	public DecoratorTam(FileComponent component) {
		super(component);
	}

	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " - " + this.getTam();
	}
}
