package com.company;

//Escribe un programa que lance y capture una excepción.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        int random= (int) (Math.random()*100%10);
        int numero;
        boolean encontrado= false;

        Scanner input= new Scanner(System.in);

        do {

            try {
                numero= input.nextInt();
                if (numero==random){
                    System.out.println("encontrado");
                    encontrado=true;
                }else if (numero<random){
                    System.out.println("es mayor");
                }else {
                    System.out.println("es menor");
                }

            }catch (Exception e){
                throw new ExceptionDebil();
            }
            input.nextLine();

        }while (!encontrado);



        input.close();
    }
}
