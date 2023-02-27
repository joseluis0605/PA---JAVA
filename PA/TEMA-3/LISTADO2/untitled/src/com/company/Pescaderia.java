package com.company;

public class Pescaderia {

    private static int tickets=5;


    public Pescaderia(int tickets) {
        Pescaderia.tickets = tickets;
    }

    public static void sacar(){
        if (tickets>0){
            tickets--;
            System.out.println("quedan "+tickets);
        }else {
            System.out.println("no me quedan");
        }
    }
}
