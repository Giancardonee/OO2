package ar.edu.info.unlp.ejercicioDemo;

public class FakeMixingTank implements MixingTank {
	  private int temperature = 20; // temperatura inicial
	  int mixerPower = 0;
	  private int heatPower = 0;
	  private int volume = 100; 
	  
	  
	@Override
	public boolean heatPower(int percentage) {
	        this.heatPower = percentage;

	        if (percentage == 100) {
	            this.temperature += 10; 
	        } else if (percentage == 75) {
	            this.temperature += 8; 
	        } else if (percentage == 50) {
	            this.temperature += 5; 
	        } else if (percentage == 25) {
	            this.temperature += 2; 
	        }

	        return true;
	}

	@Override
	public boolean mixerPower(int percentage) {
		this.mixerPower = percentage;
		return true;
	}

	@Override
	public boolean purge() {
		this.volume = 0;
		return true;
	}

	@Override
	public int upTo() {
		return this.volume;
	}

	@Override
	public int temperature() {
		return this.temperature;
	}
	
	public int getMixerPower()
	{
		return this.mixerPower;
	}

}
