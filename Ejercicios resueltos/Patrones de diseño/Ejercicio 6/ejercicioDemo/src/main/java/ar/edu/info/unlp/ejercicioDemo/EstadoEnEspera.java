package ar.edu.info.unlp.ejercicioDemo;

public class EstadoEnEspera extends EstadoInscripcion{

    public EstadoEnEspera(Excursion context)
    {
        super(context); 
    }
    
    @Override
    protected void evaluarCambioDeEstado()
    {
    	// no hace nada.. 
    }
    
   @Override
    public void agregarUsuario (Usuario usuario)
    {
        this.context.agregarUsuarioListaDeEspera(usuario);
    }

   
}
