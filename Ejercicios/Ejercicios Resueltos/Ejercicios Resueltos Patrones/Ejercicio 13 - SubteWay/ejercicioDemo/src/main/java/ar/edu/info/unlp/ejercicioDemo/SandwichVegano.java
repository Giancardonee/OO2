package ar.edu.info.unlp.ejercicioDemo;

public class SandwichVegano extends SandwichBuilder {

		@Override
	    public void construirPan() {
	        this.sandwich.setPan("integral", 100);
	    }

	    @Override
	    public void construirPrincipal() {
	        this.sandwich.setPrincipal("milanesa de girgolas", 500);
	    }

	    @Override
	    public void construirAderezo() {
	        this.sandwich.setAderezo("salsa criolla", 20);
	    }

	    @Override
	    public void construirAdicional() {
	        this.sandwich.setAdicional("sin adicional", 0);
	    }
}
