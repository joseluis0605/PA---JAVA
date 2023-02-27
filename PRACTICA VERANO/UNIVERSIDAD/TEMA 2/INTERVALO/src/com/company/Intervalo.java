package com.company;

public class Intervalo {
    private int superior;
    private int inferior;

    public Intervalo (){
        this(0,0);
    }

    public Intervalo (int inferior, int superior){
        if (inferior<superior){
            this.inferior= inferior;
            this.superior= superior;
        }else {
            this.inferior=superior;
            this.superior=inferior;
        }

    }

    public String toString(){
        return "["+this.inferior+" "+this.superior+"]";
    }

    public int longitud(){
        return this.superior-this.inferior;
    }

    public boolean distinto(Intervalo intervalo){
        return this.inferior== intervalo.inferior && this.superior== intervalo.superior;
    }

    public void desplazar(int cantidad){
        this.inferior= this.inferior+cantidad;
        this.superior= this.superior+cantidad;
    }

    public Intervalo union (Intervalo intervalo){
        if (this.superior >= intervalo.inferior){
            return new Intervalo(this.inferior, intervalo.superior);
        }else if (intervalo.superior>= this.inferior){
            return new Intervalo(intervalo.inferior, this.superior);
        }else {
            return new Intervalo(0,0);
        }
    }

    public boolean estaContenido (int valor){
        return this.inferior<=valor && valor<= this.superior;
    }

    public boolean intervaloContenido (Intervalo intervalo){
        return this.inferior<= intervalo.inferior && this.superior>= intervalo.superior;
    }
}
