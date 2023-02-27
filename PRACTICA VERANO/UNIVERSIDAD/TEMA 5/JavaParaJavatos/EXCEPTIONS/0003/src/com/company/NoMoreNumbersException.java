package com.company;

public class NoMoreNumbersException extends Exception{
    public NoMoreNumbersException(int numeroMaximo) {
        super("Se ha superado el número máximo: "+numeroMaximo);
    }
}
