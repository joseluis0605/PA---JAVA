package com.company;

public class Cancion {
    private String titulo;
    private int minutos;
    private int segundos;

    public Cancion(String titulo, int minutos, int segundos){
        this.titulo= titulo;
        this.minutos= minutos;
        this.segundos= segundos;
    }

    public String toString(){
        return "Titulo: "+titulo+ " --> "+minutos+":"+segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
}
