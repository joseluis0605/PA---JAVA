package com.company;

import java.util.Comparator;

public class ComparadorPrecio implements Comparator<Libro> {
    @Override
    public int compare(Libro o1, Libro o2) {
        if (o1.getPrecio()>o2.getPrecio()){
            return -1;
        }else if (o1.getPrecio()==o2.getPrecio()){
            return 0;
        }else {
            return 1;
        }
    }
}
