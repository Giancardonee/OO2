package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LightMixTest {
	  @Test
	    public void testLightMixSuccess() throws InterruptedException {
	        FakeMixingTank tank = new FakeMixingTank();
	        LightMix lightMix = new LightMix();

	        int initialTemp = tank.temperature();
	        lightMix.execute(tank);

	        // Verificar que la temperatura aumentó 10ºC
	        Assertions.assertEquals(initialTemp + 10, tank.temperature());

	        // Verificar que se activó el mixer al 5%
	        Assertions.assertTrue(tank.mixerPower == 5);
	        Assertions.assertTrue(lightMix.isDone());
	    }

	    @Test
	    public void testLightMixFailure() throws InterruptedException {
	        FakeMixingTank tank = new FakeMixingTank();
	        LightMix lightMix = new LightMix();

	        tank.heatPower(50); // No alcanza el aumento de 10ºC
	        lightMix.execute(tank);

	        // Verificar que no se activó el mixer al 5%
	        Assertions.assertTrue(tank.getMixerPower() != 5);
	        Assertions.assertFalse(lightMix.isDone());
	    }
}
