package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int anhoEstreno;
	private double puntaje;
	
	private List<Pelicula> peliculasSimilares;
	
	public Pelicula (String titulo, int anhoEstreno, double puntaje)
	{
		this.peliculasSimilares = new LinkedList<>();
		this.titulo = titulo;
		this.anhoEstreno = anhoEstreno;
		this.puntaje = puntaje; 
	}
	
	
	public void agregarPeliculaSimilar(Pelicula peliculaSimilar)
	{
		if (!this.peliculasSimilares.contains(peliculaSimilar))
		{
			this.peliculasSimilares.add(peliculaSimilar);
			peliculaSimilar.agregarPeliculaSimilar(this); // relacion reciproca
		}
	}
	
	public List<Pelicula> getPeliculasSimilares ()
	{
		return this.peliculasSimilares;
	}
	
	public boolean esSimilar(Pelicula otraPelicula)
	{
		return this.peliculasSimilares.contains(otraPelicula); 
	}

	public int getAnhoEstreno()
	{
		return this.anhoEstreno;
	}
	
	public double getPuntaje ()
	{
		return this.puntaje;
	}
	
	public String getTitulo ()
	{
		return this.titulo;
	}
}
