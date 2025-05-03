package ar.edu.info.unlp.ejercicioDemo.Estado;

import ar.edu.info.unlp.ejercicioDemo.Personaje.Personaje;

public class EstadoMuerto implements EstadoPersonaje {

	
	// no hace nada...
	@Override
	public void atacar(Personaje atacante, Personaje objetivo) {
	}

	@Override
	public void recibirGolpe(Personaje personaje, double danho) {
	}

}
