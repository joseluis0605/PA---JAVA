package com.company;

public class Noticiero {

    private  int numeroNoticias=0;
    private Ciberataque listado[];
    private int maximoNoticias;

    public Noticiero(int maximoNoticias){
        listado= new Ciberataque[maximoNoticias];
        this.maximoNoticias= maximoNoticias;
    }

    public void addNoticia (Ciberataque ciberataque){
        if (numeroNoticias < maximoNoticias){
            this.listado[numeroNoticias]= ciberataque;
            numeroNoticias++;
        }else {
            System.out.println("noticiero sin capacidad");
        }
    }

    public void mostrarNoticias(){
        for (int i=0;i<numeroNoticias;i++){
            System.out.println(listado[i]);
        }
        System.out.println("hay un total de:"+numeroNoticias+" noticias.");
    }

    public boolean estaContenida(Ciberataque ciberataque){
        boolean esta= false;
        for (int i=0;i<numeroNoticias;i++){
            esta= listado[i].coincide(ciberataque);
            if (esta){
                return esta;
            }
        }
        return esta;
    }

}
