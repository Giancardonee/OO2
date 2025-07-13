package ar.edu.info.unlp.ejercicioDemo;
public class SandwichVegetariano extends SandwichBuilder {
    
     @Override
    public void construirPan() {
        this.getSandwich().setNombrePan("Pan con semillas");
        this.getSandwich().setPrecioPan(120);
    }

    @Override
    public void construirAderezo() {
        this.getSandwich().setNombreAderezo("Sin aderezo");
        this.getSandwich().setPrecioAderezo(0);
    }

    @Override
    public void construirPrincipal() {
        this.getSandwich().setNombrePrincipal("Provoleta grillada");
        this.getSandwich().setPrecioPrincipal(200);
    }

    @Override
    public void construirAdicional() {
        this.getSandwich().setNombreAdicional("Berenjenas al escabeche");
        this.getSandwich().setPrecioAdicional(100);
    }
}
