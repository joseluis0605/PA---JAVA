package com.company.coche;

import java.util.Objects;

public class Coche {

    private String matricula;
    private int potencia;
    private int impuesto;

    public Coche(String matricula, int potencia){
        this.matricula= matricula;
        this.potencia= potencia;
        cambioPrecioCoche();
    }

    private void cambioPrecioCoche() {
        if (potencia<140){
            setImpuesto(50);
        }else {
            setImpuesto(60);
        }
    }


    /// GETTER SETTER AND EQUALS

    public String getMatricula() {
        return matricula;
    }
    protected int getImpuesto() {
        return impuesto;
    }
    protected int getPotencia() {
        return potencia;
    }
    protected void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(matricula, coche.matricula);
    }
    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}

