package com.company;

import java.security.spec.EdDSAParameterSpec;

public class Catalogo {

    private int limiteLibros;
    private int numeroLibros;
    private Libro listado[];

    public Catalogo(int limiteLibros){
        this.listado= new Libro[limiteLibros];
        this.numeroLibros= 0;
        this.limiteLibros= limiteLibros;
    }

    public void addLibro(Libro libro){
        if (numeroLibros < listado.length){
            listado[numeroLibros]= libro;
            numeroLibros++;
        }
    }

    public void mostrar(){
        System.out.println("***************************");
        for (int i=0;i<numeroLibros;i++){
            System.out.println(listado[i]);
        }
    }

    public int getNumeroLibros() {
        return numeroLibros;
    }

    public void mostrarPorAutor (Persona persona){
        for (int i=0;i<numeroLibros;i++){
            if (listado[i].tieneAutor(persona)){
                System.out.println(listado[i]);
            }
        }
    }

    public void ordenarCatalogo(){
        for (int j=0;j<listado.length;j++){
            for (int i=0;i<numeroLibros-1;i++){
                int valor= listado[i].comparador(listado[i+1]);
                if (valor==-1){
                    Libro aux= listado[i];
                    listado[i]= listado[i+1];
                    listado[i+1]=aux;
                }
            }
        }
        mostrar();
    }

    public void mostrarPorEditorial (String editorial){
        for (int i=0;i<numeroLibros;i++){
            if (listado[i].esMismoEditorial(editorial)){
                System.out.println(listado[i]);
            }
        }
    }

    public void mostrarAnyo (int year){
        for (int i=0;i<numeroLibros;i++){
            if (listado[i].esMismoAnyo(year)){
                System.out.println(listado[i]);
            }
        }
    }
}
