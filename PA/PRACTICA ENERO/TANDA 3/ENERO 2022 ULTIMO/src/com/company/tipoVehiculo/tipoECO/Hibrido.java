package com.company.tipoVehiculo.tipoECO;

import com.company.tipoVehiculo.Eco;

public class Hibrido extends Eco {

    public Hibrido(String matricula, int potencia, int km){
        super(matricula, potencia, km);
        cambioHibrido();
    }

    private void cambioHibrido() {
        int precio= getImpuesto();
        precio= precio*70/100;
        setImpuesto(precio);
    }


}
