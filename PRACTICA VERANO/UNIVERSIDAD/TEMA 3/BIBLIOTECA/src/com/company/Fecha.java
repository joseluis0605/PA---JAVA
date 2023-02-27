package com.company;

public class Fecha {

    private int dia;
    private String mes;
    private int year;

    public Fecha(int dia, String mes, int year){
        this.dia= dia;
        this.mes= mes;
        this.year= year;
    }

    public String toString(){
        return "Fecha: "+dia+"/"+mes+"/"+year;
    }

    public boolean esMismo(int year) {
        return this.year==year;
    }
}
