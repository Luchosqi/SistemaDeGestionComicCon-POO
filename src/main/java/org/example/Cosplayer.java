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
        // TODO: Completar lógica método (imprimir datos base de Persona y específicos de Cosplayer)
    }

    @Override
    public void realizarPresentacion() {
        // TODO: Completar lógica método (simular presentación e imprimir tiempo estimado de preparación)
    }

    // Getters y Setters
    public int getCantidadTrajes() { return cantidadTrajes; }
    public void setCantidadTrajes(int cantidadTrajes) { this.cantidadTrajes = cantidadTrajes; }
    public EstiloCosplay getEstiloPreferido() { return estiloPreferido; }
    public void setEstiloPreferido(EstiloCosplay estiloPreferido) { this.estiloPreferido = estiloPreferido; }

    @Override
    public String toString() {
        return "Cosplayer: " + getNombre()
                + " | Estilo: " + estiloPreferido
                + " | Trajes: " + cantidadTrajes;
    }
}

