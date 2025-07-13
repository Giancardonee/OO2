package ar.edu.info.unlp.ejercicioDemo.Personaje;
public class DirectorPersonaje {
    
    public Personaje crearPersonaje(PersonajeBuilder unPersonaje)
    {
        unPersonaje.setArma();
        unPersonaje.setArmadura();
        unPersonaje.setHabilidades();
        unPersonaje.setHabilidades();
        return unPersonaje.getPersonaje();
    }
}
