package com.company;

public enum Estacion {

    PRIMAVERA (20, "es primavera"), VERANO (40, "es verano"), OTONO (10, "es otoño"), INVIERNO( 0, "es invierno");

    private int temperatura;
    private String estacion;

    Estacion(int i, String estacion) {
        this.temperatura= i;
        this.estacion= estacion;
    }

    public void mostrar(){
        System.out.println(temperatura+" "+estacion);
    }

    public void esMismaEstacion(Estacion estacion1){
        if (this.estacion.equals(estacion1.estacion)){
            System.out.println("son iguales");
        }else {
            System.out.println("no lo son");
        }
    }
}
