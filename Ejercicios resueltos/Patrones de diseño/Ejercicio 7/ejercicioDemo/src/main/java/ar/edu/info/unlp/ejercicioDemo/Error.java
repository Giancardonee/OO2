package ar.edu.info.unlp.ejercicioDemo;

public class Error implements EstadoCalculadora {

	@Override
	public String getResultado(Calculadora calculadora) {
		return "Error.";
	}

	@Override
	public void borrar(Calculadora calculadora) {
		calculadora.borrar();
	}

	@Override
	public void setValor(double unValor, Calculadora calculadora) {
		// no hace nada... 
	}

	@Override
	public void mas(Calculadora calculadora) {
		// no hace nada... 
	}

	@Override
	public void menos(Calculadora calculadora) {
		// no hace nada... 
	}

	@Override
	public void por(Calculadora calculadora) {
		// no hace nada... 
	}

	@Override
	public void dividido(Calculadora calculadora) {
		// no hace nada... 
	}

}
