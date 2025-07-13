package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Excursion {
	
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoDeEncuentro; 
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	
	private List<Usuario> usuariosInscriptos;
    private List<Usuario> usuariosEnEspera;
	
	private EstadoInscripcion estadoInscripcion;

        public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoDeEncuentro, double costo, int cupoMinimo, int cupoMaximo) {
            this.nombre = nombre;
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;
            this.puntoDeEncuentro = puntoDeEncuentro;
            this.costo = costo;
            this.cupoMinimo = cupoMinimo;
            this.cupoMaximo = cupoMaximo;
            this.usuariosInscriptos = new LinkedList<>();
            this.usuariosEnEspera = new LinkedList<>();
            
         // Asumo que el primer estado es el estado provisorio 
            this.estadoInscripcion = new EstadoProvisorio(this); 
        }
 	
        
        public void inscribirUsuario(Usuario usuario)
        {
            estadoInscripcion.agregarUsuario(usuario);
        }
     
        public void agregarUsuarioInscripto (Usuario usuario)
        {
            this.usuariosInscriptos.add(usuario);
        }
        
        public void agregarUsuarioListaDeEspera(Usuario usuario)
        {
            this.usuariosEnEspera.add(usuario);
        }
        
        public void setEstado(EstadoInscripcion estado)
        {
            this.estadoInscripcion = estado; 
        }
        
        public String obtenerInformacion ()
        {
            return estadoInscripcion.getInformacion(); 
        }
        
        public List<Usuario> getUsuariosInscriptos()
        {
            return this.usuariosInscriptos;
        }
        
        public List<Usuario> getUsuariosEnEspera()
        {
        	return this.usuariosEnEspera;
        }
        
        @Override
        public String toString ()
        {
            return "La excursion: "+this.nombre+
                    " tiene un costo de $"+this.costo+
                    "\n La fecha de inicio es "+this.fechaInicio+
                    "\n La fecha de fin es: "+this.fechaFin+
                    "\n El punto de encuentro es "+this.puntoDeEncuentro;
        }

       public int cantUsuariosFaltantesCupoMinimo()
       {
           return this.cupoMinimo - this.usuariosInscriptos.size();
       }
       
       public int cantUsuariosFaltantesCupoMaximo()
       {
           return this.cupoMaximo - this.usuariosInscriptos.size();
       }
               
       
}
