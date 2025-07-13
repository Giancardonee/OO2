package ar.edu.info.unlp.ejercicioDemo;

public class Purge extends ProcessStep{

	@Override
	protected boolean basicExecute(MixingTank tank) {
		if (tank.upTo() == 0) {
            return false;
        }
        tank.heatPower(0);
        tank.mixerPower(0);
        tank.purge();
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        return tank.upTo() == 0;
	}

}
