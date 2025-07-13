
package com.mycompany.facultad;

public class Renta {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int diasRenta;
    private EstrategiaRenta estrategiaRenta;
    private int kmInicial;

    public Renta (Vehiculo vehiculo, Cliente cliente, int diasRenta)
    {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.diasRenta = diasRenta;
        this.kmInicial = vehiculo.getKilometros();
        this.estrategiaRenta = new Basico(); 
    }

    public void setEstrategiaRenta(EstrategiaRenta estrategiaRenta)
    {
        this.estrategiaRenta = estrategiaRenta;
    }


    public double calcularTotal()
    {
       return this.estrategiaRenta.calcularPrecio(this.vehiculo, this.kmInicial,this.diasRenta); 
    }    
}
