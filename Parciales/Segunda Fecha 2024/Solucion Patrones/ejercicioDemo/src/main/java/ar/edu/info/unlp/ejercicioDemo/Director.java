package ar.edu.info.unlp.ejercicioDemo;

// Rol <Director>
public class Director {
   private  ComputadoraBuilder builder;
   
   public Director(ComputadoraBuilder builder)
   {
       this.builder = builder;
   }
   
   public Presupuesto crearPresupuesto(String nombrePersona)
   {
       builder.getPresupuesto().setearConPersonaNueva(nombrePersona);
       builder.agregarProcesador();
       builder.agregarRam();
       builder.agregarDisco();
       builder.agregarTarjetaGrafica();
       builder.agregarGabinete();
       return builder.getPresupuesto();
   }
}
