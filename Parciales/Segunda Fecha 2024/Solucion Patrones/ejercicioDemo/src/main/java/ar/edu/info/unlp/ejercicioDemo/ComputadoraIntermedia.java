package ar.edu.info.unlp.ejercicioDemo;
// Rol <concreteBuilder>
public class ComputadoraIntermedia extends ComputadoraBuilder {

    @Override
    protected void agregarProcesador() {
        this.presupuesto.agregarComponente(Catalogo.getComponente("Procesador Intermedio"));
    }

    @Override
    protected void agregarRam() {
         this.presupuesto.agregarComponente(Catalogo.getComponente("16 GB"));
    }

    @Override
    protected void agregarDisco() {
         this.presupuesto.agregarComponente(Catalogo.getComponente("SSD 500 GB"));
    }

    @Override
    protected void agregarTarjetaGrafica() {
         this.presupuesto.agregarComponente(Catalogo.getComponente("GTX 1650"));
    }

    @Override
    protected void agregarGabinete() {
         this.presupuesto.agregarComponente(Catalogo.getComponente("Gabinete Intermedio"));
          this.presupuesto.agregarComponente(Catalogo.getComponente("Fuente 800 w"));
    }
}
