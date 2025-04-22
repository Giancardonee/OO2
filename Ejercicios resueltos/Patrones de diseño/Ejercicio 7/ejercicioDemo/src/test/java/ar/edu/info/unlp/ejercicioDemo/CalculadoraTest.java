package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSetValorInicial() {
        calculadora.setValor(10);
        assertEquals("10.0", calculadora.getResultado());
    }

    @Test
    public void testSuma() {
        calculadora.setValor(10);
        calculadora.mas();
        calculadora.setValor(5);
        assertEquals("15.0", calculadora.getResultado());
    }

    @Test
    public void testResta() {
        calculadora.setValor(10);
        calculadora.menos();
        calculadora.setValor(3);
        assertEquals("7.0", calculadora.getResultado());
    }

    @Test
    public void testMultiplicacion() {
        calculadora.setValor(4);
        calculadora.por();
        calculadora.setValor(5);
        assertEquals("20.0", calculadora.getResultado());
    }

    @Test
    public void testDivision() {
        calculadora.setValor(20);
        calculadora.dividido();
        calculadora.setValor(4);
        assertEquals("5.0", calculadora.getResultado());
    }

    @Test
    public void testDivisionPorCero() {
        calculadora.setValor(10);
        calculadora.dividido();
        calculadora.setValor(0);
        assertEquals("Error.", calculadora.getResultado());
    }

    @Test
    public void testOperacionesEncadenadasInvalida() {
        calculadora.setValor(5);
        calculadora.menos();
        calculadora.por(); // Esto debería generar error
        assertEquals("Error.", calculadora.getResultado());
    }

    @Test
    public void testBorrar() {
        calculadora.setValor(42);
        calculadora.borrar();
        assertEquals("0.0", calculadora.getResultado());
    }
}
