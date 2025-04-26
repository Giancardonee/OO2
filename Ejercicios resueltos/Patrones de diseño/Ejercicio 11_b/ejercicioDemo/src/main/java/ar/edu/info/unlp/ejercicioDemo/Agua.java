package ar.edu.info.unlp.ejercicioDemo;

public class Agua extends Topografia {

	@Override
	public double getProporcionAgua() {
		return 1;
	}

	@Override
	public double getProporcionTierra() {
		return 0;
	}
	
	@Override
	public boolean esIgualA(Topografia topografia) {
		return topografia.esIgualA_Agua(this);
	}

	@Override
	public boolean esIgualA_Agua(Topografia topografia) {
		return true;
	}

	@Override
	public boolean esIgualA_Tierra(Topografia topografia) {
		return false;
	}

	@Override
	public boolean esIgualA_Mixta(Topografia topografia) {
		return false;
	}

	@Override
	public boolean esIgualA_Pantano(Topografia topografia) {
		return false;
	}
	
}
