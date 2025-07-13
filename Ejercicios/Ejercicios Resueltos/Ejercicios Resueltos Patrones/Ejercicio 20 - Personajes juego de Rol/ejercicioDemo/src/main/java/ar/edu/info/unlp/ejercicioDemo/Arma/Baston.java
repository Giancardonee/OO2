package ar.edu.info.unlp.ejercicioDemo.Arma;

import ar.edu.info.unlp.ejercicioDemo.Armadura.Armadura;

public class Baston implements Arma {

	@Override
	public double calcularDanioContra(Armadura armadura) {
		return armadura.recibirDanioDe(this);
	}

	@Override
	public double danioContraArmaduraDeCuero() {
		return 2;
	}

	@Override
	public double danioContraArmaduraDeHierro() {
		return 1;
	}

	@Override
	public double danioContraArmaduraDeAcero() {
		return 1;
	}

}
