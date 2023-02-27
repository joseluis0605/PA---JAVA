package com.company.contenido.serie;

import java.util.Objects;

public class Capitulo {

    private int id;
    private int duracion;

    public Capitulo(int id, int duracion){
        this.id=id;
        this.duracion=duracion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capitulo capitulo = (Capitulo) o;
        return id == capitulo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getDuracion() {
        return duracion;
    }
}
