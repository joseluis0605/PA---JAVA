package com.company.producto.congelado;

import com.company.Fecha;

public class Nitrogeno extends Congelados{

    private int tiempoExposicion;

    public Nitrogeno(Fecha fechaCaducidad, int lote, int temperatura, int tiempoExposicion){
        super(fechaCaducidad, lote, temperatura);
        this.tiempoExposicion=tiempoExposicion;
    }
}
