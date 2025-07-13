package ar.edu.info.unlp.ejercicioDemo;
public class SandwichVegano extends SandwichBuilder {
    
    @Override
    public void construirPan() {
        this.getSandwich().setNombrePan("Pan integral");
        this.getSandwich().setPrecioPan(100);
    }

    @Override
    public void construirAderezo() {
        this.getSandwich().setNombreAderezo("Salsa criolla");
        this.getSandwich().setPrecioAderezo(20);
    }

    @Override
    public void construirPrincipal() {
        this.getSandwich().setNombrePrincipal("Milanesa de girgolas");
        this.getSandwich().setPrecioPrincipal(500);
    }

    @Override
    public void construirAdicional() {
        this.getSandwich().setNombreAdicional("Sin adicional");
        this.getSandwich().setPrecioAdicional(0);
    }
}
