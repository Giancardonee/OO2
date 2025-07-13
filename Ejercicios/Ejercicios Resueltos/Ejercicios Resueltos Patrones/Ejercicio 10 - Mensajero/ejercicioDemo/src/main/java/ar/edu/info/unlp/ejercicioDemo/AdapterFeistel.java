package ar.edu.info.unlp.ejercicioDemo;

public class AdapterFeistel implements EstrategiaCifrador {
	private FeistelCipher adaptee;
	
	public AdapterFeistel(String keyStr)
	{
		this.adaptee = new FeistelCipher(keyStr);
	}
	
	@Override
	public String cifrar(String mensaje) {
		return this.adaptee.encode(mensaje);
	}

	@Override
	public String descifrar(String mensaje) {
		// Feistel usa encode también para desencriptar
        return adaptee.encode(mensaje);
	}
}
