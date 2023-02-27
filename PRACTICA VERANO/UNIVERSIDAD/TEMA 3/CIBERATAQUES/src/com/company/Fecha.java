package com.company;

import java.util.Objects;

public class Fecha {
    private int dia;
    private String mes;
    private int year;

    public Fecha(){
        this(1,"enero", 2022);
    }

    public Fecha(int dia, String mes, int year){
        this.dia= dia;
        this.mes= mes;
        this.year= year;
    }

    public String toString(){
        return "Dia: "+dia+" Mes: "+mes+" Año: "+year;
    }

   public boolean equals (Fecha fecha){
        return  dia== fecha.dia && mes.equals(fecha.mes) && year== fecha.year;
   }


}
