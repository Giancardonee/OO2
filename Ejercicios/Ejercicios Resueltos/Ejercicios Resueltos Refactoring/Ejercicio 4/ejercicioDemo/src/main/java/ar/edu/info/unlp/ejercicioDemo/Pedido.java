package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Pedido 
{
	private Cliente cliente;
	  private List<Producto> productos;
	  private FormaDePago formaPago;

	  public Pedido(Cliente cliente, List<Producto> productos, FormaDePago formaPago) {
	    if (!"efectivo".equals(formaPago)
	        && !"6 cuotas".equals(formaPago)
	        && !"12 cuotas".equals(formaPago)) {
	      throw new Error("Forma de pago incorrecta");
	    }
	    this.cliente = cliente;
	    this.productos = productos;
	    this.formaPago = formaPago;
	  }

	  
	  // Refactor 2 realizado 
	  public double getCostoTotal() {
		  double costoProductos = this.productos.stream()
				  .mapToDouble(p -> p.getPrecio())
				  .sum();
		  
	    // Refactor 2 realizado : Se calcula el extra de manera polimorfica. 
	    double extraFormaPago = this.formaPago.calcularExtraPago(costoProductos); 
	    
	    
	    // Regactor 4 
	    return calcularPrecioConDescuento(costoProductos, extraFormaPago); 
	  }
	  
	  private double calcularPrecioConDescuento (double costoProducto, double extraFormaPago)
	  {
		  if (cliente.calcularAnhosFechaAlta() > 5)
			  return (costoProducto + extraFormaPago)* 0.9;
		  
		  return costoProducto + extraFormaPago;
	  }
	 
}
