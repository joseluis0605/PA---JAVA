package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tipo1= new ArrayList<>();
        tipo1.add("drama");
        tipo1.add("humor");
        tipo1.add("terror");
        tipo1.add("+18");

        ArrayList<String> tipo2= new ArrayList<>();
        tipo2.add("drama");
        tipo2.add("suspense");
        tipo2.add("angulita");

        Gestor gestor= new Gestor();

        gestor.add("titulo1", 2020, tipo1);
        gestor.add("titulo2", 2008, tipo1);
        gestor.add("titulo3", 2022, tipo2);
        gestor.add("titulo1", 2012, tipo2);
        gestor.add("titulo1", 2008, tipo1);

        gestor.mostrarGenero("+18");
    }
}
