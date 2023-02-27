package com.company.producto.congelado;

import com.company.Fecha;

public class Agua extends Congelados{

    private String producto;

    public Agua(Fecha fechaCaducidad, int lote, int temperatura, String producto){
        super(fechaCaducidad, lote, temperatura);
        this.producto= producto;
    }
}
