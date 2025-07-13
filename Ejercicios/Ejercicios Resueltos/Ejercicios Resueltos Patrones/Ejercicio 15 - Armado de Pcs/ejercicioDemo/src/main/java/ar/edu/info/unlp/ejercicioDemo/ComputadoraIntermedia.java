package ar.edu.info.unlp.ejercicioDemo;

public class ComputadoraIntermedia extends ComputadoraBuilder {

	public ComputadoraIntermedia(Catalogo catalogo) {
		super(catalogo);
	}

	@Override
	public void agregarProcesador() {
		this.computadora.agregarComponente(this.catalogo.getComponente("Procesador Intermedio"));	
	}

	@Override
	public void agregarMemoriaRAM() {
		this.computadora.agregarComponente(this.catalogo.getComponente("16 GB"));	
	}

	@Override
	public void agregarDisco() {
		this.computadora.agregarComponente(this.catalogo.getComponente("SSD 500 GB"));	
	}

	@Override
	public void agregarTarjetaGrafica() {
		this.computadora.agregarComponente(this.catalogo.getComponente("GTX 1650"));	
	}

	@Override
	public void agregarGabinete() {
		this.computadora.agregarComponente(this.catalogo.getComponente("Gabinete Intermedio"));	
		this.computadora.agregarComponente(this.catalogo.getComponente("Fuente 800 W"));	
	}

}
