package com.company.tipoVehiculo.tipoECO;

public class Hibrido extends ECO {

    public Hibrido(String matricula, int potencia, int autonomia){
        super(matricula, potencia, autonomia);
        cambioPrecioHibrido();
    }

    private void cambioPrecioHibrido() {
        int precio= getImpuesto();
        precio= precio*70/100;
        setImpuesto(precio);
    }
}
