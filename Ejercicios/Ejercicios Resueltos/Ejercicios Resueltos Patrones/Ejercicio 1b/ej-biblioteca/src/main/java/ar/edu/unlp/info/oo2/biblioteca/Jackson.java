package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jackson {
	private final ObjectMapper mapper;

    public Jackson() {
        this.mapper = new ObjectMapper();
    }

    // Método para exportar un objeto cualquiera a JSON
    public String toJSON(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Método para exportar una lista de objetos a JSON
    public String toJSON(List<?> lista) {
        try {
            return mapper.writeValueAsString(lista);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
