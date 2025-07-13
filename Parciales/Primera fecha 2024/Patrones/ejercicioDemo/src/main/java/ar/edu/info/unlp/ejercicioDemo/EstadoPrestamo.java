package ar.edu.info.unlp.ejercicioDemo;
public abstract class EstadoPrestamo {
   
    public abstract void pagarCuota(Prestamo context);
    public abstract double gastosCancelacion(Prestamo context); 
    
    // Se repite para todos los prestamos y estados
    public double montoRestante(Prestamo context)
    {
        return context.calcularValorCuota() * context.getCuotasFaltantes();
    }
    
    // Se repite para todos los prestamos y estados
    public double montoPagado(Prestamo context)
    {
       return context.getMontoPagado();    
    }
}
