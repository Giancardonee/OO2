/*
    Se le descuenta el 50% del seguro mas economico. 
 */
package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class CampañaExcepcional extends Promocion{

    @Override
    public double calcularDescuentoPromocion(List<Seguro> polizas) {
        double seguroMasEconomico = polizas.stream()
            .mapToDouble(s -> s.calcularPrecioSeguro())
            .min()
            .orElse(0.0); 
        return seguroMasEconomico * 0.5;
    }
    
}
