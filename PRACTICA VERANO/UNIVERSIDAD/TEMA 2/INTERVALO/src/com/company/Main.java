package com.company;

public class Main {

    public static void main(String[] args) {

        Intervalo intervalo1= new Intervalo(1,4);
        Intervalo intervalo2= new Intervalo(2,3);
        Intervalo intervalo3= new Intervalo(6,1);

        System.out.println(intervalo1);
        System.out.println(intervalo2);
        System.out.println(intervalo3);

        System.out.println(intervalo1.longitud());

        Intervalo union = intervalo1.union(intervalo2);
        System.out.println(union);

        System.out.println(intervalo1.estaContenido(0));
        System.out.println(intervalo1.estaContenido(3));
    }
}
