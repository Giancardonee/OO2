package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class SugerirPorSimilaridad extends EstrategiaSugerirPelicula{

	
	@Override
	protected List<Pelicula> aplicarCriterio(List<Pelicula> noReproducidas)
	{
		List<Pelicula> peliculasSimilares = obtenerPeliculasSimilares(noReproducidas,this.context.getPeliculasReproducidas()); 
		return super.aplicarCriterio(peliculasSimilares);
	}
	
	
	private List<Pelicula> obtenerPeliculasSimilares(List<Pelicula> noReproducidas,List<Pelicula> peliculasReproducidas)
	{
		return noReproducidas.stream()
				.filter(pelicula -> peliculasReproducidas.stream()
						.anyMatch(reproducida -> reproducida.esSimilar(pelicula)))
					.toList();
	}
}
