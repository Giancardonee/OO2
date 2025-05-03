package ar.edu.info.unlp.ejercicioDemo.Armadura;

import ar.edu.info.unlp.ejercicioDemo.Arma.Arma;

public class ArmaduraCuero implements Armadura {

	@Override
	public double recibirDanioDe(Arma arma) {
		return arma.danioContraArmaduraDeAcero();
	}

}
