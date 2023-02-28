package com.company.instrumento.cuerda;

import com.company.instrumento.Cuerda;

public class Piano extends Cuerda {
    public Piano(String tipo, String nombreInstrumento, String marca, int precioFabrica, int antiguedad) {
        super(tipo, nombreInstrumento, marca, precioFabrica, antiguedad);
        precioFinal();
    }

    public String toString(){
        return super.toString() +"\n"+"SOY UN PIANO";
    }

}
