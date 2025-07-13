package ar.edu.info.unlp.ejercicioDemo;
public abstract class Prestamo {
    private Cliente cliente;
    private EstadoPrestamo estado;
    protected double montoSolicitado;
    protected int cantidadCuotasSolicitadas; 
    protected int cantCuotasAbonadas; 
    protected double montoAbonado; 
    
    
    public Prestamo(Cliente cliente, double montoSolicitado, int cantidadCuotasSolicitadas)
    {
        this.cliente = cliente;
        this.montoSolicitado = montoSolicitado;
        this.cantidadCuotasSolicitadas = cantidadCuotasSolicitadas;
        this.cantCuotasAbonadas = 0; 
        this.montoAbonado = 0.0;
    }
    
    protected abstract double obtenerTasaInteres();
    protected abstract double calcularValorSellado();
    
    // primer Template Method
    public double calcularValorCuota()
    {
        return (this.montoSolicitado / this.cantidadCuotasSolicitadas) * this.obtenerTasaInteres();
    }
    
    // segundo template method
    public double calcularGastos()
    {
        return this.calcularValorAdministrativo() + this.calcularValorSellado();
    }
    
    public double calcularGastosCancelacion()
    {
        return this.estado.gastosCancelacion(this);
    }
    
    
    protected double calcularValorAdministrativo()
    {
        return this.calcularMontoRestante() * 0.10 ; 
    }
    
    public void incrementarCantidadCuotasAbonadas()
    {
        this.cantCuotasAbonadas++;
    }
    
    public void incrementarMontoCuota()
    {
        this.montoAbonado+= this.calcularValorCuota();
    }
    
    public void pagarCuota()
    {
        this.estado.pagarCuota(this);
    }
    
    public void setEstado(EstadoPrestamo estado)
    {
       this.estado = estado;
    }
    
    public Cliente getCliente()
    {
        return this.cliente;
    }
    
    public int getCuotasFaltantes()
    {
        return this.cantidadCuotasSolicitadas - this.cantCuotasAbonadas;
    }
    
    public double getMontoSolicitado()
    {
        return this.montoSolicitado;
    }
    
    public double getMontoPagado()
    {
        return this.montoAbonado;
    }
    
    public boolean abonoTodasLasCuotas()
    {
        return this.cantCuotasAbonadas == this.cantidadCuotasSolicitadas;
    }
    
    private double calcularMontoRestante()
    {
        return this.montoSolicitado - this.montoAbonado;
    }
               
    
}
