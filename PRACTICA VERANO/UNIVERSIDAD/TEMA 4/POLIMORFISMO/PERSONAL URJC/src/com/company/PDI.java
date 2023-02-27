package com.company;

public class PDI extends  PersonalURJC{
    public PDI(String nombre, String apellido, Campus campus) {
        super(nombre, apellido, campus);
    }

    public String toString(){
        return super.toString()+ " soy PDI";
    }
}
