package ar.edu.info.unlp.ejercicioDemo;

public class SandwichSinTACC extends SandwichBuilder {

    @Override
    public void construirPan() {
        this.getSandwich().setNombrePan("Pan de chipá");
        this.getSandwich().setPrecioPan(150);
    }

    @Override
    public void construirAderezo() {
        this.getSandwich().setNombreAderezo("Salsa tártara");
        this.getSandwich().setPrecioAderezo(18);
    }

    @Override
    public void construirPrincipal() {
        this.getSandwich().setNombrePrincipal("Carne de pollo");
        this.getSandwich().setPrecioPrincipal(250);
    }

    @Override
    public void construirAdicional() {
        this.getSandwich().setNombreAdicional("Verduras grilladas");
        this.getSandwich().setPrecioAdicional(200);
    }

}
