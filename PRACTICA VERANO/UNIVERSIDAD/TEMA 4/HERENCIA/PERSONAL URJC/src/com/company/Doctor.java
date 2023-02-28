package com.company;

public class Doctor extends Docente{

    public Doctor(String nombre, String apellido, Campus campus){
        super(nombre, apellido, campus);
    }

    public String toString(){
        return super.toString()+" y soy un doctor en la universidad";
    }
}
