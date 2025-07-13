package ar.edu.info.unlp.ejercicioDemo;
public class Paquete implements IPaquete {
    private String descripcion;
    private String destinatario;
    private String direccionDestino;
    private double valorDeclarado;

    public Paquete(String descripcion, String destinatario, String direccionDestino, double valorDeclarado) {
        this.descripcion = descripcion;
        this.destinatario = destinatario;
        this.direccionDestino = direccionDestino;
        this.valorDeclarado = valorDeclarado;
    }

    public String getDestinatario() {return destinatario;}
    public String getDireccionDestino() {return direccionDestino;}
    
    @Override
    public double obtenerValorDeclarado() {return this.valorDeclarado;}
    
    @Override
    public double obtenerCostoEnvio() {
       return this.valorDeclarado * 0.05;
    }

    @Override
    public String obtenerDescripcion() {
        return this.descripcion;
    }
    
}
