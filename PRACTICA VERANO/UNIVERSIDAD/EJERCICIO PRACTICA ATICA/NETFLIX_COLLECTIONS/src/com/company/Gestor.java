package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Gestor {

    private Map<String, ArrayList<Pelicula>> mapaTitulo;
    private Map<Integer, ArrayList<Pelicula>> mapaYear;
    private Map<String, ArrayList<Pelicula>> mapaTipoGenero;


    public Gestor(){
        mapaTitulo= new HashMap<>();
        mapaYear= new HashMap<>();
        mapaTipoGenero= new HashMap<>();
    }

    public void add(String titulo,int year, ArrayList<String> lista){
        ArrayList<Pelicula> tipo;
        tipo= mapaTitulo.get(titulo);
        Pelicula pelicula= new Pelicula(titulo, year, lista);
        if (tipo==null){
            tipo= new ArrayList<>();
            tipo.add(pelicula);
        }else {
            tipo.add(pelicula);
        }
        mapaTitulo.put(titulo, tipo);

        ArrayList<Pelicula> listaYear= new ArrayList<>();
        listaYear= mapaYear.get(year);
        if (listaYear==null){
            listaYear= new ArrayList<>();
            listaYear.add(pelicula);
        }else {
            listaYear.add(pelicula);
        }
        mapaYear.put(year,listaYear);

        for (String genero: lista){
            ArrayList<Pelicula> listaTipos=new ArrayList<>();
            listaTipos= mapaTipoGenero.get(genero);
            if (listaTipos==null){
                listaTipos= new ArrayList<>();
                listaTipos.add(pelicula);
            }else {
                listaTipos.add(pelicula);
            }
            mapaTipoGenero.put(genero, listaTipos);
        }
    }

    public void mostrar(){
        for (Map.Entry<String, ArrayList<Pelicula>> e: mapaTitulo.entrySet()){
            System.out.println("peliculas con titulo: "+e.getKey());
            System.out.println(e.getValue());
        }
    }

    public void mostrarTitulo(String titulo){
        System.out.println(mapaTitulo.get(titulo));
    }

    public void mostrarYear(int year){
        System.out.println(mapaYear.get(year));
    }

    public void mostrarGenero(String genero){
        System.out.println(mapaTipoGenero.get(genero));
    }
}
