package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bono bono= new Bono(4);

        for (int i = 0; i < 6; i++) {
            try {
                Bono.sacarBillete();
            }catch (MiExcepcionFuerte e){
                System.out.println("cuidado que te estas pasando");
            }
        }

        Bono.recargar(2);


    }
}
