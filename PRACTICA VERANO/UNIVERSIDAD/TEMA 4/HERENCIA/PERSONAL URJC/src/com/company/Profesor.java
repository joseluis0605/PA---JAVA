package com.company;

public class Profesor extends Docente{

    public Profesor (String nombre, String apellido, Campus campus){
        super(nombre, apellido, campus);
    }

    public String toString(){
        return super.toString()+" y profesor titular";
    }
}
