package com.company.tipoVehiculo;

import com.company.Vehiculo;

public class Combustion extends Vehiculo {

    private TipoCombustion tipoCombustion;

    public Combustion(String matricula, int potencia, TipoCombustion tipoCombustion){
        super(matricula, potencia);
        this.tipoCombustion= tipoCombustion;
        cambioPrecioCombustion();
    }

    private void cambioPrecioCombustion() {
        if (tipoCombustion.equals(TipoCombustion.DIESEL)){
            int precio= getImpuesto();
            precio= precio+10;
            setImpuesto(precio);
        }
    }
}
