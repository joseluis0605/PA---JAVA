package com.company;

import com.company.tipoVehiculo.Combustion;

import java.util.Comparator;

public class ComparadorMatricula implements Comparator<Vehiculo> {
    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        if (o1.getMatricula().compareTo(o2.getMatricula())<0){
            return 1;
        }else if (o1.getMatricula().compareTo(o2.getMatricula())==0){
            return 0;
        }else {
            return -1;
        }
    }
}
