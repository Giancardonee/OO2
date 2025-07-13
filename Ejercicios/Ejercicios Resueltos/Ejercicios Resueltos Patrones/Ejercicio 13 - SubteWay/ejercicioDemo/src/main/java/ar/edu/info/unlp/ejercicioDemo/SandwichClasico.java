package ar.edu.info.unlp.ejercicioDemo;

public class SandwichClasico extends SandwichBuilder{

	@Override
	public void construirPan() {
		this.sandwich.setPan("brioche", 100);
		
	}

	@Override
	public void construirPrincipal() {
		this.sandwich.setPrincipal("carne de ternera", 300);
	}

	@Override
	public void construirAderezo() {
		this.sandwich.setAderezo("mayonesa", 20);
	}

	@Override
	public void construirAdicional() {
		this.sandwich.setAdicional("tomate", 80);
	}

}
