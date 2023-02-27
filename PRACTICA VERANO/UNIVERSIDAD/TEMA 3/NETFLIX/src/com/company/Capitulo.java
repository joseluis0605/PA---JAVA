package com.company;

public class Capitulo {

    private String nombre;
    private int duracion;

    public Capitulo(String nombre, int duracion){
        this.nombre= nombre;
        this.duracion= duracion;
    }

    public String toString(){
        return "Informacion sobre capitulo--> nombre:"+nombre+" y duracion: "+duracion;
    }

    public int getDuracion() {
        return duracion;
    }
}
