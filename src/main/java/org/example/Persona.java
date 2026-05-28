package org.example;


import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
    protected String nombre;
    protected String paisOrigen;
    protected int edad;
    protected List<Categoria> categorias; // Relación Muchos a Muchos

    public Persona(String nombre, String paisOrigen, int edad) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.edad = edad;
        this.categorias = new ArrayList<>();
    }

    // Métodos de negocio a completar por el estudiante
    public void agregarCategoria(Categoria categoria) {
            categorias.add(categoria);
    }

    public void eliminarCategoria(Categoria categoria) {
        categorias.remove(categoria);
    }

    public abstract void mostrarInformacion();

    // Getters y Setters básicos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public List<Categoria> getCategorias() {
        return categorias;
    }
}
