package ar.edu.info.unlp.ejercicioDemo;
// Rol <concreteBuilder>
public class ComputadoraBasica extends ComputadoraBuilder{

    @Override
    protected void agregarProcesador() {
        this.presupuesto.agregarComponente(Catalogo.getComponente("Procesador Basico"));
    }

    @Override
    protected void agregarRam() {
         this.presupuesto.agregarComponente(Catalogo.getComponente("8 GB"));
    }

    @Override
    protected void agregarDisco() {
         this.presupuesto.agregarComponente(Catalogo.getComponente("HDD 500 GB"));
    }

    @Override
    protected void agregarTarjetaGrafica() {
        // no posee....
    }

    @Override
    protected void agregarGabinete() {
        this.presupuesto.agregarComponente(Catalogo.getComponente("Gabinete Estandar"));
    }
}
