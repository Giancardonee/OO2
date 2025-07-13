package ar.edu.info.unlp.ejercicioDemo;
// Rol <concreteBuilder>
public class ComputadoraAvanzada extends ComputadoraBuilder{

    @Override
    protected void agregarProcesador() {
         this.presupuesto.agregarComponente(Catalogo.getComponente("Procesador Gamer"));
          this.presupuesto.agregarComponente(Catalogo.getComponente("Pad Termico"));
           this.presupuesto.agregarComponente(Catalogo.getComponente("Cooler"));
    }

    @Override
    protected void agregarRam() {
         this.presupuesto.agregarComponente(Catalogo.getComponente("32 GB"));
         this.presupuesto.agregarComponente(Catalogo.getComponente("32 GB"));
    }

    @Override
    protected void agregarDisco() {
        this.presupuesto.agregarComponente(Catalogo.getComponente("SSD 500 GB"));
        this.presupuesto.agregarComponente(Catalogo.getComponente("SSD 1 TB"));
    }

    @Override
    protected void agregarTarjetaGrafica() {
        this.presupuesto.agregarComponente(Catalogo.getComponente("RTX 4090"));
    }

    @Override
    protected void agregarGabinete() {
       this.presupuesto.agregarComponente(Catalogo.getComponente("Gabinete Gamer"));
       double consumoFuente = this.calcularConsumoFuente();
       this.presupuesto.agregarComponente(Catalogo.getComponente("Fuente " + consumoFuente + " w"));
    }
    
    private double calcularConsumoFuente()
    {
        return this.presupuesto.calcularConsumo() * 1.5; 
    }
}
