package com.company.instrumento.percusion;

import com.company.instrumento.Percusion;

public class Timbales extends Percusion {

    private String material;

    public Timbales(String tipo, String nombreInstrumento, String marca, int precioFabrica, String material) {
        super(tipo, nombreInstrumento, marca, precioFabrica);
        this.material= material;
        precioFinal();
    }

    @Override
    public void precioFinal() {
        int valor= getPrecioFabrica();
        if (material.equals("cobre")){
            valor= valor*107/100;
        }else if (material.equals("laton")){
            valor= valor*105/100;
        }else {
            valor= valor*103/100;
        }
        setPrecioVenta(valor);
    }

    public String toString(){
        return super.toString() +"\n"+"SOY UN TIMBAL";
    }
}
