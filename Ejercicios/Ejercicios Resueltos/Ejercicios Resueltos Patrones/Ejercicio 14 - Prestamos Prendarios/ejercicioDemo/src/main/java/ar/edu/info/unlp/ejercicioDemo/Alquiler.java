package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Alquiler extends Prenda{
    private LocalDate comienzoContrato;
    private LocalDate finContrato;
    private double costoMensual;
    
    public Alquiler(LocalDate comienzoContrato, LocalDate finContrato, double costoMensual)
    {
        this.comienzoContrato = comienzoContrato;
        this.finContrato = finContrato;
        this.costoMensual = costoMensual;
    }
    
    @Override
    protected double getLiquidez() {
       return 0.9;
    }

    @Override
    protected double calcularValor() {
        return this.getMesesFaltantesContrato() * this.costoMensual;
    }
    
    private int getMesesFaltantesContrato()
    {
        return (int) ChronoUnit.MONTHS.between(this.comienzoContrato, this.finContrato);
    }
    
}
