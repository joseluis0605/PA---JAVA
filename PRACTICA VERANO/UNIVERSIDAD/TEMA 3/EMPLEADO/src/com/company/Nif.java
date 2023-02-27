package com.company;

public class Nif {
    private long numero;
    private String letra;

    public Nif(long numero, String letra){
        this.numero= numero;
        this.letra= letra;
    }

    public String toString(){
        return " DNI: "+ numero+letra;
    }

    public boolean igual(Nif nif){
        return  this.numero== nif.numero && this.letra.equals(nif.letra);
    }
}
