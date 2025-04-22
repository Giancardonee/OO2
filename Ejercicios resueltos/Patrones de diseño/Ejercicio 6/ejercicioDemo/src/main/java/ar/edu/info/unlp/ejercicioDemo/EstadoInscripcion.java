package ar.edu.info.unlp.ejercicioDemo;

public abstract class EstadoInscripcion {
    protected Excursion context;
   
    public EstadoInscripcion(Excursion context)
    {
        this.context = context;
    }
      
    public String getInformacion()
    {
        return context.toString();
    }
    
    protected abstract void evaluarCambioDeEstado(); 
    
    // Solo para los estados de provisorio y definitivo
    public void agregarUsuario (Usuario usuario)
    {
        context.agregarUsuarioInscripto(usuario);
    }
    
}
