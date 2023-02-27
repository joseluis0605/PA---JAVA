package com.company;

import com.company.codigoProporcionado.TipoEvento;
import com.company.comparador.ComparadorTam;
import com.company.exceptions.FechaReservada;

import java.util.*;

public class Empresa {

    private Map<String, Espacio> mapaIdEspacio;
    private Map<TipoEvento, Set<Espacio>> mapaTipoEvento; //apartado b y a
    private Map<Fecha, Map<TipoEvento, Espacio>> mapaFechaReservar; //apartado d



    public Empresa(){
        this.mapaIdEspacio = new HashMap<>();
        this.mapaTipoEvento= new HashMap<>();
        this.mapaFechaReservar= new HashMap<>();
    }

    public void addEspacio(Espacio espacio){

        if (espacio.esValido()){
            Espacio espacio1= mapaIdEspacio.get(espacio.getId());
            if (espacio1==null){
                //no existe por lo tanto lo metemos
                mapaIdEspacio.put(espacio.getId(), espacio);

                Set<Espacio> listaEspacio= mapaTipoEvento.get(espacio.getTipoEvento());
                if (listaEspacio== null){
                    listaEspacio= new HashSet<>();
                    listaEspacio.add(espacio);
                    mapaTipoEvento.put(espacio.getTipoEvento(), listaEspacio);
                }else {
                    listaEspacio.add(espacio);
                    mapaTipoEvento.put(espacio.getTipoEvento(), listaEspacio);
                }
            }
        }
    }

    public void reservar(Espacio espacio, Fecha fecha) throws FechaReservada {
        Map<TipoEvento, Espacio> mapaAux= mapaFechaReservar.get(fecha);
        if (mapaAux==null){
            mapaAux= new HashMap<>();
            mapaAux.put(espacio.getTipoEvento(), espacio);
            mapaFechaReservar.put(fecha, mapaAux);
        }else {
            //existe la fecha
            //comprobamos que el local no este reservado
            Espacio espacio1= mapaAux.get(espacio.getTipoEvento());
            if (espacio1==null){
                //libre
                mapaAux.put(espacio.getTipoEvento(), espacio);
            }else {
                throw new FechaReservada();
            }
        }
    }

    public void mostrarEvento(TipoEvento tipoEvento){
        //mostramos por orden de tamaño de forma ascendente
        Set<Espacio> listadoSet= mapaTipoEvento.get(tipoEvento);
        ArrayList<Espacio> listaAux= new ArrayList<>();
        for (Espacio espacio : listadoSet){
            listaAux.add(espacio);
        }
        Collections.sort(listaAux, new ComparadorTam());
    }


}
