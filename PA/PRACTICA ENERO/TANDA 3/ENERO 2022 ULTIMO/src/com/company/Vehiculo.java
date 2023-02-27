package com.company;

import java.util.Objects;

public class Vehiculo {

    private String matricula;
    private int potencia;
    private int impuesto;

    public Vehiculo(String matricula, int potencia){
        this.matricula= matricula;
        this.potencia= potencia;
        this.impuesto=0;
        cambiarPrecioVehiculo();
    }

    private void cambiarPrecioVehiculo() {
        if (potencia>140){
            setImpuesto(60);
        }else {
            setImpuesto(50);
        }
    }

    public String toString(){
        return "matricula--> "+matricula+" potencia---> "+potencia+" impuesto---> "+impuesto;
    }


    //GETTER SETTER EQUALS

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    protected int getImpuesto() {
        return impuesto;
    }

    protected void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public String getMatricula() {
            return matricula;
    }
}
