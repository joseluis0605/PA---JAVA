package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CentroControl {

    private Map<String, ArrayList<Multa>> mapaMatricula;
    private Map<Integer, ArrayList<Multa>> mapaIdRadar;

    public CentroControl(){
        mapaMatricula= new HashMap<>();
        mapaIdRadar= new HashMap<>();
    }

    public void addMulta(String matricula, float importe, int idRadar){
        Multa multa= new Multa(matricula, importe, idRadar);

        ArrayList<Multa> lista= new ArrayList<>();
        lista= mapaMatricula.get(matricula);
        if (lista==null){
            lista= new ArrayList<>();
            lista.add(multa);
        }else {
            lista.add(multa);
        }
        mapaMatricula.put(matricula, lista);

        ArrayList<Multa> listaRadar= new ArrayList<>();
        listaRadar= mapaIdRadar.get(idRadar);

        if (listaRadar==null){
            listaRadar= new ArrayList<>();
            listaRadar.add(multa);
        }else {
            listaRadar.add(multa);
        }
        mapaIdRadar.put(idRadar, listaRadar);


    }

    public void mostrar(String matricula){
        System.out.println("SANCIONES DE ESTE COCHE");
        System.out.println(mapaMatricula.get(matricula));
        ArrayList<Multa> aux= new ArrayList<>();
        aux= mapaMatricula.get(matricula);

        if (aux!=null){
            float contador=0;
            for (Multa  multa: aux){
                contador= contador + multa.getImporteAPagar();
            }
            System.out.println("EL TOTAL A PAGAR ES: "+contador);
        }

    }

    public void mostrarRadar(int idRadar){
        System.out.println(mapaIdRadar.get(idRadar));
    }

    public void mostrarRadarMasMultas(){
        int radarMax=0;
        int idRadar=0;

        for (Map.Entry<Integer, ArrayList<Multa>> listado: mapaIdRadar.entrySet()){
            int aux= listado.getValue().size();
            if (aux> radarMax){
                radarMax=aux;
                idRadar= listado.getKey();
            }
        }

        System.out.println("el rada con mas hijo de puta es: "+idRadar+" con "+radarMax);
    }
}
