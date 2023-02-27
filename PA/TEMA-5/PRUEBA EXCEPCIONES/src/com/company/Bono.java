package com.company;

import java.util.Scanner;

public class Bono {

    private static int cantidad;

    public Bono(int cantidad){
        this.cantidad=cantidad;
    }

    public static void sacarBillete()throws MiExcepcionFuerte{
        cantidad--;
        if (cantidad<0){
            throw new MiExcepcionFuerte();
        }
    }

    public static void recargar(int numero){
        cantidad=cantidad+numero;
        System.out.println("bono recargado");
    }
}
