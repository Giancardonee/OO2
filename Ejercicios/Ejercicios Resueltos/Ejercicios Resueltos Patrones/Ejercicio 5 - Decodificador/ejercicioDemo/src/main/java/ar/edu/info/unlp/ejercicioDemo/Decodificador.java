package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;

public class Decodificador {
	private List<Pelicula> peliculasGrilla;
	private List<Pelicula> peliculasReproducidas;
	private EstrategiaSugerirPelicula estrategiaParaSugerir; 
	
	public Decodificador (List<Pelicula> peliculasGrilla, EstrategiaSugerirPelicula estrategia)
	{
		this.peliculasGrilla = peliculasGrilla;
		this.estrategiaParaSugerir = estrategia; 
		this.peliculasReproducidas = new LinkedList<>();
	}
	
	public List<Pelicula> sugerirPelicula ()
	{
		return this.estrategiaParaSugerir.sugerirPelicula();
	}

	public void reproducirPelicula(Pelicula pelicula)
	{
		if (!this.peliculasReproducidas.contains(pelicula)) this.peliculasReproducidas.add(pelicula); 
	}
	
	public void cambiarEstrategia(EstrategiaSugerirPelicula nuevaEstrategia)
	{
		nuevaEstrategia.setContext(this);
		this.estrategiaParaSugerir = nuevaEstrategia;
	}
	
	public List<Pelicula> getPeliculasGrilla()
	{
		return this.peliculasGrilla;
	}
	
	public List<Pelicula> getPeliculasReproducidas()
	{
		return this.peliculasReproducidas;
	}	
}
