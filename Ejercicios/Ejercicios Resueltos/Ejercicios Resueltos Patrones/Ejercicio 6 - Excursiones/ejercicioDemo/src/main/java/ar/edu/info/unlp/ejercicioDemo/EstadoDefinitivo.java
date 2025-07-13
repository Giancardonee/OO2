package ar.edu.info.unlp.ejercicioDemo;

import java.util.stream.Collectors;

public class EstadoDefinitivo extends EstadoInscripcion {
    
    public EstadoDefinitivo (Excursion context)
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
    protected void evaluarCambioDeEstado()
    {
    	if (context.cantUsuariosFaltantesCupoMaximo()== 0)
            context.setEstado(new EstadoEnEspera(context));
    }
    
    @Override
    public String getInformacion()
    {
        return super.getInformacion()+
                " Emails de usuarios inscriptos: "
                +this.getEmailsUsuariosInscriptos()+
                " La cantidad de usuarios faltantes para el cupo maximo es "+context.cantUsuariosFaltantesCupoMaximo()+
                " usuarios";
    }
    
    private String getEmailsUsuariosInscriptos()
    {
        return context.getUsuariosInscriptos().stream()
               .map( u -> u.getEmail())
               .collect(Collectors.joining("\n"));
    }
    
    
}
