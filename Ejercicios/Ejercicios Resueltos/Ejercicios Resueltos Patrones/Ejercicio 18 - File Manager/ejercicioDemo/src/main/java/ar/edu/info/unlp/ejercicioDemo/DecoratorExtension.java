package ar.edu.info.unlp.ejercicioDemo;

public class DecoratorExtension extends FileDecorator{

	public DecoratorExtension(FileComponent component) {
		super(component);
	}

	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " - " + this.getExtension();
	}
}
