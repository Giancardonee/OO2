package ar.edu.info.unlp.ejercicioDemo;
public class Sandwich {
    private String nombrePan;
    private double precioPan;
    private String nombreAderezo;
    private double precioAderezo;
    private String nombrePrincipal;
    private double precioPrincipal;
    private String nombreAdicional;
    private double precioAdicional;


    public Sandwich()
    {
        
    }

    public double calcularPrecio()
    {
        return this.precioPan + this.precioAderezo
                + this.precioPrincipal + this.precioAdicional;
    }
    
    public void setNombrePan(String nombrePan) {
        this.nombrePan = nombrePan;
    }

    public void setPrecioPan(double precioPan) {
        this.precioPan = precioPan;
    }

    public void setNombreAderezo(String nombreAderezo) {
        this.nombreAderezo = nombreAderezo;
    }

    public void setPrecioAderezo(double precioAderezo) {
        this.precioAderezo = precioAderezo;
    }

    public void setNombrePrincipal(String nombrePrincipal) {
        this.nombrePrincipal = nombrePrincipal;
    }

    public void setPrecioPrincipal(double precioPrincipal) {
        this.precioPrincipal = precioPrincipal;
    }

    public void setNombreAdicional(String nombreAdicional) {
        this.nombreAdicional = nombreAdicional;
    }

    public void setPrecioAdicional(double precioAdicional) {
        this.precioAdicional = precioAdicional;
    }

    
    
    
}
