package ar.edu.info.unlp.ejercicioDemo;

public class ComputadoraAvanzada extends ComputadoraBuilder {

	public ComputadoraAvanzada(Catalogo catalogo) {
		super(catalogo);
	}

	@Override
	public void agregarProcesador() {
		this.computadora.agregarComponente(this.catalogo.getComponente("Procesador Gamer"));
		this.computadora.agregarComponente(this.catalogo.getComponente("Pad Termico"));	
		this.computadora.agregarComponente(this.catalogo.getComponente("Cooler"));	
	}

	@Override
	public void agregarMemoriaRAM() {
		// El dual channel pa 
		this.computadora.agregarComponente(this.catalogo.getComponente("32 GB"));	
		this.computadora.agregarComponente(this.catalogo.getComponente("32 GB"));	
	}

	@Override
	public void agregarDisco() {
		this.computadora.agregarComponente(this.catalogo.getComponente("SSD 500 GB"));	
		this.computadora.agregarComponente(this.catalogo.getComponente("SSD 1 TB"));	
	}

	@Override
	public void agregarTarjetaGrafica() {
		this.computadora.agregarComponente(this.catalogo.getComponente("RTX 4090"));	
	}

	@Override
	public void agregarGabinete() {
		this.computadora.agregarComponente(this.catalogo.getComponente("Gabinete Gamer"));	
		this.agregarFuenteNecesaria();
	}

	private void agregarFuenteNecesaria ()
	{
		double consumoComponentes = this.computadora.calcularConsumo();
		double consumoFuente = this.calcularConsumoFuente(consumoComponentes);
		this.computadora.agregarComponente(this.catalogo.getComponente("Fuente "+consumoFuente+" w"));	
	}
	
	private double calcularConsumoFuente (double consumoComponentes)
	{
		return consumoComponentes * 1.5;
	}
}
