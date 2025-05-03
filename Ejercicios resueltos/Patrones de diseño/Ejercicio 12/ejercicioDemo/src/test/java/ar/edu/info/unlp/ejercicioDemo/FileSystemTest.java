package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FileSystemTest {
	    private Archivo archivo1, archivo2, archivo3;
	    private Directorio raiz, dirA, dirA1, dirB;
	    

	    @BeforeEach
	    void setUp() {
	        archivo1 = new Archivo("Archivo1.txt", LocalDate.of(2024, 4, 10), 100);
	        archivo2 = new Archivo("Archivo2.txt", LocalDate.of(2024, 4, 15), 200);
	        archivo3 = new Archivo("Archivo3.txt", LocalDate.of(2024, 4, 20), 50);

	        dirA1 = new Directorio("Directorio A.1", LocalDate.of(2024, 4, 5), Arrays.asList(archivo1, archivo2));
	        dirA = new Directorio("Directorio A", LocalDate.of(2024, 4, 1), Arrays.asList(dirA1, archivo3));
	        dirB = new Directorio("Directorio B", LocalDate.of(2024, 4, 2), List.of());

	        raiz = new Directorio("root", LocalDate.of(2024, 3, 30), Arrays.asList(dirA, dirB));
	        
	    }


	    @Test
	    void testTamanoTotalOcupado() {
	        // Cada directorio ocupa 32 bytes + suma de los elementos
	        int expectedSize = 
	            32 + ( // root
	                32 + ( // Directorio A
	                    32 + 100 + 200 // Directorio A.1 con 2 archivos
	                ) + 50 // Archivo3.txt
	            ) +
	            32; // Directorio B vacío

	        assertEquals(expectedSize, raiz.getBytesOcupados());
	    }

	    @Test
	    void testArchivoMasGrande() {
	        assertEquals(archivo2, raiz.getArchivoMasGrande());
	    }

	    @Test
	    void testArchivoMasNuevo() {
	        assertEquals(archivo3, raiz.getArchivoMasNuevo());
	    }

	    @Test
	    void testBuscarElementoExistente() {
	        ElementoFileSystem encontrado = raiz.getElementoPorNombre("Archivo1.txt");
	        assertNotNull(encontrado);
	        assertEquals("Archivo1.txt", encontrado.getNombre());
	    }

	    @Test
	    void testBuscarElementoNoExistente() {
	        ElementoFileSystem encontrado = raiz.getElementoPorNombre("ArchivoInexistente.txt");
	        assertNull(encontrado);
	    }

	    @Test
	    void testBuscarTodosConCoincidencias() {
	        List<ElementoFileSystem> encontrados = raiz.getTodosElementosPorNombre("Archivo2.txt");
	        assertEquals(1, encontrados.size());
	        assertEquals("Archivo2.txt", encontrados.get(0).getNombre());
	    }

	    @Test
	    void testBuscarTodosSinCoincidencias() {
	        List<ElementoFileSystem> encontrados = raiz.getTodosElementosPorNombre("ArchivoInexistente.txt");
	        assertTrue(encontrados.isEmpty());
	    }
}
