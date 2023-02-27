package com.company.contenido;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Contenido> {
    @Override
    public int compare(Contenido o1, Contenido o2) {
        if (o1.getTitulo().compareTo(o2.getTitulo()) < 0){
            return 1;
        }else if (o1.getTitulo().compareTo(o2.getTitulo())>0){
            return -1;
        }else {
            return 0;
        }
    }
}
