package com.mycompany.facultad;
public class KilometrajeLibre extends EstrategiaRenta{
    @Override
    public double calcularPrecio(Vehiculo vehiculo, int kmInicial, int diasRenta)
    {
        return this.calcularCostoSegunDiasRentados(diasRenta,vehiculo.getPrecioPorDia());
    }
}
