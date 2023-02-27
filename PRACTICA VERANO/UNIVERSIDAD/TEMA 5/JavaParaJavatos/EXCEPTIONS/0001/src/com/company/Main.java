package com.company;

// Escribe un programa que juegue con el usuario a adivinar un número.
// El ordenador debe generar un número entre 1 y 500, y el usuario tiene
// que intentar adivinarlo. Para ello, cada vez que el usuario introduce
// un valor, el ordenador debe decirle al usuario si el número que tiene
// que adivinar es mayor o menor que el que ha introducido el usuario.
// Cuando consiga adivinarlo, debe indicárselo e imprimir en pantalla el
// número de veces que el usuario ha intentado adivinar el número.
// Si el usuario introduce algo que no es un número, debe indicarlo en pantalla, y contarlo como un intento.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int random, contador=0;
        boolean encontrado= false;

        random= (int) (Math.random()*100%500);

        Scanner input= new Scanner(System.in);

        do {

            try {
                int numero= input.nextInt();
                contador++;
                if (numero<random){
                    System.out.println("es mayor");
                }else if (random<numero){
                    System.out.println("es menor");
                }else {
                    System.out.println("lo encontraste en intentos: "+ contador);
                    encontrado= true;
                }
            }catch (Exception e){
                System.out.println("no has introducido un numero");
                contador++;
            }
            input.nextLine();
        }while (encontrado==false);



        input.close();
    }
}
