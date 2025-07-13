package ar.edu.info.unlp.ejercicioDemo;

public class LightMix extends ProcessStep {

	@Override
	protected boolean basicExecute(MixingTank tank) {
		 int initialTemp = tank.temperature();
	        tank.heatPower(100);
	        try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        int finalTemp = tank.temperature();
	        if (finalTemp - initialTemp == 10) {
	            tank.mixerPower(5);
	            return true;
	        }
	        return false;
	}

}
