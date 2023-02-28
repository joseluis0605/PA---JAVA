package com.company;

public class Carretera extends  Bicicleta{

    private int peso;

    public Carretera(String marca, String modelo, int precioBase, int peso){
        super(marca, modelo, precioBase);
        this.peso= peso;
        changePeso(peso);
    }

    private void changePeso(int peso){
        if (peso < 6){
            int precio= getPrecioBase();
            precio= precio +200;
            modificar(precio);
        }else{
            int precio= getPrecioBase();
            precio= precio+50;
            modificar(precio);
        }
    }

    public String toString(){
        return super.toString()+" peso: "+peso;
    }

}
