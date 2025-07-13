package ar.edu.info.unlp.ejercicioDemo;

// Rol <AbstractBuilder>
public abstract class ComputadoraBuilder {
    protected Presupuesto presupuesto;
    
    public ComputadoraBuilder()
    {
        this.presupuesto = new Presupuesto();
    }
   
    protected abstract void agregarProcesador();
    protected abstract void agregarRam();
    protected abstract void agregarDisco();
    protected abstract void agregarTarjetaGrafica();
    protected abstract void agregarGabinete();
    
    public Presupuesto getPresupuesto()
    {
        return this.presupuesto;
    } 
}
