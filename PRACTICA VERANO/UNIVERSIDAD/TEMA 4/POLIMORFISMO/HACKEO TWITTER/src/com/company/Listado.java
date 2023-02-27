package com.company;

public class Listado {

    private User lista[];
    private int numeroUsuarios;

    public Listado(int max){
        this.lista= new User[max];
        this.numeroUsuarios=0;
    }

    public void addUsuario (User user, String tipo){
        if (tipo.equals("comon")){
            lista[numeroUsuarios]= user;
            numeroUsuarios++;
        }else if(tipo.equals("secured")){
            if (user.esAcordeNivel()){
                lista[numeroUsuarios]= user;
                numeroUsuarios++;
            }
        }else if (tipo.equals("super")){
            if (user.esAcordeNivel()){
                lista[numeroUsuarios]= user;
                numeroUsuarios++;
            }
        }
    }

    public void mostrar(){
        for (int i=0;i<numeroUsuarios;i++){
            System.out.println(lista[i]);
            System.out.println("***********************");
        }
    }
}
