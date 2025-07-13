package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.BeforeEach;

public class AseguradoraTest {
    Persona persona; 
    
    @BeforeEach
    void setUp()
    {
        persona = new Persona(50, new SinPromocion());
        Vehiculo auto1 = new Vehiculo("Renault 11", 1998, 680000, 4, persona);
        Vehiculo auto2 = new Vehiculo("Renault Clio", 2001, 1200000, 5, persona);
        Seguro poliza1 = new ContraTerceros(auto1);
        Seguro poliza2 = new ContraTerceros(auto2);
        
        persona.agregarPoliza(poliza1);
        persona.agregarPoliza(poliza2);
    }
}
