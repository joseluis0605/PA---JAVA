package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Gestor {

    private Map<String, ArrayList<Pelicula>> mapaTitulo;
    private Map<Integer, ArrayList<Pelicula>> mapaYear;
    private Map<String, ArrayList<Pelicula>> mapaTipo;

    public Gestor(){
        mapaTitulo= new HashMap<>();
        mapaYear= new HashMap<>();
        mapaTipo= new HashMap<>();
    }

    public void add(String titulo, int year, ArrayList<String> tipo){
        Pelicula pelicula= new Pelicula(titulo, year, tipo);

        //AÑADIMOS AL MAPA CON CLAVE EL TITULO DE LA PELICULA
        ArrayList<Pelicula> aux= mapaTitulo.get(titulo);
        if (aux==null){
            aux= new ArrayList<>();
            aux.add(pelicula);
        }else {
            aux.add(pelicula);
        }
        mapaTitulo.put(titulo, aux);

        //AÑADIMOS AL MAPA CON CLAVE AÑO
        ArrayList<Pelicula> aux1= mapaYear.get(year);
        if (aux1==null){
            aux1= new ArrayList<>();
            aux1.add(pelicula);
        }else {
            aux1.add(pelicula);
        }
        mapaYear.put(year, aux1);

        //AÑADIMOS AL MAPA CON CLAVE GENERO
        for (String genero : tipo){
            ArrayList<Pelicula> aux3= mapaTipo.get(genero);
            if (aux3== null){
                aux3= new ArrayList<>();
                aux3.add(pelicula);
            }else {
                aux3.add(pelicula);
            }
            mapaTipo.put(genero, aux3);
        }
    }

    public void mostrarTodo(){
        for (Map.Entry<String, ArrayList<Pelicula>> entrada: mapaTitulo.entrySet()){
            System.out.println("Pelicula con titulo: "+entrada.getKey());
            System.out.println(entrada.getValue());
        }
    }

    public void mostrarTitulo(String titulo){
        System.out.println(mapaTitulo.get(titulo));
    }

    public void mostrarYear(int year){
        System.out.println(mapaYear.get(year));
    }

    public void mostrarTipo(String tipo){
        System.out.println(mapaTipo.get(tipo));
    }
}
