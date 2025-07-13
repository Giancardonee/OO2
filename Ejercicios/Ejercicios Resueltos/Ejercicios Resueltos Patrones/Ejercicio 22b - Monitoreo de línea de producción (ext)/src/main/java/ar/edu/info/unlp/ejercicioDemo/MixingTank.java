package ar.edu.info.unlp.ejercicioDemo;

public interface MixingTank {
    boolean heatPower(int percentage);
    boolean mixerPower(int percentage);
    boolean purge();
    int upTo();
    int temperature();
}
