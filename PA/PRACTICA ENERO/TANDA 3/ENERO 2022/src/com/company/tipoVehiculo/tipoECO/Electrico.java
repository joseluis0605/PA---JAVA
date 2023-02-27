package com.company.tipoVehiculo.tipoECO;

public class Electrico extends ECO {

    public Electrico(String matricula, int potencia, int autonomia){
        super(matricula, potencia, autonomia);
        cambioPrecioElectrico();
    }

    private void cambioPrecioElectrico() {
        int precio= getImpuesto();
        precio= precio*50/100;
        setImpuesto(precio);
    }

}
