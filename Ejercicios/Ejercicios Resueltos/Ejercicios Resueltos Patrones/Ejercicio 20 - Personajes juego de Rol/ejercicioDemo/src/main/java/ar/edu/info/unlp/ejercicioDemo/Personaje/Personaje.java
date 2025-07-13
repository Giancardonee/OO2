package ar.edu.info.unlp.ejercicioDemo.Personaje;

import java.util.List;

import ar.edu.info.unlp.ejercicioDemo.Arma.Arma;
import ar.edu.info.unlp.ejercicioDemo.Armadura.Armadura;
import ar.edu.info.unlp.ejercicioDemo.Estado.EstadoPersonaje;
import ar.edu.info.unlp.ejercicioDemo.Estado.EstadoVivo;
import ar.edu.info.unlp.ejercicioDemo.Habilidad.Habilidad;

public class Personaje {
	private String nombre;
	private double vida; 
	private Arma arma;
	private Armadura armadura;
	private List<Habilidad> habilidades;
	private EstadoPersonaje estado;
	
	public Personaje ()
	{
		this.vida = 100;
		this.estado = new EstadoVivo();
	}
	
	
	public void atacar(Personaje objetivo)
	{
		this.estado.atacar(this, objetivo);
	}
	
	public void recibirGolpe(double danho) {
	    this.estado.recibirGolpe(this, danho);
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void setArma(Arma arma)
	{
		this.arma = arma;
	}
	
	public void setArmadura (Armadura armadura)
	{
		this.armadura = armadura;
	}
	
	public void setHabilidades (List<Habilidad> habilidades)
	{
		this.habilidades = habilidades;
	}
	
	public void setEstado(EstadoPersonaje estado)
	{
		this.estado = estado;
	}

	public void decrementarVida(double danho)
	{
		if ( (this.vida - danho) <= 0) this.vida = 0;
		else vida = vida - danho;
	}
	
	public Armadura getArmadura()
	{
		return this.armadura;
	}
	
	public Arma getArma()
	{
		return this.arma;
	}
	
	public double getVida()
	{
		return this.vida;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
}


