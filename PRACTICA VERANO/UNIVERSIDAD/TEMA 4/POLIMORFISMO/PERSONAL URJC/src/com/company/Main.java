package com.company;

import javax.print.Doc;

public class Main {

    public static void main(String[] args) {

        Plantilla plantilla= new Plantilla(10);

        Doctor persona1= new Doctor("doctor1", "apellido1", Campus.ALCORCON);
        Doctor persona2= new Doctor("doctor2", "apellido2", Campus.MADRID_VICALVARO);
        Doctor persona3= new Doctor("doctor3", "apellido3", Campus.MOSTOLOES);
        Doctor persona4= new Doctor("doctor4", "apellido4", Campus.ARANJUEZ);

        Universidad persona5= new Universidad("universidad5", "apellido5", Campus.MADRID_VICALVARO);

        PAS persona6= new PAS("PAS6", "apellido6", Campus.MADRID_VICALVARO);

        plantilla.addDoctor(persona1);
        plantilla.addDoctor(persona2);
        plantilla.addDoctor(persona3);
        plantilla.addDoctor(persona4);

        plantilla.addUniversidad(persona5);

        plantilla.addPAS(persona6);

        plantilla.mostrar();
    }
}
