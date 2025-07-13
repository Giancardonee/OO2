package ar.edu.info.unlp.ejercicioDemo;

public class Inicial implements EstadoCalculadora {

	@Override
	public String getResultado(Calculadora calculadora) {
		return String.valueOf(calculadora.getValorAcumulado());
	}

	@Override
	public void borrar(Calculadora calculadora) {
		calculadora.borrar();
	}

	@Override
	public void setValor(double unValor, Calculadora calculadora) {
		calculadora.setValorAcumulado(unValor);
		// puede sguir en inicial o en estado operando...? 
	}

	@Override
	public void mas(Calculadora calculadora) {
		calculadora.setEstado(new Suma());
	}

	@Override
	public void menos(Calculadora calculadora) {
		calculadora.setEstado(new Resta());
	}

	@Override
	public void por(Calculadora calculadora) {
		calculadora.setEstado(new Multiplicacion());
	}

	@Override
	public void dividido(Calculadora calculadora) {
		calculadora.setEstado(new Division());
	}

}
