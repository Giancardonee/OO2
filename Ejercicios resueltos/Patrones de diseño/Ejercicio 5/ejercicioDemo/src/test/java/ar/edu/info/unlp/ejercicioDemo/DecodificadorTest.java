package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DecodificadorTest {

	 private Pelicula thor;
	 private Pelicula capitanAmerica;
	 private Pelicula ironMan;
	 private Pelicula dunkirk;
	 private Pelicula rocky;
	 private Pelicula rambo;

	 private List<Pelicula> grilla;
	 private Decodificador decodificador;
	
	 @BeforeEach
	    public void setUp() {
	        // Crear películas
	        thor = new Pelicula("Thor", 2007, 7.9);
	        capitanAmerica = new Pelicula("Capitan America", 2016, 7.8);
	        ironMan = new Pelicula("Iron Man", 2010, 7.9);
	        dunkirk = new Pelicula("Dunkirk", 2017, 7.9);
	        rocky = new Pelicula("Rocky", 1976, 8.1);
	        rambo = new Pelicula("Rambo", 1979, 7.8);

	        // Establecer relaciones de similaridad
	        thor.agregarPeliculaSimilar(capitanAmerica);
	        thor.agregarPeliculaSimilar(ironMan);
	        rocky.agregarPeliculaSimilar(rambo);

	        // Grilla
	        grilla = new LinkedList<>(Arrays.asList(thor, capitanAmerica, ironMan, dunkirk, rocky, rambo));

	        // Inicializar decodificador con una estrategia cualquiera
	        decodificador = new Decodificador(grilla, new SugerirPorNovedad());

	        // Reproducidas: Thor y Rocky
	        decodificador.reproducirPelicula(thor);
	        decodificador.reproducirPelicula(rocky);
	    }

	   @Test
	    public void testSugerenciasPorSimilaridad() {
	        decodificador.cambiarEstrategia(new SugerirPorSimilaridad());
	        List<Pelicula> sugerencias = decodificador.sugerirPelicula();

	        List<String> esperadas = Arrays.asList("Capitan America", "Iron Man", "Rambo");
	        List<String> obtenidas = sugerencias.stream().map(Pelicula::getTitulo).toList();

	        assertTrue(obtenidas.containsAll(esperadas));
	        assertEquals(3, sugerencias.size());
	    }
	   
	   @Test
	    public void testSugerenciasPorPuntaje() {
	        decodificador.cambiarEstrategia(new SugerirPorPuntaje());
	        List<Pelicula> sugerencias = decodificador.sugerirPelicula();

	        List<String> esperadas = Arrays.asList("Dunkirk", "Iron Man", "Capitan America");
	        List<String> obtenidas = sugerencias.stream().map(Pelicula::getTitulo).toList();

	        assertTrue(obtenidas.containsAll(esperadas));
	        assertEquals(3, sugerencias.size());
	    }
	 
}
