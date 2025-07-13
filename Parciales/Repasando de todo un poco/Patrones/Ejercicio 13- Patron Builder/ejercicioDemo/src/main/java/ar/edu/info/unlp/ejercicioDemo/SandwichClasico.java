package ar.edu.info.unlp.ejercicioDemo;
public class SandwichClasico extends SandwichBuilder {

    @Override
    public void construirPan() {
        this.sandwich.setNombrePan("Brioche");
        this.sandwich.setPrecioPan(100);
    }

    @Override
    public void construirAderezo() {
      this.sandwich.setNombreAderezo("Mayonesa");
      this.sandwich.setPrecioAderezo(20);
    }

    @Override
    public void construirPrincipal() {
        this.sandwich.setNombrePrincipal("Carne de Ternera");
        this.sandwich.setPrecioPrincipal(300);
    }

    @Override
    public void construirAdicional() {
       this.sandwich.setNombreAdicional("Tomate");
       this.sandwich.setPrecioAdicional(80);
    }
    
}
