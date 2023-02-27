package com.company;

public class Ciberataque {

    private String nombreEmpresa;
    private Fecha fecha;

    public Ciberataque(String nombreEmpresa){
        this(nombreEmpresa, new Fecha());
    }

    public Ciberataque(String nombreEmpresa, Fecha fecha){
        this.nombreEmpresa= nombreEmpresa;
        this.fecha= fecha;
    }

    public String toString(){
        return "Nombre empresa: "+ nombreEmpresa+" con fecha: "+fecha;
    }

    public boolean coincide(Ciberataque ciberataque) {
        return this.fecha.equals(ciberataque.fecha);
    }
}
