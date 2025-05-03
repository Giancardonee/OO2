package ar.edu.info.unlp.ejercicioDemo.Armadura;

import ar.edu.info.unlp.ejercicioDemo.Arma.Arma;

public class ArmaduraAcero implements Armadura{

	@Override
	public double recibirDanioDe(Arma arma) {
		return arma.danioContraArmaduraDeAcero();
	}

}
