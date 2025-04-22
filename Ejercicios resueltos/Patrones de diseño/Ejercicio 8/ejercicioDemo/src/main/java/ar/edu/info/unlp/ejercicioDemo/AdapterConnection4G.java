package ar.edu.info.unlp.ejercicioDemo;

public class AdapterConnection4G implements Connection {
	private Connection4G connection4G; 
	
	
	public AdapterConnection4G ()
	{
		this.connection4G = new Connection4G();
	}
	
	@Override
	public String sendData(String data, Integer crc) {
		return this.connection4G.transmitir(data, crc);
	}

	@Override
	public String pict() {
		return this.connection4G.getSymb();
	}

}
