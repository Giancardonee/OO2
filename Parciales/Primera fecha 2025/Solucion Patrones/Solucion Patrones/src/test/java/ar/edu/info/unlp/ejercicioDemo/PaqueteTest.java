
package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaqueteTest {
    IPaquete paquete;
    Servicios seguro;
    Servicios entregaExpress;
    
    @BeforeEach    
    void setUp() throws Exception {
         paquete = new Paquete("Caja de libros", "unDestinatario", "unaDireccionDestino",20000);
         seguro = new ConSeguro(paquete);
         entregaExpress = new EntregaExpress(seguro);
    }
    
    @Test
    public void testCostoFinalEnvio()
    {
        assertEquals(15000,entregaExpress.obtenerCostoEnvio());
    }
    
    @Test
    public void testDescripcion()
    {
        assertEquals("Caja de libros con seguro entrega express",entregaExpress.obtenerDescripcion());
    }
}
