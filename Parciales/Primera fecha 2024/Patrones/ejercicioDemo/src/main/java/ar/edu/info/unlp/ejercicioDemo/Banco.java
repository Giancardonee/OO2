package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;

public class Banco {
    private double tasa_interes;
    private List<Cliente> clientes;
    private List<Prestamo> prestamos;
    
    public Banco ()
    {
        this.clientes = new LinkedList<>();
        this.prestamos = new LinkedList<>();
    }
    
    public void agregarCliente (Cliente unCliente)
    {
        this.clientes.add(unCliente);
    }
    
    public void solicitarPrestamoSimple(Cliente cliente, double montoSolicitado, int cuotasSolicitadas)
    {
        this.prestamos.add(new PrestamoSimple(cliente, montoSolicitado, cuotasSolicitadas, tasa_interes));
    }
    
    public void solicitarPrestamoUVA(Cliente cliente, double montoSolicitado, int cuotasSolicitadas)
    {
        this.prestamos.add(new PrestamoUVA(cliente, montoSolicitado, cuotasSolicitadas));
    }
    
    public void agregarPrestamo(Prestamo unPrestamo)
    {
        this.setearEstadoInicialPrestamo(unPrestamo);
        this.prestamos.add(unPrestamo);
    }
    
    private void setearEstadoInicialPrestamo(Prestamo unPrestamo)
    {    
        if (unPrestamo.getCliente().getSalarioMensual() * 0.30 <= unPrestamo.getMontoSolicitado())
        {
            unPrestamo.setEstado(new Aceptado());
        }
        else unPrestamo.setEstado(new Rechazado());
    }
}


