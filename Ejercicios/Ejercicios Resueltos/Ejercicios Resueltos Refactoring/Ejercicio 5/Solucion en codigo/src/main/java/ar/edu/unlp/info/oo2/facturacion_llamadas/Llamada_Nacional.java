package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Llamada_Nacional extends Llamada {

	public Llamada_Nacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
	}

	@Override
	public double CalcularPrecio() {
		// el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
		return this.getDuracion() * 3 + (this.getDuracion() * 3 * 0.21);
	}

}
