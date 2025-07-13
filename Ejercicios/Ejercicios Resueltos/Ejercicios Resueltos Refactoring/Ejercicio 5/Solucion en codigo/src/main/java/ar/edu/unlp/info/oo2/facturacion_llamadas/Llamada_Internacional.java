package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Llamada_Internacional extends Llamada {

	public Llamada_Internacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalcularPrecio() {
		// el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
		return this.getDuracion() * 150 + (this.getDuracion() * 150 * 0.21) + 50;
	}

}

