package com.company;

public class Turista extends Billete{
    public Turista(String tipo, Fecha fecha, String origen, int id) {
        super(tipo, fecha, origen, id);
        cambioPrecio();
        setClase("turista");
    }

    @Override
    protected void cambioPrecio() {
        int precio= 70;
        if (getFecha().esVerano()){
            precio= precio*102/100;
        }else  if (getFecha().esInvierno()){
            precio= precio*98/100;
        }

        if (esElectronico()){
            precio= precio*102/100;
        }

        setPrecio(precio);
    }

    @Override
    public String tipo() {
        return "turista";
    }


}
