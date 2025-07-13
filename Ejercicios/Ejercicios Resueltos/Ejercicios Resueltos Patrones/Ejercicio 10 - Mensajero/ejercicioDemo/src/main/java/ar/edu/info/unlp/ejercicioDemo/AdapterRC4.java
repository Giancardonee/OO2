package ar.edu.info.unlp.ejercicioDemo;

public class AdapterRC4 implements EstrategiaCifrador {
	private RC4 adaptee;
	private String clave;
	
	public AdapterRC4 (String clave)
	{
		this.clave = clave;
		this.adaptee = new RC4();
	}

	@Override
	public String cifrar(String mensaje) {
		return this.adaptee.encriptar(mensaje, this.clave); 
	}
	
	@Override
	public String descifrar(String mensaje) {
		return this.adaptee.desencriptar(mensaje, clave);
	}
	
}
