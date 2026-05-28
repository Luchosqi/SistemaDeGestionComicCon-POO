package org.example;

public class Artista extends Persona implements Interactivable {
    private String marcaTableta;
    private int cantidadArtbooksPublicados;

    public Artista(String nombre, String paisOrigen, int edad, String marcaTableta, int cantidadArtbooksPublicados) {
        super(nombre, paisOrigen, edad);
        this.marcaTableta = marcaTableta;
        this.cantidadArtbooksPublicados = cantidadArtbooksPublicados;
    }

    @Override
    public void mostrarInformacion() {
        // TODO: Completar lógica método (imprimir datos base de Persona y específicos de Artista)
    }

    @Override
    public void realizarPresentacion() {
        // TODO: Completar lógica método (simular presentación, mostrar portafolio y artbooks)
    }

    // Getters y Setters
    public String getMarcaTableta() {
        return marcaTableta;
    }

    public void setMarcaTableta(String marcaTableta) {
        this.marcaTableta = marcaTableta;
    }

    public int getCantidadArtbooksPublicados() {
        return cantidadArtbooksPublicados;
    }

    public void setCantidadArtbooksPublicados(int cantidadArtbooksPublicados) {
        this.cantidadArtbooksPublicados = cantidadArtbooksPublicados;
    }

    @Override
    public String toString() {
        return "Artista: " + getNombre()
                + " | Tableta: " + marcaTableta           // propio → directo
                + " | Artbooks: " + cantidadArtbooksPublicados; // propio → directo
    }
}
