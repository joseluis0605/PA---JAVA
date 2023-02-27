package com.company;

public class Bussiness extends Billete{
    public Bussiness(String tipo, Fecha fecha, String origen,  int id) {
        super(tipo, fecha, origen, id);
        cambioPrecio();
        setClase("bussiness");
    }

    @Override
    protected void cambioPrecio() {
        int precio= 95;
        if (getFecha().esVerano()){
            precio= precio*104/100;
        }else  if (getFecha().esInvierno()){
            precio= precio*96/100;
        }

        if (esElectronico()){
            precio= precio*102/100;
        }

        setPrecio(precio);
    }

    @Override
    public String tipo() {
        return "bussiness";
    }
}
