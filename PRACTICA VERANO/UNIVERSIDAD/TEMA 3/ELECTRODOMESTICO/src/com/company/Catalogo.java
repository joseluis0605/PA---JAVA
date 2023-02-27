package com.company;

import java.sql.ClientInfoStatus;

public class Catalogo {

    private Electrodomestico catalogo[];
    private int numeroMaximo;
    private int numeroProductos;

    public Catalogo(){
        this(10);
    }

    public Catalogo(int numeroMaximo){
        catalogo= new Electrodomestico[numeroMaximo];
        this.numeroMaximo=numeroMaximo;
        this.numeroProductos=0;
    }

    public void addElectrodomestico( Electrodomestico electrodomestico){
        if (numeroProductos < numeroMaximo){
            catalogo[numeroProductos]= electrodomestico;
            numeroProductos++;
        }else {
            System.out.println("CATALOGO LLENO...");
        }
    }

    public void mostrar(){
        for (int i=0;i<numeroProductos;i++){
            System.out.println(catalogo[i]);
        }
        System.out.println("HAY UN TOTAL DE "+numeroProductos+" PRODUCTOS");
    }

    public void mostraValorEnergetico(String valor){
        for (int i=0;i<numeroProductos;i++){
            if (catalogo[i].esMismoValorEnergetico(valor)){
                System.out.println(catalogo[i]);
            }
        }
    }


    public void mostrarPorTipo(String tipo) {
        for (int i=0;i<numeroProductos;i++){
            if (catalogo[i].esMismoTipo(tipo)){
                System.out.println(catalogo[i]);
            }
        }
    }

    public void mostrarPesoMenor (int peso){
        for (int i=0;i<numeroProductos;i++){
            if (catalogo[i].menorPeso(peso)){
                System.out.println(catalogo[i]);
            }
        }
    }
}
