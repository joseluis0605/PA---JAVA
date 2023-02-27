package com.company.producto;

import com.company.Fecha;

public class Producto {

    private Fecha fechaCaducidad;
    private int lote;

    public Producto(Fecha fechaCaducidad, int lote){
        this.fechaCaducidad= fechaCaducidad;
        this.lote= lote;
    }

    public String toString(){
        return fechaCaducidad+" lote numero: "+lote;
    }

}
