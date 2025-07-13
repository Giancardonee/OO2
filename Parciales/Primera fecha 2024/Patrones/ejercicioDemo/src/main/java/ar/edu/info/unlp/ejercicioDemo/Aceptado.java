package ar.edu.info.unlp.ejercicioDemo;
public class Aceptado extends EstadoPrestamo {

    @Override
    public void pagarCuota(Prestamo context) {
        context.pagarCuota();
        if (context.abonoTodasLasCuotas())
            context.setEstado(new Finalizado());
    }

    @Override
    public double gastosCancelacion(Prestamo context) {
       return context.calcularGastos();
    }
    
}
