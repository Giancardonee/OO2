package ar.edu.info.unlp.ejercicioDemo;
public class EmpleadoTemporario extends Empleado {
    private int hsTrabajadas;
    private boolean estaCasado;
    private int cantHijos;
    
    
    public EmpleadoTemporario(int cantHsTrabajadas, boolean esCasado, int cantHijos)
    {
        this.hsTrabajadas = cantHsTrabajadas;
        this.estaCasado = esCasado;
        this.cantHijos = cantHijos;
    }
    
    @Override
    protected double calcularBasico() {
        return 20000 + this.calcularMontoSegunHsTrabajadas(300);
    }

    @Override
    protected double calcularAdicional() {
        double montoAdd = 0;
        if (this.estaCasado) montoAdd+= 5000;
        
        montoAdd+= 2000 * this.cantHijos;
        return montoAdd;
    }
    
    private double calcularMontoSegunHsTrabajadas(double precioHora)
    {
        return this.hsTrabajadas * precioHora;
    }
}
