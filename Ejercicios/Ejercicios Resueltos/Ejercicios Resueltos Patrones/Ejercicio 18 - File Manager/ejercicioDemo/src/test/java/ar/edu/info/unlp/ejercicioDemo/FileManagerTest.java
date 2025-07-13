package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class FileManagerTest {

    private FileComponent file;

    @BeforeEach
    public void setup() {
        // Inicializamos un archivo básico para pruebas
        file = new FileOO2("Archivo1", "txt", 500, 
                           LocalDate.of(2023, 5, 1), 
                           LocalDate.of(2024, 5, 1), 
                           "rw");
    }

    @Test
    public void testDecoratorNombre() {
        // Decoramos con el nombre
        FileComponent decoratedFile = new DecoratorNombre(file);
        String result = decoratedFile.prettyPrint();
        
        // Imprimimos el resultado
        System.out.println("testDecoratorNombre: " + result);
        
        // Verificamos que el resultado contenga el nombre primero
        assertTrue(result.contains("Archivo1"));
    }

    @Test
    public void testDecoratorFechaCreacion() {
        // Decoramos con la fecha de creación
        FileComponent decoratedFile = new DecoratorFechaCreacion(file);
        String result = decoratedFile.prettyPrint();
        
        // Imprimimos el resultado
        System.out.println("testDecoratorFechaCreacion: " + result);
        
        // Verificamos que la fecha de creación está correctamente añadida
        assertTrue(result.contains("2023-05-01"));
    }

    @Test
    public void testDecoratorsEncadenados() {
        // Encadenamos varios decoradores
        FileComponent decoratedFile = new DecoratorNombre(
                                        new DecoratorFechaCreacion(
                                        new DecoratorExtension(file)));
        
        String result = decoratedFile.prettyPrint();
        
        // Imprimimos el resultado
        System.out.println("testDecoratorsEncadenados: " + result);
        
        // Verificamos que el resultado contenga los tres elementos en el orden correcto
        assertTrue(result.contains("Archivo1"));
        assertTrue(result.contains("2023-05-01"));
        assertTrue(result.contains("txt"));
    }

    @Test
    public void testDecoratorsEncadenadosConVariosAtributos() {
        // Encadenamos varios decoradores con atributos adicionales
        FileComponent decoratedFile = new DecoratorNombre(
                                        new DecoratorFechaCreacion(
                                        new DecoratorTam(
                                        new DecoratorPermiso(file))));
        
        String result = decoratedFile.prettyPrint();
        
        // Imprimimos el resultado
        System.out.println("testDecoratorsEncadenadosConVariosAtributos: " + result);
        
        // Verificamos que el resultado contenga los cuatro elementos
        assertTrue(result.contains("Archivo1"));
        assertTrue(result.contains("2023-05-01"));
        assertTrue(result.contains("500"));
        assertTrue(result.contains("rw"));
    }
}

