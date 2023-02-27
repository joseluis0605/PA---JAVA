package com.company;

public class Persona {

    private String nombre;

    public Persona(String nombre){
        this.nombre= nombre;
    }

    public String toString(){
        return nombre;
    }

    public boolean mismaPersona(Persona persona) {
        return this.nombre.equals(persona.nombre);
    }
}
