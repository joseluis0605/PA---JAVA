package com.company;

public class Coche {

    private int numeroPuertas;
    private static int velocidadMax= 120;


    public Coche(int numeroPuertas){
        this.numeroPuertas= numeroPuertas;
    }

    public String toString(){
        return this.numeroPuertas+" velocidad: "+velocidadMax;
    }

    public void sumar1(){
        setVelocidadMax(velocidadMax+1);
    }

    public static void sumarV(){
        velocidadMax= velocidadMax +5;

    }

    public void setVelocidadMax(int velocidadMax) {
        Coche.velocidadMax = velocidadMax;
    }

    private int getNumeroPuertas() {
        return numeroPuertas;
    }

    private void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    private static int getVelocidadMax() {
        return velocidadMax;
    }
}
