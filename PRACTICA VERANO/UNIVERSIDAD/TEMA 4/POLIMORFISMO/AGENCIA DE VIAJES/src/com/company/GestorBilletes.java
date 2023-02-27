package com.company;

import java.sql.ClientInfoStatus;

public class GestorBilletes {

    private Billete billetes[];
    private int numeroBilletes;

    private int turistas= 221;
    private int bussiness= 26;

    public GestorBilletes(){
        billetes= new Billete[247];
        this.numeroBilletes=0;
    }

    public void addBillete(Billete billete){
        if (numeroBilletes<billetes.length){
            if (billete.tipo().equals("turista") && turistas>0){
                turistas--;
            }else {
                bussiness--;
            }
            billetes[numeroBilletes]= billete;
            numeroBilletes++;
        }

    }

    public void mostrar(){
        System.out.println("BILLETES BUSSINES");
        for (int i=0;i<numeroBilletes;i++){
            if (billetes[i].tipo().equals("bussiness")){
                System.out.println(billetes[i]);
            }
        }

        System.out.println("BILLETES TURISTAS");
        for (int i=0;i<numeroBilletes;i++){
            if (billetes[i].tipo().equals("turista")){
                System.out.println(billetes[i]);
            }
        }
    }
}
