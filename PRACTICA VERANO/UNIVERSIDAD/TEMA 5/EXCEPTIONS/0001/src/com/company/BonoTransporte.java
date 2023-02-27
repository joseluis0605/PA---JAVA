package com.company;

public class BonoTransporte {

    private int disponible;

    public BonoTransporte(){
        this.disponible= 0;
    }

    public void recargar(int numero){
        this.disponible= this.disponible+numero;
        System.out.println("HAS RECARGADO Y TIENES AHORA: "+disponible);
    }

    public void usar(){
        disponible--;
    try {
        if (disponible>=0){
            System.out.println("gastado, quedan:"+disponible);
        }
    }catch (Exception e){
        throw new SaldoAgotadoExceptionDebil();
    }

    }
}
