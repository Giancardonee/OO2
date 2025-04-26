package ar.edu.info.unlp.ejercicioDemo;

public class Pantano extends Topografia {

	@Override
	public double getProporcionAgua() {
		return 0.7;
	}

	@Override
	public double getProporcionTierra() {
		return 0.3;
	}
	
	@Override
	public boolean esIgualA(Topografia topografia) {
		return false;
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
		return false;
	}

	@Override
	public boolean esIgualA_Pantano(Topografia topografia) {
		return true;
	}
	
}
