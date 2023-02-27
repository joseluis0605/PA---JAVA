package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int contador=0, introducido;
        int random= (int) (Math.random() * 100) %10;
        boolean encontrado= false;

        Scanner input= new Scanner(System.in);


        do {
            try {
                System.out.println("introduce el numero");
                introducido= input.nextInt();
                if (introducido!=random){
                    contador++;
                }else {
                    encontrado=true;
                    contador++;
                }
            }catch (Exception e){
                contador++;
                System.out.println("has introducido algo que no es un numero");
            }
            input.nextLine();
        }while (!encontrado);

        System.out.println("lo has encontrado en numero de intentos: "+contador);


        input.close();
    }
}
