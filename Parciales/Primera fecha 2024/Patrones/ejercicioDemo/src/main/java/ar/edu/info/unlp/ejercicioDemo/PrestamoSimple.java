package ar.edu.info.unlp.ejercicioDemo;
public class PrestamoSimple extends Prestamo {
    private double tasa_interes;

    public PrestamoSimple(Cliente cliente, double montoSolicitado, int cantidadCuotasSolicitadas,double tasa_interes)
    {
        super(cliente,montoSolicitado,cantidadCuotasSolicitadas);
        this.tasa_interes = tasa_interes;   
    }
    
    @Override
    public double obtenerTasaInteres() {
        return this.tasa_interes;
    }

    @Override
    protected double calcularValorSellado() {
        return 5000;
    }
 
}
