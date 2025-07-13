package ar.edu.info.unlp.ejercicioDemo;

public class Mensajero {
	private EstrategiaCifrador cifrador;
	
	public Mensajero(EstrategiaCifrador cifrador)
	{
		this.setEstrategia(cifrador);
	}
	
	
	// tambien sirve para poder cambiar de estrategia dinamicamente: 
	public void setEstrategia (EstrategiaCifrador cifrador)
	{
		this.cifrador = cifrador;
	}
	
	public void enviar (String mensaje) {
		this.cifrador.cifrar(mensaje);
	}
	
	public void recibir (String mensaje)
	{
		this.cifrador.descifrar(mensaje);
	}
}
