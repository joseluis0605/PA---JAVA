package com.company.instrumento.percusion.bateria;

import com.company.instrumento.percusion.Bateria;


public class Acustica extends Bateria {

    private int numeroTambores;
    private int numeroPlatillos;

    public Acustica(String tipo, String nombreInstrumento, String marca, int precioFabrica, int numeroTambores, int numeroPlatillos) {
        super(tipo, nombreInstrumento, marca, precioFabrica);
        this.numeroPlatillos= numeroPlatillos;
        this.numeroTambores= numeroTambores;
        precioFinal();
    }

    @Override
    public void precioFinal() {
        int valor= getPrecioFabrica();
        valor= valor*115/100;
        if (numeroTambores>=6){
            valor= valor*106/100;
        }
        if (numeroPlatillos>=5){
            valor= valor*105/100;
        }
        setPrecioVenta(valor);
    }

    public String toString(){
        return super.toString() +"\n"+"SOY UNA BATERIA ACUSTICA";
    }
}
