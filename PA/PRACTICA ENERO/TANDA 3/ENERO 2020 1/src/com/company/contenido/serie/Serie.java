package com.company.contenido.serie;

import com.company.contenido.Contenido;
import com.company.excepciones.NoSuchSeasonException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Serie extends Contenido {

    private Map<Integer, Temporada> mapaTemporada;
    private ArrayList<Temporada> listaTemporada;

    public Serie(String titulo){
        super(titulo);
        this.mapaTemporada= new HashMap<>();
        this.listaTemporada= new ArrayList<>();
    }

    public void addTemporada(){
        int numero= listaTemporada.size(); //numero de temporada nueva
        Temporada temporada= new Temporada(numero);//creamos temporada
        this.listaTemporada.add(temporada);
        this.mapaTemporada.put(numero, temporada);
    }

    public void addCapituloTemporada(int temporada, Capitulo capitulo)throws NoSuchSeasonException {
        int numeroMaximo= this.listaTemporada.size();
        if (temporada<numeroMaximo){
            Temporada temporada1= this.mapaTemporada.get(temporada);
            temporada1.addCapitulo(capitulo);
            mapaTemporada.put(temporada, temporada1);
            int contador= contadorTiempo();
            setDuracion(contador);
        }else {
            throw new NoSuchSeasonException();
        }
    }

    private int contadorTiempo(){
        int contador=0;

        for (Temporada temporada : listaTemporada){
            contador= contador+ temporada.sumaMinutos();
        }

        return contador;
    }
}
