package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Libro {

    private String titulo;
    private int precio;
    private ArrayList<Autor> autores;

    public Libro(String titulo, int precio){
        this.titulo=titulo;
        this.precio= precio;
        this.autores= new ArrayList<>();
    }

    public void addAutor(Autor autor){
        if (!autores.contains(autor)){
            this.autores.add(autor);
        }
    }

    public String toString(){
        return "titulo: "+titulo+" precio "+precio+"\n"+autores;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    public int getPrecio() {
        return precio;
    }
}
