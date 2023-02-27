package com.company;

public class Disco {

    //Para cada disco guardará información del título del disco, del cantante o
    //grupo, del año de publicación y de las canciones que contiene el disco. De cada
    //canción se guardará el título de esta y su duración

    private String titulo;
    private Artista grupo[];
    private int year;
    private Cancion album[];
    private int numeroArtistas;
    private int numeroCanciones;

    public Disco(String titulo, int year){
        this.titulo= titulo;
        this.year= year;
        this.grupo= new Artista[10];
        this.album= new Cancion[10];
        this.numeroCanciones=0;
        this.numeroArtistas=0;
    }

    public String toString(){
        String cadena=" Artistas: ";
        for (int i=0;i<numeroArtistas;i++){
            cadena= cadena+ grupo[i]+" ";
        }

        String cadena2= " Canciones del disco: ";
        for (int i=0;i<numeroCanciones;i++){
            cadena2= cadena2+album[i]+" ";
        }
        return "Titulo: "+titulo+cadena+cadena2;
    }

    public void addGrupo(Artista artista){
        if (numeroArtistas<grupo.length){
            grupo[numeroArtistas]=artista;
            numeroArtistas++;
        }
    }

    public void addCancion (Cancion cancion){
        if (numeroCanciones<album.length){
            album[numeroCanciones]= cancion;
            numeroCanciones++;
        }
    }

    public boolean esDeEseCantante(Artista artista) {
        for (int i=0;i<numeroArtistas;i++){
            if (grupo[i].coincideArtista(artista)){
                return true;
            }
        }
        return false;
    }

    public boolean esDeEseAnyo(int anyo) {
        return this.year==anyo;
    }

    public int compareTo(Disco disco) {
        return this.titulo.compareTo(disco.titulo);
    }

    public int duracion() {
        int min=0;
        int seg= 0;

        for (int i=0;i<numeroCanciones;i++){
            min= min+album[i].getMinutos();
            seg= seg+album[i].getSegundos();
        }
        min= min*60;
        return min+seg;
    }
}
