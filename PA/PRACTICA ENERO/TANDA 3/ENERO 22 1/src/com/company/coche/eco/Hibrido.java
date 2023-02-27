package com.company.coche.eco;

public class Hibrido extends ECO {

    public Hibrido(String matricula, int potencia, int autonomia){
        super(matricula, potencia, autonomia);
        cambioHibrido();
    }

    private void cambioHibrido() {
        int precio= getImpuesto();
        precio= precio*70/100;
        setImpuesto(precio);

    }
}
