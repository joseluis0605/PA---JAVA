package com.company;

import java.text.CollationElementIterator;
import java.util.*;

public class Gestor {

    private Map<String, ArrayList<Libro>> mapaTitulo;
    private Map<Integer, ArrayList<Libro>> mapaPrecio;
    private Set<Libro> listadoTotal;

    public Gestor(){
        this.mapaTitulo= new HashMap<>();
        this.mapaPrecio= new HashMap<>();
        this.listadoTotal= new HashSet<>();
    }

    public void addLibro(Libro libro){

        //añadimos al hashSet
        this.listadoTotal.add(libro);

        //añadimos con clave el titulo
        ArrayList<Libro> lista1 = mapaTitulo.get(libro.getTitulo());
        if (lista1==null){
            lista1= new ArrayList<>();
            lista1.add(libro);
            mapaTitulo.put(libro.getTitulo(), lista1);
        }else {
            lista1.add(libro);
            mapaTitulo.put(libro.getTitulo(), lista1);
        }

        //añadimos con clave año
        ArrayList<Libro> lista2= mapaPrecio.get(libro.getPrecio());
        if (lista2==null){
            lista2= new ArrayList<>();
            lista2.add(libro);
            mapaPrecio.put(libro.getPrecio(), lista2);
        }else {
            lista2.add(libro);
            mapaPrecio.put(libro.getPrecio(), lista2);
        }

    }

    public void mostrarTituloOrdenado(){
        Set<String> libros= mapaTitulo.keySet();
        ArrayList<String> listado= new ArrayList<>();
        for (String libro : libros){
            listado.add(libro);
        }
        Collections.sort(listado, new ComparadorTitulo());
        System.out.println(listado);
    }

    public void mostrarPrecioOrdenado(){
        ArrayList<Libro> listado= new ArrayList<>();

        for (Map.Entry<String, ArrayList<Libro>> valor : mapaTitulo.entrySet()){
            listado.addAll(valor.getValue());
        }

        Collections.sort(listado, new ComparadorPrecio());
        System.out.println(listado);
    }

    public void mostrarTodo(){
        System.out.println(listadoTotal);
    }

    public void busquedaTitulo(String titulo)throws  NoExisteLibroException{
        ArrayList<Libro> listado= mapaTitulo.get(titulo);
        if (listado==null){
            throw new NoExisteLibroException();
        }else {
            System.out.println(listado);
        }
    }
}
