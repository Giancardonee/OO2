package ar.edu.info.unlp.ejercicioDemo;
import java.util.List;

public class Catalogo {
        private static List<Componente> componentes;
	
	public static void setComponentes(List<Componente> componentes) {
		Catalogo.componentes= componentes;
	}
	
	public static Componente getComponente(String descripcion) {
		return componentes.stream()
				.filter(compponent -> compponent.getDescripcion().equals(descripcion))
				.findFirst()
				.orElse(null);
	}
}
