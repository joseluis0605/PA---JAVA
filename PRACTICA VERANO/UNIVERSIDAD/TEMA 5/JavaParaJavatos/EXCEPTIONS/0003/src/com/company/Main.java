package com.company;

public class Main {

    public static void main(String[] args) {

        NumerosPescaderia numeros = new NumerosPescaderia(4);
        for(int i=0; i<6; i++){
            try {
                System.out.println(numeros.getNumero());
            } catch (NoMoreNumbersException e) {
                throw new Error("Error en el numero",e);
            }
        }
    }
}
