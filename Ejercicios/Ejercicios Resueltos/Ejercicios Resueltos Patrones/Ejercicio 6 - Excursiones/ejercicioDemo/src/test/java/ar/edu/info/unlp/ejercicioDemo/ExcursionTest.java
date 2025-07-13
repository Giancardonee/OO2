package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class ExcursionTest {
	
	private Excursion excursionParana;
	private Usuario usuario1;
	private Usuario usuario2;
	private Usuario usuario3;

	
	
	@BeforeEach
	public void setUp()
	{
		excursionParana =  new Excursion("Dos dias en kayak bajando el Paraná",
				LocalDate.of(2025, 4, 18), LocalDate.of(2025, 4, 21),
				"Estacion de La Plata", 4500, 1, 2); 

		 usuario1 = new Usuario("Gian","Cardone","gianca@gmail.com");
		 usuario2 = new Usuario("Leo", "Messi","Leomessi@gmail.com");
		 usuario3 = new Usuario("Dibu","Martinez","ElDibuMartinez@gmail.com");
		 
		 excursionParana.inscribirUsuario(usuario1);
		 excursionParana.inscribirUsuario(usuario2);
	}

	@Test
    public void testInscribirUsuarioConCupoMaximoYaCompleto() {
		// Tenemos dos usuarios inscriptos ya en la excursion 
		assertEquals(excursionParana.getUsuariosInscriptos().size(), 2);
		
		// No tenemos a nadie en la lista de espera
		assertEquals(excursionParana.getUsuariosEnEspera().size(), 0);
		
		// inscribimos al tercer usuario. Deberia agregarse en la lista de espera
		excursionParana.inscribirUsuario(usuario3);
		
		// Lo agrega a la lista de espera
		assertEquals(excursionParana.getUsuariosEnEspera().size(), 1);
		
		// Información esperada en estado completa con un usuario en espera
	    String infoEsperada = "La excursion: Dos dias en kayak bajando el Paraná" +
	        " tiene un costo de $4500.0" +
	        "\n La fecha de inicio es 2025-04-18" +
	        "\n La fecha de fin es: 2025-04-21" +
	        "\n El punto de encuentro es Estacion de La Plata";
		
	    assertEquals(infoEsperada, excursionParana.obtenerInformacion());
	}

}
