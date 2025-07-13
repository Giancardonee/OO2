package ar.edu.info.unlp.ejercicioDemo;

import java.util.Comparator;
import java.util.List;

public class SugerirPorPuntaje extends EstrategiaSugerirPelicula {

	   
	@Override
	protected List<Pelicula> aplicarCriterio(List<Pelicula> noReproducidas)
	{
        return noReproducidas.stream()
                .sorted(Comparator.comparing(Pelicula::getPuntaje).reversed() // ordena por puntaje (descendente)
                        .thenComparing(Comparator.comparing(Pelicula::getAnhoEstreno).reversed())) // si hay empate en puntaje, ordenar por año (descendente)
                .toList();
	}
}
