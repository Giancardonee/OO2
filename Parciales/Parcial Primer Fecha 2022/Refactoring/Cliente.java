import java.util.LinkedList;
import java.util.List;

public class Cliente {
    private String nombre;
    private TipoCliente tipoCliente;
    private List<Compra> compras;

    public Cliente (String unNombre)
    {
        this.compras = new LinkedList<>();
        this.nombre = unNombre;
        this.tipoCliente = new ClienteBasico();
    }

    public Compra comprar (List<Producto> productos)
    {
        double factorEnvio = tipoCliente.calcularPorcentaje();
        Compra compra = new Compra(productos,factorEnvio);
        this.compras.add(compra);
        this.chequearCambioTipoCliente(this.montoAcumuladoEnCompras());

        return compra;
    }

    public double montoAcumuladoEnCompras()
    {
        return compras.stream()
                .mapToDouble(compra -> compra.getSubtotal())
                .sum();
    }

    private void chequearCambioTipoCliente(double montoAcumuladoEnCompras)
    {
        if (montoAcumuladoEnCompras > 10000) this.tipoCliente = new ClienteAdvance();
        else if (montoAcumuladoEnCompras > 5000) this.tipoCliente = new ClientePremium();
    }
}
