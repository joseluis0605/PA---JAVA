package com.company;

public enum Suscripcion {

    SD("SD",10,1), HD("HD", 12, 2), UHD("4K", 16, 4);

    private String tipo;
    private int precio;
    private int dispositivos;

    Suscripcion(String tipo, int precio, int dispositivos){
        this.tipo= tipo;
        this.precio= precio;
        this.dispositivos= dispositivos;
    }

    public int getPrecio() {
        return precio;
    }

    public int getDispositivos() {
        return dispositivos;
    }

    public String getTipo() {
        return tipo;
    }
}
