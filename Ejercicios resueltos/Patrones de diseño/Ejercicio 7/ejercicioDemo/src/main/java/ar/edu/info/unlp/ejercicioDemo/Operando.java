package ar.edu.info.unlp.ejercicioDemo;

public abstract class Operando implements EstadoCalculadora{
	
    // Método abstracto para que cada subclase defina su operación
    protected abstract double operar(double acumulado, double nuevoValor);
	
	@Override
    public String getResultado(Calculadora calculadora) {
        return String.valueOf(calculadora.getValorAcumulado());
    }

    @Override
    public void borrar(Calculadora calculadora) {
        calculadora.borrar(); //
    }

    @Override
    public void mas(Calculadora calculadora) {
    	this.cambiarHaciaEstadoError(calculadora);;
    }

    @Override
    public void menos(Calculadora calculadora) {
    	this.cambiarHaciaEstadoError(calculadora);
    }

    @Override
    public void por(Calculadora calculadora) {
    	this.cambiarHaciaEstadoError(calculadora);
    }

    @Override
    public void dividido(Calculadora calculadora) {
        this.cambiarHaciaEstadoError(calculadora);
    }

    private void cambiarHaciaEstadoError(Calculadora calculadora)
    {
    	calculadora.setEstado(new Error());
    }
    
    @Override
    public void setValor(double unValor, Calculadora calculadora) {
        double resultado = this.operar(calculadora.getValorAcumulado(), unValor);
        calculadora.setValorAcumulado(resultado);
        calculadora.setEstado(new Inicial()); 
    }

}
