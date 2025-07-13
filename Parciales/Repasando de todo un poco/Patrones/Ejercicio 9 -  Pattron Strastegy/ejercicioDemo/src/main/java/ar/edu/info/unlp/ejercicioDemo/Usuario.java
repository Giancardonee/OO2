package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<AutoEnAlquiler> autosEnAlquiler;
    
    public Usuario(String nombre)
    {
        this.nombre = nombre;
        this.autosEnAlquiler = new LinkedList<>();
    }
    
    public void agregarAlquiler(AutoEnAlquiler alquiler)
    {
        this.autosEnAlquiler.add(alquiler);
    }
    
}
