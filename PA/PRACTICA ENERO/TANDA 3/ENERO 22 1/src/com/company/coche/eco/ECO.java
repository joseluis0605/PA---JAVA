package com.company.coche.eco;

import com.company.coche.Coche;

public class ECO extends Coche {

    private int autonomia;

    public ECO(String matricula, int potencia, int autonomia){
        super(matricula, potencia);
        this.autonomia= autonomia;
    }

}
