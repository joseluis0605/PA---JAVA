package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Gestor gestor= new Gestor();

        ArrayList<String> genero= new ArrayList<>();
        genero.add("drama");
        genero.add("+18");
        genero.add("tragedia");
       // genero.add("risa");

        ArrayList<String> genero1= new ArrayList<>();
        genero1.add("+18");
        genero1.add("risa");

        gestor.add("rocky", 2001, genero);
        gestor.add("rocky", 2020, genero);
        gestor.add("rocky", 1981, genero);
        gestor.add("ted", 2020, genero1);

        //gestor.mostrarTitulo("rocky");

        //gestor.mostrarYear(2020);

        //gestor.mostrarTipo("risa");
    }
}
