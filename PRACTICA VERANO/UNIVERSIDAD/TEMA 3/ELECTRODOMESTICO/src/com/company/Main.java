package com.company;

public class Main {

    public static void main(String[] args) {

        Catalogo catalogo= new Catalogo();

        Electrodomestico electrodomestico1= new Electrodomestico("lavadora", 60, 150, "A", "AEG");
        Electrodomestico electrodomestico2= new Electrodomestico("secadora", 50, 200, "B", "PHILIPS");
        Electrodomestico electrodomestico3= new Electrodomestico("lavavajillas", 69, 500, "A", "AEG");
        Electrodomestico electrodomestico4= new Electrodomestico("termostato", 37, 700, "B", "PHILIPS");
        Electrodomestico electrodomestico5= new Electrodomestico("lavadora", 82, 70, "F", "BOSH");
        Electrodomestico electrodomestico6= new Electrodomestico("secadora", 30, 800, "B", "AEG");
        Electrodomestico electrodomestico7= new Electrodomestico("lavaplatos", 78, 600, "A", "PHILIPS");
        Electrodomestico electrodomestico8= new Electrodomestico("lavadora", 52, 900, "F", "BOSH");
        Electrodomestico electrodomestico9= new Electrodomestico("aire acondicionado", 50, 150, "F", "BOSH");
        Electrodomestico electrodomestico0= new Electrodomestico("ventilador", 100, 500, "F", "PHILIPS");


        catalogo.addElectrodomestico(electrodomestico0);
        catalogo.addElectrodomestico(electrodomestico1);
        catalogo.addElectrodomestico(electrodomestico2);
        catalogo.addElectrodomestico(electrodomestico3);
        catalogo.addElectrodomestico(electrodomestico4);
        catalogo.addElectrodomestico(electrodomestico5);
        catalogo.addElectrodomestico(electrodomestico6);
        catalogo.addElectrodomestico(electrodomestico7);
        catalogo.addElectrodomestico(electrodomestico8);
        catalogo.addElectrodomestico(electrodomestico9);

        catalogo.mostrar();

        //catalogo.mostraValorEnergetico("A");

        //catalogo.mostrarPorTipo("lavadora");

        //catalogo.mostrarPesoMenor(50);

    }
}
