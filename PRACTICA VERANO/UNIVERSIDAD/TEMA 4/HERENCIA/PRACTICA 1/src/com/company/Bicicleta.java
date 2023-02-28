package com.company;

public class Bicicleta {

    private String marca;
    private String modelo;
    private int precioBase;

    public Bicicleta(String marca, String modelo, int precioBase){
        this.marca= marca;
        this.modelo= modelo;
        this.precioBase= precioBase;
    }

    protected int getPrecioBase() {
        return precioBase;
    }

    protected void modificar(int valor){
        setPrecioBase(valor);
    }

    private void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public boolean esDeEsaMarca (String marca){
        return this.marca.equals(marca);
    }

    public String toString(){
        return "marca: "+marca+" modelo: "+modelo+" precio: "+precioBase;
    }
}
