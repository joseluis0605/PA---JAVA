package com.company;

public class Main {

    public static void main(String[] args) {


        Turista turista1= new Turista("electronico", new Fecha("junio"), "madrid", 1 );
        Turista turista2= new Turista("papel", new Fecha("marzo"), "cophenage", 2 );
        Turista turista3= new Turista("electronico", new Fecha("junio"), "madrid", 3 );
        Turista turista4= new Turista("electronico", new Fecha("enero"), "madrid", 4 );
        Turista turista5= new Turista("papel", new Fecha("junio"), "madrid", 5 );

        Bussiness bussiness1= new Bussiness("electronico", new Fecha("mayo"), "cophenague", 6);
        Bussiness bussiness2= new Bussiness("papel", new Fecha("octubre"), "madrid", 7);
        Bussiness bussiness3= new Bussiness("electronico", new Fecha("enero"), "cophenague", 8);
        Bussiness bussiness4= new Bussiness("papel", new Fecha("diciembre"), "madrid", 9);
        Bussiness bussiness5= new Bussiness("electronico", new Fecha("mayo"), "cophenague", 10);

        GestorBilletes gestorBilletes= new GestorBilletes();

        gestorBilletes.addBillete(turista1);
        gestorBilletes.addBillete(turista2);
        gestorBilletes.addBillete(turista3);
        gestorBilletes.addBillete(turista4);
        gestorBilletes.addBillete(turista5);

        gestorBilletes.addBillete(bussiness1);
        gestorBilletes.addBillete(bussiness2);
        gestorBilletes.addBillete(bussiness3);
        gestorBilletes.addBillete(bussiness4);
        gestorBilletes.addBillete(bussiness5);

        gestorBilletes.mostrar();




    }
}
