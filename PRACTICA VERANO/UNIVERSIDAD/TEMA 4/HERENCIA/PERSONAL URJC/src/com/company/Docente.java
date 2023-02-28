package com.company;

public class Docente extends  Persona{

    public Docente(String nombre, String apellido, Campus campus){
        super(nombre, apellido, campus);
    }

    public String toString(){
        return super.toString()+ " soy un docente ";
    }
}
