package com.company;

public class Tridimensional extends  Bidimensional{

    private int z;

    public Tridimensional(int x, int y, int z){
        super(x,y);
        this.z= z;
    }


    public void desplazamiento(int x, int y, int z){
        super.desplazamiento(x,y);
        this.z= this.z+z;
    }

    public String toString(){
        return super.toString()+" z:"+z;
    }

    public void distancia(int x, int y, int z){
        super.distancia(x,y);
        int distanciaZ= this.z-z;
        System.out.println(" "+z);
    }
}
