package ar.edu.info.unlp.ejercicioDemo;


public class TercerosCompleto extends Seguro{

    public TercerosCompleto(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public double calcularSeguroVida() {
        return 5000 * this.vehiculo.getCapacidadMaxima();
    }

    @Override
    public double calcularCoberturaTerceros() 
    {
       int antiguedad = this.vehiculo.getAnhosAntiguedad();
       return antiguedad > 4 ? antiguedad * 4000 : antiguedad * 10000;
    }
    
    @Override
    public double calcularCoberturaPropia ()
    {
        return super.calcularCoberturaPropia() + 10000;
    }
    
}
