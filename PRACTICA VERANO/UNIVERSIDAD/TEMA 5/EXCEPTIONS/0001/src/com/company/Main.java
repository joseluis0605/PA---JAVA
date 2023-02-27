package com.company;

public class Main {

    public static void main(String[] args) {
        BonoTransporte bonoTransporte= new BonoTransporte();
        bonoTransporte.recargar(1);
        for (int i=0;i<5;i++){
            bonoTransporte.usar();
        }


    }
}
