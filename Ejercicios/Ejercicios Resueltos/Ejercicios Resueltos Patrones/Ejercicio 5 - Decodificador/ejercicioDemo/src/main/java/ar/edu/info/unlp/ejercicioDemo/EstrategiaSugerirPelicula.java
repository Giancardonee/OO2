package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public abstract class EstrategiaSugerirPelicula {   
	
	protected Decodificador context;
	private final int cantPeliculasSugeridas = 3; // para que sugiera solo 3 peliculas de la lista. 
	

	// Metodo Template - Template Method
	public  List<Pelicula> sugerirPelicula()
	{
		List<Pelicula> noReproducidas = this.filtrarPeliculasNoReproducidas(context.getPeliculasGrilla(),context.getPeliculasReproducidas()); 
		
		List<Pelicula> filtradas = this.aplicarCriterio(noReproducidas);
		
		return this.quedarseConLasPrimeras(filtradas);
	}
	
	// Este metodo me queda raro, porque en comun solo comparten las peliculas no reproducidas
	// mientras que las peliculas reproducidas la vamos a necesitar para sugerir por similaridad... 
	protected List<Pelicula> aplicarCriterio (List<Pelicula> peliculasNoReproducidas)
	{
		return this.obtenerPeliculasMasRecientes(peliculasNoReproducidas);
	}
	
	
	private List<Pelicula> filtrarPeliculasNoReproducidas(List<Pelicula> peliculasGrilla, List<Pelicula> peliculasReproducidas) {
        	return peliculasGrilla.stream()
        			.filter(peliculaActual -> !peliculasReproducidas.contains(peliculaActual))
        			.toList();
    }
	
	private List<Pelicula> obtenerPeliculasMasRecientes(List<Pelicula> peliculas)
	{
		return peliculas .stream()
		        .sorted((p1, p2) -> Integer.compare(p2.getAnhoEstreno(), p1.getAnhoEstreno()))
		        .toList();
	}
	
	// Devuelve la misma lista con las primeras 3 peliculas
	private List<Pelicula> quedarseConLasPrimeras(List<Pelicula> peliculas)
	{
		return peliculas.stream()
				.limit(cantPeliculasSugeridas)
				.toList(); 
	}
	
	public void setContext(Decodificador context)
	{
		this.context = context;
	}
}
