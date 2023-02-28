package com.company.instrumento.percusion.bateria;

import com.company.instrumento.percusion.Bateria;

public class Electrica extends Bateria {
    public Electrica(String tipo, String nombreInstrumento, String marca, int precioFabrica) {
        super(tipo, nombreInstrumento, marca, precioFabrica);
        precioFinal();
    }

    @Override
    public void precioFinal() {
        int valor= getPrecioFabrica();
        valor= valor*101/100;
        setPrecioVenta(valor);
    }
    public String toString(){
        return super.toString() +"\n"+"SOY UNA BATERIA ELECTRICA";
    }

}
