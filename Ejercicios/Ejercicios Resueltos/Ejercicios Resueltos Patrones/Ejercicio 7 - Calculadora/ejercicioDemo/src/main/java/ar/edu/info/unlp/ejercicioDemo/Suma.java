package ar.edu.info.unlp.ejercicioDemo;

public class Suma extends Operando{

	@Override
    protected double operar(double acumulado, double nuevoValor) {
        return acumulado + nuevoValor;
	}
}
