package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public class JSONSimpleAdapter extends VoorheesExporter{
	private JSONSimple adaptee; 
	
	
	 // Constructor del adaptador
    public JSONSimpleAdapter() {
    	adaptee = new JSONSimple();
    }

    // Método para exportar un objeto Socio a JSON
    public String exportar(Socio socio) {
    	adaptee.clearObject();  // Limpiamos el objeto actual antes de agregar nuevos campos
    	adaptee.put("nombre", socio.getNombre());  // Agregamos los campos del Socio al objeto JSON
    	adaptee.put("legajo", socio.getLegajo());
    	adaptee.put("email", socio.getEmail());
        return adaptee.getObjectAsJSONString();  // Convertimos el objeto a String JSON
    }

    // Método para exportar una lista de objetos Socio a JSON
    public String exportar(List<Socio> socios) {
    	adaptee.clearArray();  // Limpiamos la lista actual
        for (Socio socio : socios) {
            exportar(socio);  // Exportamos cada socio al objeto JSON
            adaptee.addObjectToArray();  // Añadimos cada objeto a la lista de objetos
        }
        return adaptee.getArrayAsJSONString();  // Devolvemos la lista como String JSON
    }
    
}
