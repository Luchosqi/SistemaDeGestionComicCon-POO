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
        System.out.println("Artista");
        System.out.println("Nombre        : " + nombre);
        System.out.println("Pais de origen: " + paisOrigen);
        System.out.println("Edad          : " + edad + " años");
        System.out.println("Marca tableta : " + marcaTableta);
        System.out.println("Artbooks pub  : " + cantidadArtbooksPublicados);
        System.out.print("Categorías      : ");
        for (Categoria c : categorias) {
            System.out.print(c.getNombre() + " ");

        }
    }

    @Override
    public void realizarPresentacion() {
        System.out.println("PRESENTACIÓN DE ARTISTA");
        System.out.println(nombre + " muestra su portafolio digital dibujado con tableta " + marcaTableta );
        System.out.println("Ha publicado " + cantidadArtbooksPublicados + " artbook disponibles en el evento");
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
