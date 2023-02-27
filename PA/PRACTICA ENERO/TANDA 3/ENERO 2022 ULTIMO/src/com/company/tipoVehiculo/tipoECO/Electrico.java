package com.company.tipoVehiculo.tipoECO;

import com.company.tipoVehiculo.Eco;

public class Electrico extends Eco {

    public Electrico(String matricula, int potencia, int km){
        super(matricula, potencia, km);
        cambioPrecioElectrico();
    }

    private void cambioPrecioElectrico() {
        int precio= getImpuesto();
        precio= precio*50/100;
        setImpuesto(precio);
    }
}
