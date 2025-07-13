package ar.edu.info.unlp.ejercicioDemo;
public class ContraTerceros extends Seguro{

    public ContraTerceros(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public double calcularSeguroVida() {
       return 100 * this.getVehiculo().getDuenho().getEdad();
    }

    @Override
    public double calcularCoberturaTerceros() {
       return 1000 + (this.getVehiculo().getPrecio() * 0.01);
    }
    
}
