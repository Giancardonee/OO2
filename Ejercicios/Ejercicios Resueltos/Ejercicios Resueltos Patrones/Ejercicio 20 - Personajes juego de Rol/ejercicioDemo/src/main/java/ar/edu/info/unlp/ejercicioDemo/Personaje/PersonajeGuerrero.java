package ar.edu.info.unlp.ejercicioDemo.Personaje;

import ar.edu.info.unlp.ejercicioDemo.Arma.Espada;
import ar.edu.info.unlp.ejercicioDemo.Armadura.ArmaduraAcero;
import ar.edu.info.unlp.ejercicioDemo.Habilidad.CombateCuerpoACuerpo;
import java.util.Arrays;

public class PersonajeGuerrero extends PersonajeBuilder{

    @Override
    public void setNombre() {
        personaje.setNombre("GuerreroGianca");
    }

    @Override
    public void setArma() {
        personaje.setArma(new Espada());
    }

    @Override
    public void setArmadura() {
        personaje.setArmadura(new ArmaduraAcero());
    }

    @Override
    public void setHabilidades() {
         personaje.setHabilidades(Arrays.asList(new CombateCuerpoACuerpo()));
    }

}


