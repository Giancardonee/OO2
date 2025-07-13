package com.mycompany.facultad;
public class Vehiculo {
    private double precioPorDia; 
    private int kilometraje;
    private int antiguedad;
    private double precioPorKm;
    
    public double getPrecioPorDia(){return this.precioPorDia;} 
    public int getKilometros() {return this.kilometraje;}
    public int getAntiguedad() {return this.antiguedad;}
    public double getPrecioPorKm() {return this.precioPorKm;}

    public int calcularKmRecorridos(int kmInicial)
    { return this.kilometraje - kmInicial;}
}

