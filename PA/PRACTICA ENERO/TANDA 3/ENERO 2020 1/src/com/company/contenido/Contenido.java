package com.company.contenido;

import java.util.Objects;

public class Contenido {

    private String titulo;
    private int duracion;

    public Contenido(String titulo){
        this(titulo,0);
    }

    public Contenido(String titulo, int duracion){
        this.titulo= titulo;
        this.duracion= duracion;
    }

    public String toString(){
        return "titulo--> "+titulo+" "+duracion+"\n";
    }




    //EQUAL GETTER AND SETTER

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contenido contenido = (Contenido) o;
        return Objects.equals(titulo, contenido.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }


    public boolean esPelicula() {
        return false;
    }

    public String getTitulo() {
        return titulo;
    }

    protected void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
