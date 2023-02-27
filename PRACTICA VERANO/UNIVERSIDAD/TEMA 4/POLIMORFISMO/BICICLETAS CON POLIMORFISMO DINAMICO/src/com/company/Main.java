package com.company;

public class Main {

    public static void main(String[] args) {

        Tienda tienda= new Tienda(10);

        Montana montana1= new Montana("marca1", "montana", 100, "si");
        Montana montana2= new Montana("marca2", "montana", 200, "si");
        Montana montana3= new Montana("marca1", "montana", 90, "no");
        Montana montana4= new Montana("marca2", "montana", 150, "si");

        Carretera carretera1= new Carretera("marca3", "carretera", 100, 5);
        Carretera carretera2= new Carretera("marca3", "carretera", 100, 5);
        Carretera carretera3= new Carretera("marca4", "carretera", 100, 8);
        Carretera carretera4= new Carretera("marca3", "carretera", 100, 5);

        tienda.addBicicleta(montana1);
        tienda.addBicicleta(montana2);
        tienda.addBicicleta(montana3);
        tienda.addBicicleta(montana4);
        tienda.addBicicleta(carretera1);
        tienda.addBicicleta(carretera2);
        tienda.addBicicleta(carretera3);
        tienda.addBicicleta(carretera4);

        //tienda.mostrarCatalogo();

        //tienda.mostrarTipo("carretera");

        tienda.mostrarMarca("marca1");
    }
}
