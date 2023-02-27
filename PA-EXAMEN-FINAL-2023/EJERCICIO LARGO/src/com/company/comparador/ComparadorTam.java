package com.company.comparador;

import com.company.Espacio;

import java.util.Comparator;

public class ComparadorTam implements Comparator<Espacio> {
    @Override
    public int compare(Espacio o1, Espacio o2) {
        if (o1.getMetros()<o2.getMetros()){
            return -1;
        }else if (o1.getMetros()==o2.getMetros()){
            return 0;
        }else {
            return 1;
        }
    }
}
