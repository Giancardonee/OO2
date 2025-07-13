package ar.edu.info.unlp.ejercicioDemo;

public class Division extends Operando{
	
	 @Override
	    public void setValor(double unValor, Calculadora calculadora) {
	        if (unValor == 0) {
	            calculadora.setEstado(new Error());
	        } else {
	        	super.setValor(unValor, calculadora);
	        }
	    }

	    @Override
	    protected double operar(double acumulado, double nuevoValor) {
	        return acumulado / nuevoValor;
	    }
}
