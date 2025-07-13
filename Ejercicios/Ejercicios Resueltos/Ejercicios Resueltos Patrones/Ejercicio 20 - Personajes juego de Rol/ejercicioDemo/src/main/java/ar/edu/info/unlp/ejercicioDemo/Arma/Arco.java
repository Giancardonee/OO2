package ar.edu.info.unlp.ejercicioDemo.Arma;

import ar.edu.info.unlp.ejercicioDemo.Armadura.Armadura;

public class Arco implements Arma{

	@Override
	public double calcularDanioContra(Armadura armadura) {
		return armadura.recibirDanioDe(this);
	}

	@Override
	public double danioContraArmaduraDeCuero() {
		return 5;
	}

	@Override
	public double danioContraArmaduraDeHierro() {
		return 3;
	}

	@Override
	public double danioContraArmaduraDeAcero() {
		return 2;
	}

}
