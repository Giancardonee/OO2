package ar.edu.info.unlp.ejercicioDemo;
public class EmpleadoPlanta extends Empleado{
    private boolean estaCasado;
    private int cantHijos; 
    private int anhosAntiguedad;
    
    
    public EmpleadoPlanta(boolean esCasado, int cantHijos, int anhosAntiguedad)
    {
        this.estaCasado = esCasado;
        this.cantHijos = cantHijos;
        this.anhosAntiguedad = anhosAntiguedad;
    }
    
    @Override
    protected double calcularBasico() {
       return 50000;
    }

    @Override
    protected double calcularAdicional() {
        double montoAdd = 0; 
        
        if (this.estaCasado) montoAdd += 5000; 
        
        montoAdd+= (2000 * this.cantHijos) + (2000 * this.anhosAntiguedad);
        return montoAdd;
    } 
}
