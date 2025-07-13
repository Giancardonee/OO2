package ar.edu.unlp.info.oo2.biblioteca;

import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONSimple {
	    private JSONObject objetoActual;
	    private JSONArray listaObjetos;

	    public JSONSimple() {
	        objetoActual = new JSONObject();
	        listaObjetos = new JSONArray();
	    }

	    // Agrega un campo al objeto actual
	    public void put(String clave, Object valor) {
	        objetoActual.put(clave, valor);
	    }

	    // Agrega el objeto actual a la lista, y lo reinicia para uno nuevo
	    public void addObjectToArray() {
	        listaObjetos.add(objetoActual);
	        objetoActual = new JSONObject(); // reinicia para nuevo objeto
	    }

	    // Devuelve el JSON string del objeto actual
	    public String getObjectAsJSONString() {
	        return objetoActual.toJSONString();
	    }

	    // Devuelve el JSON string del array completo
	    public String getArrayAsJSONString() {
	        return listaObjetos.toJSONString();
	    }

	    // Parsea un string JSON y lo guarda como objeto actual
	    public boolean parseObject(String jsonString) throws org.json.simple.parser.ParseException {
	        JSONParser parser = new JSONParser();
			objetoActual = (JSONObject) parser.parse(jsonString);
			return true;
	    }

	    // Parsea un string JSON y lo guarda como lista de objetos
	    public boolean parseArray(String jsonString) throws org.json.simple.parser.ParseException {
	        JSONParser parser = new JSONParser();
			listaObjetos = (JSONArray) parser.parse(jsonString);
			return true;
	    }

	    // Devuelve el valor de una clave del objeto actual
	    public Object get(String clave) {
	        return objetoActual.get(clave);
	    }

	    // Devuelve el tamaño del array
	    public int getArraySize() {
	        return listaObjetos.size();
	    }

	    // Devuelve un campo de un objeto del array (índice y clave)
	    public Object getFromArray(int index, String clave) {
	        if (index >= 0 && index < listaObjetos.size()) {
	            JSONObject obj = (JSONObject) listaObjetos.get(index);
	            return obj.get(clave);
	        }
	        return null;
	    }

	    // Limpia el objeto actual
	    public void clearObject() {
	        objetoActual = new JSONObject();
	    }

	    // Limpia la lista
	    public void clearArray() {
	        listaObjetos = new JSONArray();
	    }
}
