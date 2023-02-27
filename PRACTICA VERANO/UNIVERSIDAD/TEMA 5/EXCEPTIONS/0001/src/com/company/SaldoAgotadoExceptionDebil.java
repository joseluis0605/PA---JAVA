package com.company;

public class SaldoAgotadoExceptionDebil extends RuntimeException{
    public SaldoAgotadoExceptionDebil(){
        super("Recarga porque no te quedan mas billetes... saldo: 0");
    }
}
