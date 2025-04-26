package ar.edu.info.unlp.ejercicioDemo;


public abstract class Topografia {
	
	public abstract double getProporcionAgua();
	public abstract double getProporcionTierra();
	
	// doble dispatching 
	public abstract boolean esIgualA(Topografia topografia); 
	
	public abstract boolean esIgualA_Agua(Topografia topografia);
	public abstract boolean esIgualA_Tierra(Topografia topografia);
	public abstract boolean esIgualA_Mixta(Topografia topografia);
	public abstract boolean esIgualA_Pantano(Topografia topografia); 
	
	
	
}
