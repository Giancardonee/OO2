package ar.edu.info.unlp.ejercicioDemo;

public class EstadoProvisorio extends EstadoInscripcion {

    public EstadoProvisorio (Excursion context)
    {
       super(context);
    }
    
    @Override
    public void agregarUsuario(Usuario usuario)
    {
        super.agregarUsuario(usuario);
        this.evaluarCambioDeEstado();
    }
    
    @Override
    protected void evaluarCambioDeEstado ()
    {
    	if (context.cantUsuariosFaltantesCupoMinimo() == 0)
            context.setEstado(new EstadoDefinitivo(context));
    }
    
    @Override
    public String getInformacion()
    {
       return super.getInformacion()+
               "\n La cantidad de usuarios faltantes para el cupo minino es "
               +context.cantUsuariosFaltantesCupoMinimo()+ " usuarios.";
    }
}
