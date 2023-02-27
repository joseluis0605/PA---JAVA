package com.company;

public class Serie {

    private String nombre;
    private Temporada listado[];
    private int numeroTemporada;
    private int maximoTemporadas;

    public Serie (String nombre, int maximoTemporadas){
        this.nombre= nombre;
        this.numeroTemporada= 0;
        this.maximoTemporadas= maximoTemporadas;
        this.listado= new Temporada[maximoTemporadas];
    }

    public void mostrarSerie(){
        System.out.println("Nombre de la serie: "+nombre);
        for (int i=0;i<numeroTemporada;i++){
            System.out.println("Temporada "+i);
            listado[i].mostrarTemporada();
        }
    }

    public void addTemporada(Temporada temporada){
        if (numeroTemporada < maximoTemporadas){
            listado[numeroTemporada]= temporada;
            numeroTemporada++;
        }
    }

    public void temporadaMasLargas (){
        int temporadaMasGrande= 0;
        for (int i=0;i<numeroTemporada;i++){
            if (listado[i]. esTemporadaMasLarga(listado[temporadaMasGrande])){
                temporadaMasGrande= i;
            }
        }
        System.out.println("temporada mas larga: "+ temporadaMasGrande);
    }

    public void mediaTemporada (int temporada){
        System.out.println("la media de la temporada es: "+listado[temporada].duracionMedia());
    }
}
