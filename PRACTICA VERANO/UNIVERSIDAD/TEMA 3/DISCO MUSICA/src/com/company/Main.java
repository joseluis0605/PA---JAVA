package com.company;

public class Main {

    public static void main(String[] args) {

        Almacen almacen= new Almacen();

        Cancion cancion1= new Cancion("cancion1", 3,14);
        Cancion cancion2= new Cancion("cancion2", 2,52);
        Cancion cancion3= new Cancion("cancion3", 3,36);
        Cancion cancion4= new Cancion("cancion4", 3,14);
        Cancion cancion5= new Cancion("cancion5", 4,2);
        Cancion cancion6= new Cancion("cancion6", 2,42);
        Cancion cancion7= new Cancion("cancion7", 3,20);
        Cancion cancion8= new Cancion("cancion8", 4,50);

        Artista artista1= new Artista("Pedro");
        Artista artista2= new Artista("Luis");
        Artista artista3= new Artista("Juan");
        Artista artista4= new Artista("Carlos");
        Artista artista5= new Artista("Martin");
        Artista artista6= new Artista("Jose");

        Disco disco= new Disco("Disco1", 2020);

        disco.addCancion(cancion1);
        disco.addCancion(cancion2);
        disco.addCancion(cancion3);
        disco.addCancion(cancion4);
        disco.addCancion(cancion5);


        disco.addGrupo(artista1);
        disco.addGrupo(artista2);
        disco.addGrupo(artista3);
        disco.addGrupo(artista4);


        Disco disco1= new Disco("Disco 2", 2022);

        disco1.addCancion(cancion6);
        disco1.addCancion(cancion7);
        disco1.addCancion(cancion8);

        disco1.addGrupo(artista5);
        disco1.addGrupo(artista6);

        almacen.addDisco(disco);
        almacen.addDisco(disco1);


        almacen.mostrarCantante(new Artista("luis"));

        almacen.mostrarInfo();

        almacen.consultaPorAnyo(2020);

        almacen.ordenarAlfabetico();

        almacen.discoMasLargo();
    }
}
