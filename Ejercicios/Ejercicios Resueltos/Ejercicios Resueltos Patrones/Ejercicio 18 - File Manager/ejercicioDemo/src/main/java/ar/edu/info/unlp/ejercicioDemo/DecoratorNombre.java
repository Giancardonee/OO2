package ar.edu.info.unlp.ejercicioDemo;


public class DecoratorNombre extends FileDecorator{

	public DecoratorNombre(FileComponent component) {
		super(component);
	}

	@Override 
	public String prettyPrint()
	{
		 return this.getNombre() + " - " + super.prettyPrint(); 
	}
}
