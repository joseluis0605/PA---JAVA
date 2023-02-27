package com.company.amenaza;

import java.util.Objects;

public class Amenaza {

    private int id;
    private Urgencia urgencia;
    private Dificultad dificultad;

    public Amenaza(int id){
        this.id= id;
        this.urgencia= Urgencia.MEDIA;
        this.dificultad= Dificultad.BAJA;
    }





    //metodo equals get and set

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amenaza amenaza = (Amenaza) o;
        return id == amenaza.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    protected void setUrgencia(Urgencia urgencia) {
        this.urgencia = urgencia;
    }

    protected void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    protected int getId() {
        return id;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public Urgencia getUrgencia() {
        return urgencia;
    }
}
