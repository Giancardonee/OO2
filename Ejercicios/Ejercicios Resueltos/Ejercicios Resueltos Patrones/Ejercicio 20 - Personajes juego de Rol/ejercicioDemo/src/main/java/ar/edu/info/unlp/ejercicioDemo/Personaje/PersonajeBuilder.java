package ar.edu.info.unlp.ejercicioDemo.Personaje;


public abstract class PersonajeBuilder {
    protected Personaje personaje;
    
    public void PersonajeBuilder()
    {
        this.personaje = new Personaje(); 
    }
    
    public Personaje getPersonaje()
    {
        return this.personaje;
    }
    
    public abstract void setNombre(); 
    public abstract void setArma (); 
    public abstract void setArmadura ();
    public abstract void setHabilidades(); 
}
