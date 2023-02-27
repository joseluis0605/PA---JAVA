package com.company.coche.combustion;

import com.company.coche.Coche;

public class Combustion extends Coche {

    private String tipo;

    public Combustion(String matricula, int potencia, String tipo){
        super(matricula, potencia);
        this.tipo= tipo;
        cambioCombustion();
    }

    private void cambioCombustion() {
        int precio= getImpuesto();
        if (this.tipo.equalsIgnoreCase("diesel")){
            precio= precio+10;
        }
        setImpuesto(precio);
    }
}
