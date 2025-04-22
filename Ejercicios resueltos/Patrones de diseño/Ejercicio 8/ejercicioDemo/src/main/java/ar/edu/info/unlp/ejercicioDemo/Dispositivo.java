package ar.edu.info.unlp.ejercicioDemo;

public class Dispositivo {
	private Ringer ringer;
	private CRC_Calculator calculator;
	private Connection connection;
	private Display display;
	
	public Dispositivo(Ringer ringer, CRC_Calculator strategyCalculator, Connection strategyConnection, Display display)
	{
		this.ringer = ringer;
		this.calculator = strategyCalculator;
		this.connection = strategyConnection;
		this.display = display;
	}
	
	public String send(String data) {
		int crc = (int) this.calculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public void connectWith (Connection connection)
	{
		this.connection = connection;
	}
	
	public void configureCRC(CRC_Calculator calculator)
	{
		this.calculator = calculator;
	}
	
	
}
