package ar.edu.info.unlp.ejercicioDemo;


public class TodoRiesgo extends Seguro{

    public TodoRiesgo(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public double calcularSeguroVida() {
       
        return 9000 * this.vehiculo.getAnhosAntiguedad();
    }

    @Override
    public double calcularCoberturaTerceros() {
       return 100000 / this.vehiculo.getDuenho().getEdad();
    }
    
    @Override 
    public double calcularCoberturaPropia ()
    {
        return super.calcularCoberturaPropia() + 1000 * this.vehiculo.getAnhosAntiguedad();
    }
}
