package com.company;

public class PersonalURJC {

    private String nombre;
    private String apellido;
    private Campus campus;

    public PersonalURJC(String nombre, String apellido, Campus campus){
        this.nombre= nombre;
        this.apellido= apellido;
        this.campus= campus;
    }

    public String toString(){
        return "Nombre: "+nombre+" Apellido: "+apellido+ "Campus: "+ campus;
    }

}
