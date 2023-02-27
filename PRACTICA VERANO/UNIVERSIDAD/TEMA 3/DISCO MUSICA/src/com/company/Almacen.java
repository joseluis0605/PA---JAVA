package com.company;

public class Almacen {

    private Disco almacen[];
    private int numeroDiscos;

    public Almacen(){
        almacen= new Disco[10];
        this.numeroDiscos= 0;
    }

    public void addDisco(Disco disco){
        if (numeroDiscos<almacen.length){
            almacen[numeroDiscos]= disco;
            numeroDiscos++;
        }
    }

    public void mostrarInfo(){
        for (int i=0;i<numeroDiscos;i++){
            System.out.println(almacen[i]);
        }
    }

    public void mostrarCantante (Artista artista){
        for (int i=0;i<numeroDiscos;i++){
            if (almacen[i].esDeEseCantante(artista)){
                System.out.println(almacen[i]);
            }
        }
    }

    public void consultaPorAnyo (int anyo){
        for (int i=0;i<numeroDiscos;i++){
            if (almacen[i].esDeEseAnyo(anyo)){
                System.out.println(almacen[i]);
            }
        }
    }

    public void ordenarAlfabetico(){
        for (int i=0;i<numeroDiscos-1;i++){
            int resultado= almacen[i].compareTo(almacen[i+1]);
            if (resultado>0){
                Disco disco= almacen[i];
                almacen[i]= almacen[i+1];
                almacen[i+1]= disco;
            }
        }
        mostrarInfo();
    }

    public void discoMasLargo(){
        int indiceMasLargo= 0;
        int tiempo=0;

        for (int i=0;i<numeroDiscos;i++){
            if (tiempo<almacen[i].duracion()){
                tiempo= almacen[i].duracion();
                indiceMasLargo= i;
            }
        }
        System.out.println(almacen[indiceMasLargo]);
    }
}
