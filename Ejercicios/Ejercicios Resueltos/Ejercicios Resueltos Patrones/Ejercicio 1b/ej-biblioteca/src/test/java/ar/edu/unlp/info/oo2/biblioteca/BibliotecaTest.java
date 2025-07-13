package ar.edu.unlp.info.oo2.biblioteca;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BibliotecaTest {

	private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    /*
    @Test
    public void testExportarSociosConSocios() {
        Socio socio1 = new Socio("Juan Pérez", "juan@example.com", "001");
        Socio socio2 = new Socio("Ana García", "ana@example.com", "002");

        biblioteca.agregarSocio(socio1);
        biblioteca.agregarSocio(socio2);

        String esperado =
                "[\n" +
                        "\t{\n" +
                        "\t\t\"nombre\": \"Juan Pérez\",\n" +
                        "\t\t\"email\": \"juan@example.com\",\n" +
                        "\t\t\"legajo\": \"001\"\n" +
                        "\t},\n" +
                        "\t{\n" +
                        "\t\t\"nombre\": \"Ana García\",\n" +
                        "\t\t\"email\": \"ana@example.com\",\n" +
                        "\t\t\"legajo\": \"002\"\n" +
                        "\t}\n" +
                        "]";


        assertEquals(esperado, biblioteca.exportarSocios());
    }
    */ 
    

    @Test
    public void testExportarSociosSinSocios() {
        String esperado = "[]";
        assertEquals(esperado, biblioteca.exportarSocios());
    }

}
