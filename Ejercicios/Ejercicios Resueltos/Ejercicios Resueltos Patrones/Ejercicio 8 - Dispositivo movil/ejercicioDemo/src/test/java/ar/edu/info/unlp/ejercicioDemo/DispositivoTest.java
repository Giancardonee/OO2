package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DispositivoTest {
	private Dispositivo dispositivo;
    private Ringer ringer;
    private Display display;
    private CRC_Calculator crc16;
    private CRC_Calculator crc32;
    private Connection wifi;
    private Connection adapter4G;

    @BeforeEach
    public void setUp() {
        ringer = new Ringer();
        display = new Display();
        crc16 = new CRC16_Calculator();
        crc32 = new CRC32_Calculator();
        wifi = new WifiConn();
        adapter4G = new AdapterConnection4G();
        dispositivo = new Dispositivo(ringer, crc16, wifi, display);
    }

    @Test
    public void testSendConWifi() {
        String data = "Hola mundo";
        int expectedCRC = (int) crc16.crcFor(data);
        String resultado = dispositivo.send(data);
        assertEquals("Wifi: Hola mundo " + expectedCRC, resultado);
    }

    @Test
    public void testConnectWith() {
        dispositivo.connectWith(adapter4G);
        String data = "Probando";
        int expectedCRC = (int) crc16.crcFor(data);
        String resultado = dispositivo.send(data);
        assertEquals("4G: Probando " + expectedCRC, resultado);
    }

    @Test
    public void testConfigureCRC() {
        dispositivo.configureCRC(crc32);
        String data = "Cambio de CRC";
        int expectedCRC = (int) crc32.crcFor(data);
        String resultado = dispositivo.send(data);
        assertEquals("Wifi: Cambio de CRC " + expectedCRC, resultado);
    }
}
