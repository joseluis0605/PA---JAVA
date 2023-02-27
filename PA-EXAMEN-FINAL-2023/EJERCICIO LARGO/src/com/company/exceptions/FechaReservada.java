package com.company.exceptions;

import com.company.Fecha;

import static java.lang.System.exit;

public class FechaReservada extends Exception{
    public FechaReservada(){
        System.out.println("fecha ya reservada");
        exit(1); //terminamos la ejercucion del programa
    }
}
