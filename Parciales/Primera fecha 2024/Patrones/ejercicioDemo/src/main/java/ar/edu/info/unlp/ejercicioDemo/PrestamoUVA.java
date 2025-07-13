package ar.edu.info.unlp.ejercicioDemo;
public class PrestamoUVA extends Prestamo{

    public PrestamoUVA(Cliente cliente, double montoSolicitado, int cantidadCuotasSolicitadas)
    {
        super(cliente,montoSolicitado,cantidadCuotasSolicitadas);
    }
    
    @Override
    public double obtenerTasaInteres() {
        //return Indec.getIndiceInflacion(); // Esta linea es valida, lo que pasa que no tenemos la clase Indec
        
   
        return 0.3; // Esta linea es para testear nada mas, y que no tire error en compilacion
    }

    @Override
    protected double calcularValorSellado() {
       return 0;
    }
}
