package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente {
	private String cuit;
	
	public ClienteJuridico(String data, String nombre) {
		super(nombre);
		this.cuit = data;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	@Override
	public double getPorcentajeDescuento() {
		return 0.15;
	}
}


