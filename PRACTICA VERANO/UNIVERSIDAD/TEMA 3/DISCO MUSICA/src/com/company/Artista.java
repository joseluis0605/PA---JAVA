package com.company;

public class Artista {

    private String nombre;

    public Artista(String nombre){
        this.nombre= nombre;
    }

    public String toString(){
        return nombre;
    }

    public boolean coincideArtista(Artista artista) {
        return this.nombre.equalsIgnoreCase(artista.nombre);
    }
}
