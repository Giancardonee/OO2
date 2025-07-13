package com.mycompany.facultad;
public class Plus extends EstrategiaRenta{

    @Override
    public double calcularPrecio(Vehiculo vehiculo, int kmInicial, int diasRenta)
    {
        int kmRecorridos = vehiculo.calcularKmRecorridos(kmInicial);
        return calcularCostoSegunKM(kmRecorridos,vehiculo.getPrecioPorKm());
    }
}
