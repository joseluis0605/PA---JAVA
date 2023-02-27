package com.company;

public abstract class Bicicleta {

    private String marca;
    private String modelo;
    private int precioBase;

    public Bicicleta (String marca, String modelo, int precioBase){
        this.marca= marca;
        this.modelo= modelo;
        this.precioBase= precioBase;
    }

    protected abstract  void modificadorBicicletas();

    protected int getPrecioBase() {
        return precioBase;
    }
    protected void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String toString(){
        return "marca: "+marca+" modelo: "+modelo+" precio base: "+precioBase;
    }

    //GETTER y SETTER
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public abstract boolean esMONTANA();

    public abstract boolean esCARRETERA();

    public boolean esMARCA(String marca) {
        return this.marca.equals(marca);
    }
}
