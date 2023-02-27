package com.company;

public class Main {

    public static void main(String[] args) {

        Capitulo capitulo1= new Capitulo("capitulo1", 40);
        Capitulo capitulo2= new Capitulo("capitulo2", 50);
        Capitulo capitulo3= new Capitulo("capitulo3", 30);
        Capitulo capitulo4= new Capitulo("capitulo4", 10);
        Capitulo capitulo5= new Capitulo("capitulo5", 50);
        Capitulo capitulo6= new Capitulo("capitulo6", 70);

        Temporada temporada1= new Temporada(0, 2001);
        Temporada temporada2= new Temporada(1, 2022);

        temporada1.addCapitulo(capitulo1);
        //temporada1.addCapitulo(capitulo2);
        temporada1.addCapitulo(capitulo3);
        temporada2.addCapitulo(capitulo4);
        temporada2.addCapitulo(capitulo5);
        temporada2.addCapitulo(capitulo6);

        Serie serie1= new Serie("serie1", 5);

        serie1.addTemporada(temporada1);
        serie1.addTemporada(temporada2);

        serie1.mostrarSerie();
        serie1.temporadaMasLargas();
        serie1.mediaTemporada(0);

    }
}
