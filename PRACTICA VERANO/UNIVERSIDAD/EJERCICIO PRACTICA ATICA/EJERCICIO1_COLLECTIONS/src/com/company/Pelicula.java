package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Pelicula {

    private String titulo;
    private int year;
    private ArrayList<String> tipo;

    public Pelicula(String titulo,int year, ArrayList<String> tipo){
        this.titulo= titulo;
        this.year=year;
        this.tipo= new ArrayList<>();
        this.tipo= tipo;
    }

    public String toString(){
        return "titulo: "+titulo+" año: "+year+"\n tipo: \n"+tipo+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return year == pelicula.year && titulo.equals(pelicula.titulo) && tipo.equals(pelicula.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, year, tipo);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getYear() {
        return year;
    }
}
