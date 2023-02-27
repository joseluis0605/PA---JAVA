package com.company;

public class Cliente {
    private String dni;
    private String nombre_apellidos;
    private String direccion;

    public Cliente(String dni, String nombre_apellidos, String direccion) {
        this.dni = dni;
        this.nombre_apellidos = nombre_apellidos;
        this.direccion = direccion;
    }



    public String toString() {
        return this.nombre_apellidos + ", con dni " + this.dni;
    }

    public boolean coincideDNI(String dni) {
        return this.dni.equals(dni);
    }
}
