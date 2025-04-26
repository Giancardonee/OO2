package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {

	private Topografia agua;
    private Topografia tierra;
    private Topografia pantano;
    private Topografia mixtaSimple;
    private Topografia mixtaAnidada1;
    private Topografia mixtaAnidada2;

    @BeforeEach
    void setUp() {
        agua = new Agua();
        tierra = new Tierra();
        pantano = new Pantano();

        // Mixta simple: [Agua, Tierra, Tierra, Pantano]
        mixtaSimple = new Mixta(Arrays.asList(agua, tierra, tierra, pantano));

        // Mixta anidada1: [Agua, Tierra, Tierra, Mixta([Agua, Tierra, Tierra, Agua])]
        Topografia subMixta = new Mixta(Arrays.asList(agua, tierra, tierra, agua));
        mixtaAnidada1 = new Mixta(Arrays.asList(agua, tierra, tierra, subMixta));

        // Igual a anidada1 (para test de igualdad)
        Topografia subMixtaCopy = new Mixta(Arrays.asList(agua, tierra, tierra, agua));
        mixtaAnidada2 = new Mixta(Arrays.asList(agua, tierra, tierra, subMixtaCopy));
    }

    @Test
    void testProporcionAguaYtierra() {
        assertEquals(1.0, agua.getProporcionAgua());
        assertEquals(0.0, agua.getProporcionTierra());

        assertEquals(0.0, tierra.getProporcionAgua());
        assertEquals(1.0, tierra.getProporcionTierra());

        assertEquals(0.7, pantano.getProporcionAgua(), 0.01);
        assertEquals(0.3, pantano.getProporcionTierra(), 0.01);

        assertEquals((1 + 0 + 0 + 0.7) / 4, mixtaSimple.getProporcionAgua(), 0.01);
        assertEquals((0 + 1 + 1 + 0.3) / 4, mixtaSimple.getProporcionTierra(), 0.01);
    }

    @Test
    void testIgualdadTiposSimples() {
        assertTrue(agua.esIgualA(new Agua()));
        assertTrue(tierra.esIgualA(new Tierra()));
        assertTrue(pantano.esIgualA(new Pantano()));

        assertFalse(agua.esIgualA(tierra));
        assertFalse(pantano.esIgualA(agua));
        assertFalse(tierra.esIgualA(pantano));
    }

    @Test
    void testIgualdadMixtas() {
        Topografia otraMixta = new Mixta(Arrays.asList(agua, tierra, tierra, pantano));
        assertTrue(mixtaSimple.esIgualA(otraMixta));
    }

    @Test
    void testIgualdadMixtasAnidadas() {
        assertTrue(mixtaAnidada1.esIgualA(mixtaAnidada2));
    }

    @Test
    void testDesigualdadMixtas() {
        Topografia mixtaDistinta = new Mixta(Arrays.asList(tierra, agua, pantano, tierra));
        assertFalse(mixtaSimple.esIgualA(mixtaDistinta));
    }
    
}
