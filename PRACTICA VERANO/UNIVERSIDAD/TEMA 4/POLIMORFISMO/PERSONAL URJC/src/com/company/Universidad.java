package com.company;

public class Universidad extends PDI{
    public Universidad(String nombre, String apellido, Campus campus) {
        super(nombre, apellido, campus);
    }

    public String toString(){
        return super.toString()+" soy profesor de universidad";
    }
}
