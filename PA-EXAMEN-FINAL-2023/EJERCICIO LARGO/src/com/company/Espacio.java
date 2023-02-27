package com.company;

import com.company.codigoProporcionado.TipoEvento;

import java.util.Objects;

public abstract class Espacio {

    private String id;
    private int capacidad;
    private int metros;
    private String direccion;
    private int coste;
    private TipoEvento tipoEvento;

    public Espacio(String id, int capacidad, int metros, String direccion, int coste, TipoEvento tipoEvento){
        this.id= id;
        this.capacidad= capacidad;
        this.metros= metros;
        this.direccion= direccion;
        this.coste= coste;
        this.tipoEvento= tipoEvento;
    }

    public abstract boolean esValido();

    @Override
    public String toString() {
        return "Espacio{" +
                "id='" + id + '\'' +
                ", capacidad=" + capacidad +
                ", metros=" + metros +
                ", direccion='" + direccion + '\'' +
                ", coste=" + coste +
                ", tipoEvento=" + tipoEvento +
                '}';
    }

    //METODO GETTER SETTER AND EQUAL

    // dos espacios son iguales solo por el nombre


    public int getMetros() {
        return metros;
    }

    public String getId() {
        return id;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Espacio espacio = (Espacio) o;
        return Objects.equals(id, espacio.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
