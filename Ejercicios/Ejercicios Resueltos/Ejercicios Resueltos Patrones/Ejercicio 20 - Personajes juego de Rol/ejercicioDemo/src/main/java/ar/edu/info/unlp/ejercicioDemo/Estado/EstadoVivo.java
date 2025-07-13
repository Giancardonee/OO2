package ar.edu.info.unlp.ejercicioDemo.Estado;

import ar.edu.info.unlp.ejercicioDemo.Personaje.Personaje;

public class EstadoVivo implements EstadoPersonaje {

	@Override
	public void atacar(Personaje atacante, Personaje objetivo) {
		double danho = atacante.getArma().calcularDanioContra(objetivo.getArmadura()); 
		this.recibirGolpe(objetivo, danho);
	}

	@Override
	public void recibirGolpe(Personaje personaje, double danho) {
		personaje.decrementarVida(danho);
		
		System.out.println(personaje.getNombre() + " recibió " + danho + " de daño. Vida actual: " + personaje.getVida());
	
		if (personaje.getVida() == 0)
		{
			personaje.setEstado(new EstadoMuerto());
			System.out.println("Personaje: "+personaje.getNombre()+ " ha muerto.");
		}
			
	}

}
