package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tienda tienda= new Tienda();

        Mountain mountain1= new Mountain("marca1", "modelo1", 100, "si");
        Mountain mountain2= new Mountain("marca2", "modelo2", 456, "no");
        Mountain mountain3= new Mountain("marca3", "modelo3", 500, "si");
        Mountain mountain4= new Mountain("marca1", "modelo4", 900, "no");
        Mountain mountain5= new Mountain("marca1", "modelo5", 400, "si");
        Mountain mountain6= new Mountain("marca1", "modelo6", 600, "no");
        Mountain mountain7= new Mountain("marca7", "modelo7", 200, "no");
        Mountain mountain8= new Mountain("marca8", "modelo8", 800, "si");


        Carretera carretera1= new Carretera("MARCA1", "MODELO1", 100, 5);
        Carretera carretera2= new Carretera("MARCA2", "MODELO1", 789, 2);
        Carretera carretera3= new Carretera("MARCA3", "MODELO1", 500, 7);
        Carretera carretera4= new Carretera("MARCA4", "MODELO1", 100, 4);
        Carretera carretera5= new Carretera("MARCA5", "MODELO1", 700, 6);
        Carretera carretera6= new Carretera("MARCA6", "MODELO1", 300, 5);
        Carretera carretera7= new Carretera("MARCA7", "MODELO1", 800, 8);
        Carretera carretera8= new Carretera("MARCA8", "MODELO1", 600, 1);

        tienda.addBiciCarretera(carretera1);
        tienda.addBiciCarretera(carretera2);
        tienda.addBiciCarretera(carretera3);
        tienda.addBiciCarretera(carretera4);
        tienda.addBiciCarretera(carretera5);
        tienda.addBiciCarretera(carretera6);
        tienda.addBiciCarretera(carretera7);
        tienda.addBiciCarretera(carretera8);


        tienda.addBiciMontana(mountain1);
        tienda.addBiciMontana(mountain2);
        tienda.addBiciMontana(mountain3);
        tienda.addBiciMontana(mountain4);
        tienda.addBiciMontana(mountain5);
        tienda.addBiciMontana(mountain6);
        tienda.addBiciMontana(mountain7);
        tienda.addBiciMontana(mountain8);

        tienda.sacarPrecio("carretera", "MARCA1");
        tienda.sacarTipo("montana", "marca1");

    }
}
