package com.company;

public class Doctor extends PDI{
    public Doctor(String nombre, String apellido, Campus campus) {
        super(nombre, apellido, campus);
    }

    public String toString(){
        return  super.toString()+" soy Doctor";
    }
}
