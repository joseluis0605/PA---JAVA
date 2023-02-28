package com.company.instrumento.cuerda;

import com.company.instrumento.Cuerda;

public class Guitarra extends Cuerda {
    public Guitarra(String tipo, String nombreInstrumento, String marca, int precioFabrica, int antiguedad) {
        super(tipo, nombreInstrumento, marca, precioFabrica,antiguedad);
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        int valor= getPrecioVenta();
        valor= valor*105/100;
        setPrecioVenta(valor);
    }

    public String toString(){
        return super.toString() +"\n"+"SOY UNA GUITARRA";
    }
}
