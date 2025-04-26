package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TopografiaTest {

	  Topografia agua, tierra, mixtaSimple, mixtaAnidada;

	    @BeforeEach
	    public void setUp() {
	        agua = new Agua();
	        tierra = new Tierra();

	        // mixtaSimple = [agua, tierra, tierra, agua] => proporción = (1 + 0 + 0 + 1) / 4 = 0.5
	        List<Topografia> listaSimple = Arrays.asList(agua, tierra, tierra, agua);
	        mixtaSimple = new Mixta(new java.util.ArrayList<>(listaSimple));

	        // mixtaAnidada = [agua, tierra, tierra, mixtaSimple] => proporción = (1 + 0 + 0 + 0.5) / 4 = 0.375
	        List<Topografia> listaAnidada = Arrays.asList(agua, tierra, tierra, mixtaSimple);
	        mixtaAnidada = new Mixta(new java.util.ArrayList<>(listaAnidada));
	    }

	    @Test
	    public void testProporcionAguaBasicas() {
	        assertEquals(1.0, agua.getProporcionAgua());
	        assertEquals(0.0, tierra.getProporcionAgua());
	    }

	    @Test
	    public void testProporcionMixtaSimple() {
	        assertEquals(0.5, mixtaSimple.getProporcionAgua());
	    }

	    @Test
	    public void testProporcionMixtaAnidada() {
	        assertEquals(0.375, mixtaAnidada.getProporcionAgua());
	    }

	    @Test
	    public void testIgualdadBasicas() {
	        assertTrue(agua.esIgualA(new Agua()));
	        assertTrue(tierra.esIgualA(new Tierra()));
	        assertFalse(agua.esIgualA(tierra));
	    }

	    @Test
	    public void testIgualdadMixtasSimples() {
	        List<Topografia> otraListaSimple = Arrays.asList(new Agua(), new Tierra(), new Tierra(), new Agua());
	        Topografia otraMixta = new Mixta(new java.util.ArrayList<>(otraListaSimple));
	        assertTrue(mixtaSimple.esIgualA(otraMixta));
	    }

	    @Test
	    public void testDesigualdadPorOrden() {
	        List<Topografia> ordenCambiado = Arrays.asList(tierra, agua, tierra, agua);
	        Topografia otraMixta = new Mixta(new java.util.ArrayList<>(ordenCambiado));
	        assertFalse(mixtaSimple.esIgualA(otraMixta));
	    }

	    @Test
	    public void testDesigualdadMixtaVsAnidada() {
	        assertFalse(mixtaSimple.esIgualA(mixtaAnidada));
	    }
}
