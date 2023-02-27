package com.company;

public class PAS extends  PersonalURJC{
    public PAS(String nombre, String apellido, Campus campus) {
        super(nombre, apellido, campus);
    }

    public String toString(){
        return super.toString()+" soy PAS";
    }
}
