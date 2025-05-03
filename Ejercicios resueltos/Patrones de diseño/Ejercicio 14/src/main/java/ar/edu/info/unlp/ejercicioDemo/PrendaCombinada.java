package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;


public class PrendaCombinada extends Prenda{
	List<Prenda> prendas; 

	public PrendaCombinada()
	{
		this.prendas = new LinkedList<Prenda>();
	}
	
	public PrendaCombinada(List<Prenda> prendas)
	{
		this.prendas = prendas;
	}
	
	public void agregarPrenda(Prenda prenda)
	{
		this.prendas.add(prenda); 
	}
	
	@Override
	public double liquidez() {
		return 0.5;
	}

	@Override
	public double valor() {
		return this.prendas.stream()
				.mapToDouble(prenda -> prenda.valor())
				.sum();
	}

}
