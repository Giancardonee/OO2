package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class Mixta extends Topografia
{
	private ArrayList<Topografia> topografias;
	
	
	// recibe un arraylist ya creado con topografias. 
	public Mixta (ArrayList<Topografia> topografias)
	{
		this.topografias = topografias;
	}
	
	@Override
	public double getProporcionAgua ()
	{
		return this.calcularProporcion();
	}
	
	private double calcularProporcion ()
	{
		double cantidadAgua = topografias.stream()
				.mapToDouble(topografia -> topografia.getProporcionAgua()).sum();
		return this.realizarProporcion(cantidadAgua) ; 
	}
	
	private double realizarProporcion (double cantidadAgua)
	{
		return cantidadAgua / topografias.size(); // cantidadAgua / proporciones 
	}

	@Override
	public boolean esIgualA(Topografia topografia) {
		return topografia.esIgualA_Mixta(this);
	}

	@Override
	public boolean esIgualA_Agua(Topografia topografia) {
		return false;
	}

	@Override
	public boolean esIgualA_Tierra(Topografia topografia) {
		return false;
	}

	@Override
	public boolean esIgualA_Mixta(Topografia topografia) {
		    Mixta otraMixta = (Mixta) topografia; // casteo (consultar si es valido... me hace ruido)
		    
		    // si no son dos topografias mixtas -> Retornamos false de una. 
		    if (this.topografias.size() != otraMixta.topografias.size())
		        return false;
		    
		    // Si son dos topografias mixtas -> comparamos parte por parte. 
		    for (int i = 0; i < this.topografias.size(); i++) {
		        Topografia t1 = this.topografias.get(i);
		        Topografia t2 = otraMixta.topografias.get(i);

		        if (!t1.esIgualA(t2))  // doble dispatch recursivo
		            return false;
		    }
		    return true;

	}
	
	
	
}
