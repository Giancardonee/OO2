package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class usuarioBuilder {
	
	public static Cliente crearUsuario (String data, String nombre, String tipo)
	{
		switch (tipo.toLowerCase()) {
        case "juridica":
            return new ClienteJuridico(data,nombre);
        case "fisica":
            return new ClienteFisico(data,nombre);
        default:
            throw new IllegalArgumentException("Tipo de llamada no soportado: " + tipo);
    }
	}
}
