package org.example;

import java.util.ArrayList;
import java.util.List;

public class Agrupacion {
    private String nombreGrupo;
    private List<Persona> miembros; // Relación de agregación (acepta Cosplayers y Artistas por Polimorfismo)
    private Categoria categoriaPrincipal;

    public Agrupacion(String nombreGrupo, Categoria categoriaPrincipal) {
        this.nombreGrupo = nombreGrupo;
        this.categoriaPrincipal = categoriaPrincipal;
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(Persona persona) {
        miembros.add(persona);
    }

    public void eliminarMiembro(Persona persona) {
        miembros.remove(persona);
    }

    public void mostrarInformacion() {
        System.out.println(" AGRUPACION ");
        System.out.println("Grupo: " + nombreGrupo);
        System.out.println("Categoria principal:");
        categoriaPrincipal.mostrarInformacion();    }

    // Getters y Setters
    public String getNombreGrupo() { return nombreGrupo; }
    public void setNombreGrupo(String nombreGrupo) { this.nombreGrupo = nombreGrupo; }
    public List<Persona> getMiembros() { return miembros; }
    public Categoria getCategoriaPrincipal() { return categoriaPrincipal; }
    public void setCategoriaPrincipal(Categoria categoriaPrincipal) { this.categoriaPrincipal = categoriaPrincipal; }
}
