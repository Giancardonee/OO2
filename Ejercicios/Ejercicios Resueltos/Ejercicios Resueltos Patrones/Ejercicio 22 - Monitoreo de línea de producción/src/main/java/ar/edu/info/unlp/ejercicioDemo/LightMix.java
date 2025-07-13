package ar.edu.info.unlp.ejercicioDemo;

public class LightMix extends ProcessStep {

	@Override
	protected boolean basicExecute(MixingTank tank) {
		return tank.heatPower(20) && tank.mixerPower(5);
	}

}
