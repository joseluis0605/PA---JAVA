package com.company;

public class Main {

    public static void main(String[] args) {

        Noticiero ABC= new Noticiero(10);

        Ciberataque ciberataque1= new Ciberataque("Microsoft", new Fecha(10, "enero", 2021));
        Ciberataque ciberataque2= new Ciberataque("Apple", new Fecha(4, "julio", 2022));
        Ciberataque ciberataque3= new Ciberataque("Samsung", new Fecha(23, "enero", 2022));
        Ciberataque ciberataque4= new Ciberataque("LG", new Fecha(8, "enero", 2009));

        ABC.addNoticia(ciberataque1);
        //ABC.addNoticia(ciberataque2);
        ABC.addNoticia(ciberataque3);
        ABC.addNoticia(ciberataque4);

        ABC.mostrarNoticias();

        System.out.println(ABC.estaContenida(ciberataque2));




    }
}
