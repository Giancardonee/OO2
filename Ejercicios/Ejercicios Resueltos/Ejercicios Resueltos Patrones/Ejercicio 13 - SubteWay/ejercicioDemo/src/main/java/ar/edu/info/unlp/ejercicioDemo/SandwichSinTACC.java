package ar.edu.info.unlp.ejercicioDemo;

public class SandwichSinTACC extends SandwichBuilder{

    @Override
    public void construirPan() {
        this.sandwich.setPan("pan de chipá", 150);
    }

    @Override
    public void construirPrincipal() {
        this.sandwich.setPrincipal("carne de pollo", 250);
    }

    @Override
    public void construirAderezo() {
        this.sandwich.setAderezo("salsa tártara", 18);
    }

    @Override
    public void construirAdicional() {
        this.sandwich.setAdicional("verduras grilladas", 200);
    }
}
