package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private GeneradorLinea strategyGenerador;

	public GestorNumerosDisponibles ()
	{
		this.strategyGenerador = new GeneradorUltimo();
	}
	
	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		return this.strategyGenerador.obtenerNumero(lineas);
	}

	public void cambiarTipoGenerador(String valor) {
		if (valor.equals("primero"))
		{
			this.strategyGenerador = new GeneradorPrimero();
		}
		else if (valor.equals("ultimo"))
		{
			this.strategyGenerador = new GeneradorUltimo();
		}
		else if (valor.equals("random"))
		{
			this.strategyGenerador = new GeneradorRandom();
		}
		
	}
}
