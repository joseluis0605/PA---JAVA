package com.company;

import com.company.contenido.serie.Capitulo;
import com.company.contenido.pelicula.Genero;
import com.company.contenido.pelicula.Pelicula;
import com.company.contenido.serie.Serie;
import com.company.excepciones.NoSuchSeasonException;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pelicula pelicula= new Pelicula("iron man", 100, Genero.accion);
        Pelicula pelicula1= new Pelicula("capitan america", 100, Genero.comedia);
        Pelicula pelicula2= new Pelicula("spiderman", 70, Genero.drama);
        Pelicula pelicula3= new Pelicula("thor", 240, Genero.accion);
        Pelicula pelicula4= new Pelicula("ant man", 200, Genero.romantica);
        Pelicula pelicula5= new Pelicula("black panther", 150, Genero.accion);

        Capitulo capitulo1= new Capitulo(1, 10);
        Capitulo capitulo2= new Capitulo(2, 10);
        Capitulo capitulo3= new Capitulo(3, 10);
        Capitulo capitulo4= new Capitulo(4, 10);
        Capitulo capitulo5= new Capitulo(5, 10);
        Capitulo capitulo6= new Capitulo(6, 10);
        Capitulo capitulo7= new Capitulo(7, 10);

        Serie serie1 = new Serie("new amsterdam");
        serie1.addTemporada();
        serie1.addTemporada();
        try {
            serie1.addCapituloTemporada(0, capitulo1);
            serie1.addCapituloTemporada(0, capitulo2);
            serie1.addCapituloTemporada(0, capitulo3);
            serie1.addCapituloTemporada(0, capitulo4);
            serie1.addCapituloTemporada(1, capitulo5);
            serie1.addCapituloTemporada(1, capitulo6);
            serie1.addCapituloTemporada(1, capitulo7);
        } catch (NoSuchSeasonException e) {
            System.out.println("temporada no existe");
            exit(1);
        }

        Gestor gestor= new Gestor();

        gestor.addConetenido(pelicula);
        gestor.addConetenido(pelicula1);
        gestor.addConetenido(pelicula2);
        gestor.addConetenido(pelicula3);
        gestor.addConetenido(pelicula4);
        gestor.addConetenido(pelicula5);
        gestor.addConetenido(serie1);

        gestor.mostrarOrdenadoContenido();

    }
}
