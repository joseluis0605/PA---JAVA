package com.company.instrumento.viento;

import com.company.instrumento.Viento;

public class Oboe extends Viento {
    public Oboe(String tipo, String nombreInstrumento, String marca, int precioFabrica) {
        super(tipo, nombreInstrumento, marca, precioFabrica);
        precioFinal();
    }

    @Override
    public void precioFinal() {
        if (perteneceMarca(getMarca())){
            int valor= getPrecioFabrica();
            valor= valor*110/100;
            setPrecioVenta(valor);
        }else {
            int valor= getPrecioFabrica();
            valor= valor*102/100;
            setPrecioVenta(valor);
        }
    }

    private boolean perteneceMarca(String marca) {
        return marca.equals("AMATI") || marca.equals("HOLTON") || marca.equals("BESSON");
    }

    public String toString(){
        return super.toString() +"\n"+"SOY UN OBOE";
    }



}
