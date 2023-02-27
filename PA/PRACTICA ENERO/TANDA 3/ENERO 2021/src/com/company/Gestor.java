package com.company;

import com.company.amenaza.Amenaza;
import com.company.amenaza.Dificultad;
import com.company.amenaza.Urgencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Gestor {

    private Map<Urgencia, ArrayList<Amenaza>> mapaUrgenciasNoTratadas;

    public Gestor(){
        this.mapaUrgenciasNoTratadas= new HashMap<>();
    }

    public void addAmenaza(Amenaza amenaza){
        ArrayList<Amenaza> listaAmenaza= mapaUrgenciasNoTratadas.get(amenaza.getUrgencia());
        if (listaAmenaza==null){
            listaAmenaza= new ArrayList<>();
            listaAmenaza.add(amenaza);
            mapaUrgenciasNoTratadas.put(amenaza.getUrgencia(), listaAmenaza);
        }else {
            listaAmenaza.add(amenaza);
            mapaUrgenciasNoTratadas.put(amenaza.getUrgencia(), listaAmenaza);
        }
    }


}
