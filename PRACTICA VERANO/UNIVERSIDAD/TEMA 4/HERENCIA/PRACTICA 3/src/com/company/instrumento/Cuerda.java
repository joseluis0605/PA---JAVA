package com.company.instrumento;

import com.company.Instrumento;

public abstract class Cuerda extends Instrumento {

    private int antiguedad;


    public Cuerda(String tipo, String nombreInstrumento, String marca, int precioFabrica, int antiguedad) {
        super(tipo, nombreInstrumento, marca, precioFabrica);
        this.antiguedad= antiguedad;
    }

    @Override
    public void precioFinal() {
        int valor= getPrecioFabrica();
        if (getAntiguedad() > 10 && getAntiguedad()<20){
            valor= valor*110/100;
        }else  if (getAntiguedad()>20){
            valor= valor*120/100;
        }else {
            valor= valor*105/100;
        }
        setPrecioVenta(valor);
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


}
