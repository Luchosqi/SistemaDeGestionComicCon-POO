package org.example;

public class Cosplayer extends Persona implements Interactivable {
    private int cantidadTrajes;
    private EstiloCosplay estiloPreferido;

    public Cosplayer(String nombre, String paisOrigen, int edad, int cantidadTrajes, EstiloCosplay estiloPreferido) {
        super(nombre, paisOrigen, edad);
        this.cantidadTrajes = cantidadTrajes;
        this.estiloPreferido = estiloPreferido;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("COSPLAYER");
        System.out.println("Nombre       : " + nombre);
        System.out.println("Pais de origen: " + paisOrigen);
        System.out.println("Edad         : " + edad + " años");
        System.out.println("Estilo       : " + estiloPreferido);
        System.out.println("Trajes       : " + cantidadTrajes);
        System.out.print("Categorías   : ");
        for (Categoria c : categorias) {
            System.out.print(c.getNombre() + " ");

        }
    }

    @Override
    public void realizarPresentacion() {
        int tiempoEstimado = 30 + (cantidadTrajes - 1) * 15;
        System.out.println(" PRESENTACIÓN DE COSPLAYER ");
        System.out.println(nombre + " realiza su presentacion con estilo " + estiloPreferido);
        System.out.println("Tiempo estimado de preparación: " + tiempoEstimado + " minutos");
        System.out.println("Cuenta con " + cantidadTrajes + " traje(s) para el evento");
    }


    // Getters y Setters
    public int getCantidadTrajes() {
        return cantidadTrajes;
    }

    public void setCantidadTrajes(int cantidadTrajes) {
        this.cantidadTrajes = cantidadTrajes;
    }

    public EstiloCosplay getEstiloPreferido() {
        return estiloPreferido;
    }

    public void setEstiloPreferido(EstiloCosplay estiloPreferido) {
        this.estiloPreferido = estiloPreferido;
    }

    @Override
    public String toString() {
        return "Cosplayer: " + getNombre()
                + " | Estilo: " + estiloPreferido
                + " | Trajes: " + cantidadTrajes;
    }
}


