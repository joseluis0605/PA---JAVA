package com.company;

public class Administrador extends  Persona{

    public Administrador(String nombre, String apellido, Campus campus){
        super(nombre, apellido, campus);
    }

    public String toString(){
        return super.toString()+" soy un administrador";
    }
}
