package com.company.hacker;

import com.company.amenaza.Amenaza;
import com.company.amenaza.Dificultad;

import java.util.ArrayList;

public class Hacker {

    private String nombreHacker;
    private ArrayList<Amenaza> listaAmenaza;
    private Categoria categoria;

    public Hacker (String nombreHacker, Categoria categoria){
        this.nombreHacker= nombreHacker;
        this.categoria= categoria;
        this.listaAmenaza= new ArrayList<>();
    }

    public void asignarAmenaza(Amenaza amenaza){
        if (puedoTratarla(amenaza)){
            listaAmenaza.add(amenaza);
        }
    }

    private boolean puedoTratarla(Amenaza amenaza) {
        if (categoria.equals(Categoria.Newbie)){
            if (amenaza.getDificultad().equals(Dificultad.BAJA) && listaAmenaza.size()<4){
                return true;
            }
        }else  if (categoria.equals(Categoria.Vodoo)){
            if (!amenaza.getDificultad().equals(Dificultad.ALTA) && listaAmenaza.size()<4){
                return true;
            }
        }else if (categoria.equals(Categoria.Wizard)){
            if (!amenaza.getDificultad().equals(Dificultad.BAJA)){
                return true;
            }
        }else {
            return false;
        }
        return false;
    }


}
