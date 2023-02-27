package com.company.producto.congelado;

import com.company.Fecha;

public class Aire extends Congelados{

    private int gramosSal;

    public Aire(Fecha fechaCaducidad, int lote, int temperatura, int gramosSal){
        super(fechaCaducidad, lote, temperatura);
        this.gramosSal= gramosSal;
    }
}
