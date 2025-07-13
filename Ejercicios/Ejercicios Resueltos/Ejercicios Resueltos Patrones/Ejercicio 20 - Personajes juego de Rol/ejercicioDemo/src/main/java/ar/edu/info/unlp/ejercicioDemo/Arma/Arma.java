package ar.edu.info.unlp.ejercicioDemo.Arma;

import ar.edu.info.unlp.ejercicioDemo.Armadura.Armadura;

public interface Arma {
	
	public double calcularDanioContra (Armadura armadura);
	public double danioContraArmaduraDeCuero();
	public double danioContraArmaduraDeHierro();
	public double danioContraArmaduraDeAcero();
	
}
