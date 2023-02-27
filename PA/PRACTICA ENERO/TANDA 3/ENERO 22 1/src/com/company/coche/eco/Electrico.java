package com.company.coche.eco;

public class Electrico extends ECO {

    public Electrico(String matricula, int potencia, int autonomia){
        super(matricula, potencia, autonomia);
        cambioElectrico();
    }

    private void cambioElectrico() {
        int precio= getImpuesto();
        precio= precio/2;
        setImpuesto(precio);
    }
}
