package com.mycompany.facultad;
public class Basico extends EstrategiaRenta{
    @Override
    public double calcularPrecio(Vehiculo vehiculo, int kmInicial, int diasRenta)
    {
        int kilometrosRecorridos = vehiculo.calcularKmRecorridos(kmInicial); 
        double precio = this.calcularCostoSegunDiasRentados(diasRenta,vehiculo.getPrecioPorDia())
            + this.calcularCostoSegunKM(kilometrosRecorridos,vehiculo.getPrecioPorKm());

        
        // Como ultimo refactoring , si tenemos ganas aca podemos hacer un Extract Method
        // para calcular el descuento
        double adicional = 1; 
        if (vehiculo.getAntiguedad() > 5) {adicional = 0.85;}

        return precio * adicional;
    }
}
