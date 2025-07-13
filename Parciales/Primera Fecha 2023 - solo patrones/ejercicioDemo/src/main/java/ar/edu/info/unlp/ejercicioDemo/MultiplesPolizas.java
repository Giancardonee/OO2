/*
    Se descuenta al asegurado un 10% a cada uno de los seguros contratados
    Nota: El asegurado debe tener al menos 2 polizas.
 */
package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class MultiplesPolizas extends Promocion{

    @Override
    public double calcularDescuentoPromocion(List<Seguro> polizas) {
        if (polizas.size() >=2) // Si tiene al menos dos polizas se le hace descuento...
        {
            double costoPolizas = polizas.stream()
                .mapToDouble( poliza -> poliza.calcularPrecioSeguro())
                .sum() ;
        return costoPolizas * 0.10;
        }
        else return 0; 
    }
}
