package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class ProcessStepTest {
	 @Test
	    public void testLightMix_Success() {
	        MixingTank mockTank = Mockito.mock(MixingTank.class);
	        Mockito.when(mockTank.heatPower(20)).thenReturn(true);
	        Mockito.when(mockTank.mixerPower(5)).thenReturn(true);

	        LightMix lightMix = new LightMix();
	        lightMix.execute(mockTank);

	        assertTrue(lightMix.isDone());
	        Mockito.verify(mockTank).heatPower(20);
	        Mockito.verify(mockTank).mixerPower(5);
	    }

	    @Test
	    public void testLightMix_Failure() {
	        MixingTank mockTank = Mockito.mock(MixingTank.class);
	        Mockito.when(mockTank.heatPower(20)).thenReturn(false);
	        Mockito.when(mockTank.mixerPower(5)).thenReturn(true);

	        LightMix lightMix = new LightMix();
	        lightMix.execute(mockTank);

	        assertFalse(lightMix.isDone());
	    }

	    @Test
	    public void testPurge_Success() {
	        MixingTank mockTank = Mockito.mock(MixingTank.class);
	        Mockito.when(mockTank.heatPower(0)).thenReturn(true);
	        Mockito.when(mockTank.mixerPower(0)).thenReturn(true);
	        Mockito.when(mockTank.purge()).thenReturn(true);

	        Purge purge = new Purge();
	        purge.execute(mockTank);

	        assertTrue(purge.isDone());
	        Mockito.verify(mockTank).heatPower(0);
	        Mockito.verify(mockTank).mixerPower(0);
	        Mockito.verify(mockTank).purge();
	    }

	    @Test
	    public void testPurge_Failure() {
	        MixingTank mockTank = Mockito.mock(MixingTank.class);
	        Mockito.when(mockTank.heatPower(0)).thenReturn(true);
	        Mockito.when(mockTank.mixerPower(0)).thenReturn(false);

	        Purge purge = new Purge();
	        purge.execute(mockTank);

	        assertFalse(purge.isDone());
	    }
}
