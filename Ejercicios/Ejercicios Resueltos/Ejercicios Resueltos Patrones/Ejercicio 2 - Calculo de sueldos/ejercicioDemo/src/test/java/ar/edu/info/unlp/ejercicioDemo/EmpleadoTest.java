package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmpleadoTest {
   
	
	@Test
    public void testCalcularSueldoPasante() {
        Empleado pasante = new EmpleadoPasante(3); // 3 exámenes rendidos

        // Basico = 20000
        // Adicional = 3 * 2000 = 6000
        // Descuento = 13% de 20000 + 5% de 6000 = 2600 + 300 = 2900
        // Sueldo final = 20000 + 6000 - 2900 = 23100

        assertEquals(23100, pasante.calcularSueldo(), 0.01);
    }

    @Test
    public void testCalcularSueldoTemporario() {
        Empleado temporario = new EmpleadoTemporario(10, true, 2); // 10hs, casado, 2 hijos

        // Basico = 20000 + (10 * 300) = 23000
        // Adicional = 5000 (casado) + 2 * 2000 = 9000
        // Descuento = 13% de 23000 + 5% de 9000 = 2990 + 450 = 3440
        // Sueldo final = 23000 + 9000 - 3440 = 28560

        assertEquals(28560, temporario.calcularSueldo(), 0.01);
    }

    @Test
    public void testCalcularSueldoPlanta() {
        Empleado planta = new EmpleadoPlanta(1, true, 2); // 1 hijo, casado, 2 años antigüedad

        // Basico = 50000 (20000 + 30000)
        // Adicional = 5000 (casado) + 2000 (hijo) + 4000 (antigüedad) = 11000
        // Descuento = 13% de 50000 + 5% de 11000 = 6500 + 550 = 7050
        // Sueldo final = 50000 + 11000 - 7050 = 53950

        assertEquals(53950, planta.calcularSueldo(), 0.01);
    }

}
