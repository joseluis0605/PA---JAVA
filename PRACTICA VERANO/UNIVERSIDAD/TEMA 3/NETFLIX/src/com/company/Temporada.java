package com.company;

public class Temporada {
    private int numeroTemporada;
    private int year;
    private Capitulo listado[];
    private int numeroCapitulos;

    public Temporada (int numeroTemporada, int year){
        this.listado= new Capitulo[10];
        this.year= year;
        this.numeroTemporada= numeroTemporada;
        this.numeroCapitulos= 0;
    }

    public void mostrarTemporada(){
        System.out.println("---------------------");
        System.out.println("Temporada "+numeroTemporada+" del año "+year);
        for (int i=0;i<numeroCapitulos;i++){
            System.out.println(listado[i]);
        }
    }

    public void addCapitulo (Capitulo capitulo){
        if (numeroCapitulos < 10){
            listado[numeroCapitulos]= capitulo;
            numeroCapitulos++;
        }
    }

    public double duracionMedia(){
        double duracion=0;
        for (int i=0;i<numeroCapitulos;i++){
            duracion= duracion + listado[i].getDuracion();
        }
        duracion= duracion/numeroCapitulos;
        return duracion;
    }

    public boolean esTemporadaMasLarga(Temporada temporada){
        return numeroCapitulos > temporada.numeroCapitulos;
    }
}
