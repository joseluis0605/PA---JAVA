package com.company;

public class Tienda {

    private int biciMontana;
    private int actualMontana;
    private int biciCarretera;
    private int actualCarretera;

    private Mountain listadoM[];
    private Carretera listadoC[];

    public Tienda (){
        this.actualCarretera=0;
        this.actualMontana=0;
        this.biciCarretera=50;
        this.biciMontana=80;

        this.listadoC= new Carretera[50];
        this.listadoM= new Mountain[50];
    }

    public void addBiciMontana(Mountain mountain){

        if (actualMontana<listadoM.length){
            listadoM[actualMontana]= mountain;
            actualMontana++;
        }
    }

    public void addBiciCarretera (Carretera carretera){

        if (actualCarretera< listadoC.length){
            listadoC[actualCarretera]= carretera;
            actualCarretera++;
        }
    }


    public void sacarPrecio(String tipo, String marca1) {
        if (tipo.equals("carretera")){
            for (int i=0;i<actualCarretera;i++){
                if (listadoC[i].esDeEsaMarca(marca1)){
                    System.out.println(listadoC[i]);
                }
            }
        }else {
            for (int i=0;i<actualMontana;i++){
                if (listadoM[i].esDeEsaMarca(marca1)){
                    System.out.println(listadoM[i]);
                }
            }
        }
    }

    public void sacarTipo(String montana, String marca1) {
        int contador=0;
        if (montana.equals("carretera")){
            System.out.println("De carretera con la marca "+marca1+" hay un total de: ");
            for (int i=0;i<actualCarretera;i++){
                if (listadoC[i].esDeEsaMarca(marca1)){
                   contador++;
                }
            }
        }else {
            System.out.println("De carretera con la marca "+marca1+" hay un total de: ");
            for (int i=0;i<actualMontana;i++){
                if (listadoM[i].esDeEsaMarca(marca1)){
                    contador++;
                }
            }
        }
        System.out.println(contador);
    }
}
