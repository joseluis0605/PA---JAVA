package com.company;

public class Main {

    public static void main(String[] args) {

        Persona persona= new Persona("pedro", "lopez", Campus.valueOf("ARANJUEZ"));
        Administrador administrador= new Administrador("Luis", "Concha", Campus.valueOf("MADRID"));
        Doctor doctor= new Doctor("Jose Luis", "Mezquita", Campus.valueOf("MOSTOLES"));

        System.out.println(persona);
        System.out.println(administrador);
        System.out.println(doctor);

    }
}
