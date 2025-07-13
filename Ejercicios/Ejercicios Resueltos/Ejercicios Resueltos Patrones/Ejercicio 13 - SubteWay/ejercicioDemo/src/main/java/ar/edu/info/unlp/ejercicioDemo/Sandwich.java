package ar.edu.info.unlp.ejercicioDemo;

public class Sandwich {
	private String pan;
	private String aderezo;
	private String principal;
	private String adicional;
	
	private double precioAderezo;
	private double precioPrincipal;
	private double precioAdicional;
	private double precioPan;
	
	public void setPan (String nombrePan, double precioPan)
	{
		this.pan = nombrePan;
		this.precioPan = precioPan;
	}
	
	public void setAderezo (String nombreAderezo, double precioAderezo)
	{
		this.aderezo = nombreAderezo;
		this.precioAderezo = precioAderezo;
	}
	
	public void setPrincipal(String nombrePrincipal, double precioPrincipal)
	{
		this.principal = nombrePrincipal;
		this.precioPrincipal = precioPrincipal;
	}
	
	public void setAdicional (String nombreAdicional, double precioAdicional)
	{
		this.adicional = nombreAdicional;
		this.precioAdicional = precioAdicional;
	}
	
	public double calcularPrecio()
	{
		return this.precioAderezo + this.precioAdicional + this.precioPan + this.precioPrincipal;
	}
	
	 @Override
	    public String toString() {
	        return "Sandwich [pan=" + pan + ", aderezo=" + aderezo + ", principal=" + principal + ", adicional=" + adicional
	                + ", precio=" + calcularPrecio() + "]";
	    }
	
}
