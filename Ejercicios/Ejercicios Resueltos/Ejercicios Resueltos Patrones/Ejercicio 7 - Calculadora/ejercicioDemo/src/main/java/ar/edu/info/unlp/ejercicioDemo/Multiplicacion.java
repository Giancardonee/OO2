package ar.edu.info.unlp.ejercicioDemo;

public class Multiplicacion extends Operando{
	 @Override
	    protected double operar(double acumulado, double nuevoValor) {
	        return acumulado * nuevoValor;
	    }
}
