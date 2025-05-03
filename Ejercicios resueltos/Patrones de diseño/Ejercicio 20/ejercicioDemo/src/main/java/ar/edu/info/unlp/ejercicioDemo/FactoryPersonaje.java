package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

import ar.edu.info.unlp.ejercicioDemo.Arma.Arco;
import ar.edu.info.unlp.ejercicioDemo.Arma.Baston;
import ar.edu.info.unlp.ejercicioDemo.Arma.Espada;
import ar.edu.info.unlp.ejercicioDemo.Armadura.ArmaduraAcero;
import ar.edu.info.unlp.ejercicioDemo.Armadura.ArmaduraCuero;
import ar.edu.info.unlp.ejercicioDemo.Habilidad.CombateADistancia;
import ar.edu.info.unlp.ejercicioDemo.Habilidad.CombateCuerpoACuerpo;
import ar.edu.info.unlp.ejercicioDemo.Habilidad.Magia;
import ar.edu.info.unlp.ejercicioDemo.Personaje.Personaje;
import ar.edu.info.unlp.ejercicioDemo.Personaje.PersonajeArquero;
import ar.edu.info.unlp.ejercicioDemo.Personaje.PersonajeGuerrero;
import ar.edu.info.unlp.ejercicioDemo.Personaje.PersonajeMago;

public abstract class FactoryPersonaje {

	public Personaje crearGuerrero()
	{
		PersonajeGuerrero guerrero = new PersonajeGuerrero();
		guerrero.setNombre("Guerrero");
		guerrero.setArma(new Espada());
        guerrero.setArmadura(new ArmaduraAcero());
        guerrero.setHabilidades(List.of(new CombateCuerpoACuerpo()));
        return guerrero;
	}
	
	public Personaje crearMago() {
        PersonajeMago mago = new PersonajeMago();
        mago.setNombre("Mago");
        mago.setArma(new Baston());
        mago.setArmadura(new ArmaduraCuero());
        mago.setHabilidades(List.of(new Magia(), new CombateADistancia()));
        return mago;
    }

	public Personaje crearArquero ()
	{
		PersonajeArquero arquero = new PersonajeArquero();
        arquero.setNombre("Arquero");
        arquero.setArma(new Arco());
        arquero.setArmadura(new ArmaduraCuero());
        arquero.setHabilidades(List.of(new CombateADistancia()));
        return arquero;
	}
	
	
}
