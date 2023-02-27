package com.company;

import javax.print.Doc;

public class Plantilla {

    private PersonalURJC plantilla[];
    private int numero;

    public Plantilla(int max){
        this.numero=0;
        this.plantilla= new PersonalURJC[max];
    }

    public void addUniversidad(Universidad universidad){
        if (numero<plantilla.length){
            plantilla[numero]=universidad;
            numero++;
        }
    }

    public void addDoctor (Doctor doctor){
        if (numero< plantilla.length){
            plantilla[numero]=doctor;
            numero++;
        }
    }

    public void addPAS (PAS pas){
        if (numero< plantilla.length){
            plantilla[numero]=pas;
            numero++;
        }
    }

    public void mostrar(){
        for (int i=0;i<numero;i++){
            System.out.println(plantilla[i]);
            System.out.println("-------------------------------");
        }
    }
}
