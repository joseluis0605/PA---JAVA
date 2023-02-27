package com.company.tipoVehiculo.tipoECO;

import com.company.Vehiculo;

public class ECO extends Vehiculo {

    private int autonomia;

    public ECO(String matricula, int potencia, int autonomia){
        super(matricula, potencia);
        this.autonomia= autonomia;
    }
}
