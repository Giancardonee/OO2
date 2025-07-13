package ar.edu.info.unlp.ejercicioDemo;

// Component
public abstract class Prenda {
    
    // Template Method
    public double calcularValorPrendario()
    {
        return this.getLiquidez() * this.calcularValor();
    }
    
    protected abstract double  getLiquidez();
    protected abstract double calcularValor(); 
}
