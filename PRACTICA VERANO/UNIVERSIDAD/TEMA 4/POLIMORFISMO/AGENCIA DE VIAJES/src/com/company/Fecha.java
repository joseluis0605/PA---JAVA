package com.company;

public class Fecha {

    private String mes;

    public Fecha(String mes){
        this.mes= mes;
    }

    public String toString(){
        return "Fecha: "+mes;
    }

    public boolean esVerano(){
        return mes.equals("junio") || mes.equals("julio") || mes.equals("agosto");
    }

    public boolean esInvierno(){
        return mes.equals("diciembre") || mes.equals("enero") || mes.equals("febrero");
    }

}
