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
		 return this.topografias.stream()
                 .mapToDouble(topografia -> topografia.getProporcionAgua())
                 .average()
                 .orElse(0);
	}
	
	@Override
	public double getProporcionTierra() {
		 return this.topografias.stream()
                 .mapToDouble(topografia -> topografia.getProporcionTierra())
                 .average()
                 .orElse(0);
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
		 Mixta otraMixta = (Mixta) topografia;

		    if (this.topografias.size() != otraMixta.topografias.size()) return false;

		    for (int i = 0; i < this.topografias.size(); i++) {
		        if (!this.topografias.get(i).esIgualA(otraMixta.topografias.get(i))) return false;
		    }

		    return true;
	}

	@Override
	public boolean esIgualA_Pantano(Topografia topografia) {
		return false;
	}
	
	
	
}
