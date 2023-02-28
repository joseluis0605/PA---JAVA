package com.company;

public class Persona {

    private String nombre;
    private String apellido;
    private Campus campus;

    public Persona(String nombre, String apellido, Campus campus){
        this.nombre= nombre;
        this.apellido= apellido;
        this.campus= campus;
    }

    public String toString(){
        return "Soy "+nombre+" "+apellido+" "+campus;
    }
}
