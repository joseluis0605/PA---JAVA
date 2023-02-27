package com.company.tipoVehiculo;

import com.company.Vehiculo;

public class Eco extends Vehiculo {

    private int km;

    public Eco(String matricula, int potencia, int km){
        super(matricula, potencia);
        this.km= km;
    }

}
