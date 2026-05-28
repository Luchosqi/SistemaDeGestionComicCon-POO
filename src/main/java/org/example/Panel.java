package org.example;

import java.util.ArrayList;
import java.util.List;

public class Panel {
    private Categoria categoria;
    private List<Object> panelistas; // Almacena tanto instancias individuales (Persona) como grupales (Agrupacion)
    private String horaPresentacion;

    public Panel(Categoria categoria, String horaPresentacion) {
        this.categoria = categoria;
        this.horaPresentacion = horaPresentacion;
        this.panelistas = new ArrayList<>();
    }

    public void agregarPanelista(Object panelista) {
        if (panelista instanceof Persona || panelista instanceof Agrupacion) {
            panelistas.add(panelista);
        } else {
            System.out.println("Error: Solo se pueden agregar Personas o Agrupaciones.");
        }
    }

    public void eliminarPanelista(Object panelista) {
        panelistas.remove(panelista);
    }

    public void mostrarInformacion() {
        System.out.println("Categoria: "+categoria.getNombre()
                + "\n Hora presentacion: "+horaPresentacion+
                "\n Panelistas: " +panelistas);
            for (Object p : panelistas) {
                if (p instanceof Persona){
                    ((Persona) p).getNombre();
                } else if (p instanceof Agrupacion) {
                    ((Agrupacion)p).getMiembros();
                }
            }

    }

    // Getters y Setters
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public List<Object> getPanelistas() { return panelistas; }
    public String getHoraPresentacion() { return horaPresentacion; }
    public void setHoraPresentacion(String horaPresentacion) { this.horaPresentacion = horaPresentacion; }
}
