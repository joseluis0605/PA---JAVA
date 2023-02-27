package com.company;

import java.util.ArrayList;

public class Pelicula {

    private String titulo;
    private int year;
    private ArrayList<String> tipo;

    public Pelicula(String titulo, int year, ArrayList<String> tipo){
        this.titulo=titulo;
        this.year= year;
        this.tipo= new ArrayList<>();
        this.tipo= tipo;
    }

    public String toString(){
        return "\n*****************\n"+this.titulo+" "+this.year+"\n"+this.tipo;
    }
}
