package ar.edu.info.unlp.ejercicioDemo;

public class ComputadoraBasica extends ComputadoraBuilder{

	public ComputadoraBasica(Catalogo catalogo) {
		super(catalogo);
	}

	@Override
	public void agregarProcesador() {
		this.computadora.agregarComponente(this.catalogo.getComponente("Procesador Basico"));
	}

	@Override
	public void agregarMemoriaRAM() {
		this.computadora.agregarComponente(this.catalogo.getComponente("8 GB"));
	}

	@Override
	public void agregarDisco() {
		this.computadora.agregarComponente(this.catalogo.getComponente("HHD 500 GB"));	
	}

	@Override
	public void agregarTarjetaGrafica() {
		// no posee, no hace nada este metodo. 
	}

	@Override
	public void agregarGabinete() {
		this.computadora.agregarComponente(this.catalogo.getComponente("Gabinete Estandar"));
	}
	
}
