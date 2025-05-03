package ar.edu.info.unlp.ejercicioDemo.Estado;

import ar.edu.info.unlp.ejercicioDemo.Personaje.Personaje;

public interface EstadoPersonaje {

	public void atacar (Personaje atacante, Personaje objetivo);
	public void recibirGolpe (Personaje personaje, double danho); 
}
