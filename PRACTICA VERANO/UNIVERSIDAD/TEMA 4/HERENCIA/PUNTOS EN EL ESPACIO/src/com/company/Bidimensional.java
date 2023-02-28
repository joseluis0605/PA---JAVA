package com.company;

public class Bidimensional {

    private int x;
    private int y;

    public Bidimensional(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void desplazamiento(int x, int y){
        this.x= this.x + x;
        this.y= this.y + y;
    }

    public String toString(){
        return "x:"+x +" y: "+y;
    }

    public void distancia(int x, int y){
        int distanciaX= this.x-x;
        int distanciaY= this.y-y;
        System.out.println("La distancia es de:"+x+" "+y);
    }
}
