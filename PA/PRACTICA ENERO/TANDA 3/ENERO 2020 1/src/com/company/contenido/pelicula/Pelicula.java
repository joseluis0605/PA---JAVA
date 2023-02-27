package com.company.contenido.pelicula;

import com.company.contenido.Contenido;

public class Pelicula extends Contenido {

    private Genero genero;

    public Pelicula(String titulo, int duracion, Genero genero){
        super(titulo, duracion);
        this.genero= genero;
    }

    @Override
    public boolean esPelicula() {
        return true;
    }

    public Genero getGenero() {
        return genero;
    }
}
