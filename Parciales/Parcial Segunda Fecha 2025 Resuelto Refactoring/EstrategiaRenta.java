package com.mycompany.facultad;
public abstract class EstrategiaRenta {
    protected double calcularCostoSegunDiasRentados(int diasRentados, double costoPorDia)
    {    return diasRentados * costoPorDia; }

    protected double calcularCostoSegunKM(int kmRecorridos, double precioPorKm)
    { return kmRecorridos * precioPorKm ;}

    public abstract double calcularPrecio(Vehiculo vehiculo, int kmInicial, int diasRenta); 
}
