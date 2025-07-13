package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class SinPromocion extends Promocion{

    @Override
    public double calcularDescuentoPromocion(List<Seguro> polizas) {
        return 0;
    }
    
}
