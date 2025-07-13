package ar.edu.info.unlp.ejercicioDemo;
public class Finalizado extends EstadoPrestamo {

    @Override
    public void pagarCuota(Prestamo context) {
         throw new Error("error");
    }

    @Override
    public double gastosCancelacion(Prestamo context) {
        return 0;
    }
    
}
