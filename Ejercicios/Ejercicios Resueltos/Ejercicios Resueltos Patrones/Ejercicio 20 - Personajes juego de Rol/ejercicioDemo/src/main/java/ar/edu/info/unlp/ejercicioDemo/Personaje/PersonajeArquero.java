package ar.edu.info.unlp.ejercicioDemo.Personaje;

import ar.edu.info.unlp.ejercicioDemo.Arma.Arco;
import ar.edu.info.unlp.ejercicioDemo.Armadura.ArmaduraCuero;
import ar.edu.info.unlp.ejercicioDemo.Habilidad.CombateADistancia;
import java.util.Arrays;

public class PersonajeArquero extends PersonajeBuilder {

    @Override
    public void setNombre() {
       personaje.setNombre("ArqueroGianca");
    }

    @Override
    public void setArma() {
         personaje.setArma(new Arco());
    }

    @Override
    public void setArmadura() {
         personaje.setArmadura(new ArmaduraCuero());
    }

    @Override
    public void setHabilidades() {
        personaje.setHabilidades(Arrays.asList(new CombateADistancia()));
    }

}
