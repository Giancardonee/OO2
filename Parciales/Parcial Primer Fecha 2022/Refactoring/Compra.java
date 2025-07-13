import java.util.List;

public class Compra {
    private List<Producto> productos;
    private double subtotal;
    private double envio;
    private String estado;

    public Compra(List<Producto> productos, double factorEnvio)
    {
        this.productos = productos;
        this.subtotal = this.calcularSubtotal();
        this.envio = this.calcularCostoEnvio(factorEnvio);
        this.estado = "unEstado";
    }

    private double calcularSubtotal()
    {
        return productos.stream()
                .mapToDouble(prod -> prod.getPrecio())
                .sum();
    }

    private double calcularCostoEnvio(double factorEnvio)
    {
        return  this.subtotal * factorEnvio;
    }

    public double getSubtotal()
    {
        return this.subtotal;
    }
}
