package ar.edu.info.unlp.ejercicioDemo;

public class SandwichVegetariano extends SandwichBuilder {

	@Override
    public void construirPan() {
        this.sandwich.setPan("pan con semillas", 120);
    }

    @Override
    public void construirPrincipal() {
        this.sandwich.setPrincipal("provoleta grillada", 200);
    }

    @Override
    public void construirAderezo() {
        this.sandwich.setAderezo("sin aderezo", 0);
    }

    @Override
    public void construirAdicional() {
        this.sandwich.setAdicional("berenjenas al escabeche", 100);
    }
    
}
