package com.company;

import java.util.Objects;

public class Autor {
    private String nombre;
    private String id;
    private Fecha fecha;

    public Autor(String nombre, String id, Fecha fecha){
        this.nombre= nombre;
        this.id= id;
        this.fecha= fecha;
    }

    public String toString(){
        return nombre+" "+id+" "+fecha+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nombre, autor.nombre) && Objects.equals(id, autor.id) && Objects.equals(fecha, autor.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id, fecha);
    }
}
