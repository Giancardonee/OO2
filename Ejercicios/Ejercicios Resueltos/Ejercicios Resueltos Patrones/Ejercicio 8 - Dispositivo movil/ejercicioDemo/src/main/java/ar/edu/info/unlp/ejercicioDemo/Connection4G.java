package ar.edu.info.unlp.ejercicioDemo;

public class Connection4G {
	private String symb;
	
	public Connection4G() {
		this.symb = "4G";
	}
	
	public String transmitir(String data, Integer crc)
	{
		return "4G: " + data + " " + crc;
	}
	
	public String getSymb() {
		return this.symb;
	}
}
