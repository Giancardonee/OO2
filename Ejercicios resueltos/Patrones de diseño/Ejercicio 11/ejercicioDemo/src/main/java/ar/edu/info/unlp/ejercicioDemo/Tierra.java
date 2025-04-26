package ar.edu.info.unlp.ejercicioDemo;

public class Tierra extends Topografia {

	@Override
	public double getProporcionAgua() {
		return 0;
	}

	@Override
	public boolean esIgualA(Topografia topografia) {
		return topografia.esIgualA_Tierra(this);
	}

	@Override
	public boolean esIgualA_Agua(Topografia topografia) {
		return false;
	}

	@Override
	public boolean esIgualA_Tierra(Topografia topografia) {
		return true;
	}

	@Override
	public boolean esIgualA_Mixta(Topografia topografia) {
		return false;
	}
	
}
