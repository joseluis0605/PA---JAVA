package com.company;

import java.util.Objects;

public class Vehiculo {

    private String matricula;
    private int potencia;
    private int impuesto;

    public Vehiculo(String matricula, int potencia){
        this.matricula= matricula;
        this.potencia= potencia;
        this.impuesto= 0;
        cambioPrecio();
    }

    private void cambioPrecio() {
        if (potencia<140){
            impuesto= impuesto+50;
        }else {
            impuesto= impuesto+60;
        }
    }

    //GETTER SETTER AND EQUALS


    public String getMatricula() {
        return matricula;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public int getImpuesto() {
        return impuesto;
    }

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
}
