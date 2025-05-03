package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class PrendaTest {

	@Test
	public void testLiquidezPrendaCombinada() {
	    // Crear una prenda de tipo automóvil con modelo 2023
	    Automovil auto = new Automovil(2023, 150000, 20000);  // Modelo 2023, km 150000, costo 0 km 20000

	    // Crear una prenda de tipo alquiler
	    Alquiler alquiler = new Alquiler(LocalDate.now(), LocalDate.now().plusMonths(12), 1000);  // 1 año de contrato con costo mensual de 1000

	    // Crear una prenda combinada que incluye el automóvil y el alquiler
	    PrendaCombinada prendaCombinada = new PrendaCombinada(Arrays.asList(auto, alquiler));

	    // La liquidez de una prenda combinada es 0.5 (según tu lógica)
	    double liquidezEsperada = 0.5;

	    // Verificar que la liquidez de la prenda combinada sea correcta
	    assertEquals(liquidezEsperada, prendaCombinada.liquidez(), "La liquidez de la prenda combinada es incorrecta.");
	}

	
}
