package org.example;


public class Main {
    public static void main(String[] args) {
        // 1. Instancias de objetos
        // Deben de cambiar estos objetos, creen los propios suyos, estos estan de referencia.

        Categoria animeCat = new Categoria("Manga y Anime", 50, 9.5);
        Categoria arteCat = new Categoria("Ilustración Digital", 30, 8.0);

        Cosplayer cosplayer1 = new Cosplayer("Luis", "Chile", 20, 5, EstiloCosplay.ANIME);
        Artista artista1 = new Artista("Camila", "México", 22, "Wacom Intuos", 3);

        Agrupacion comunidadAnime = new Agrupacion("Team Otaku UFRO", animeCat);
        Panel panelPrincipal = new Panel(animeCat, "15:30 hrs");

        panelPrincipal.agregarPanelista(cosplayer1);
        panelPrincipal.mostrarInformacion();
        // --- SECCIÓN DE PRUEBAS ---
        // Ej: agregar personas a categorías, meter miembros a la agrupación, montar el panel y llamar a mostrarInformacion().


    }
}