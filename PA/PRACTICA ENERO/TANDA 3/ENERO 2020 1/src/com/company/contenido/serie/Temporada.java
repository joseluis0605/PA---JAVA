package com.company.contenido.serie;

import java.util.ArrayList;
import java.util.Objects;

public class Temporada {

    private int id;
    private ArrayList<Capitulo> listaCapitulo;

    public Temporada(int id){
        this.id= id;
        this.listaCapitulo= new ArrayList<>();
    }

    public void addCapitulo(Capitulo capitulo){
        if (!listaCapitulo.contains(capitulo)){ //si el capitulo no esta se añade
            listaCapitulo.add(capitulo);
        }else {
            System.out.println("capitulo ya existente\n");
        }
    }

    public int sumaMinutos(){
        int contador=0;

        for (Capitulo capitulo : listaCapitulo){
            contador= contador+ capitulo.getDuracion();
        }

        return contador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temporada temporada = (Temporada) o;
        return id == temporada.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public ArrayList<Capitulo> getListaCapitulo() {
        return listaCapitulo;
    }
}
