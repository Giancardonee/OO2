package ar.edu.info.unlp.ejercicioDemo.Personaje;

import ar.edu.info.unlp.ejercicioDemo.Arma.Baston;
import ar.edu.info.unlp.ejercicioDemo.Armadura.ArmaduraCuero;
import ar.edu.info.unlp.ejercicioDemo.Habilidad.CombateADistancia;
import ar.edu.info.unlp.ejercicioDemo.Habilidad.Magia;
import java.util.Arrays;

public class PersonajeMago extends PersonajeBuilder{

    @Override
    public void setNombre() {
       personaje.setNombre("MagoGianca");
    }

    @Override
    public void setArma() {
       personaje.setArma(new Baston());
    }

    @Override
    public void setArmadura() {
        personaje.setArmadura(new ArmaduraCuero());
    }

    @Override
    public void setHabilidades() {
        personaje.setHabilidades(Arrays.asList(new Magia(), new CombateADistancia()));
    }

}
