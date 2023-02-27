package com.company;

import java.util.Objects;

public class Fecha {
    private int dia;
    private int mes;
    private int year;

    public Fecha(int dia, int mes, int year){
        this.dia=dia;
        this.mes= mes;
        this.year= year;
    }

    public String toString(){
        return dia+"/"+mes+"/"+year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return dia == fecha.dia && mes == fecha.mes && year == fecha.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, year);
    }
}
