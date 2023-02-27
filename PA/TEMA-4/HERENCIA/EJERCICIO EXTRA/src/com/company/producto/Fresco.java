package com.company.producto;

import com.company.Fecha;
import com.company.producto.Producto;

public class Fresco extends Producto {

    private String paisOrigen;

    public Fresco(Fecha fechaCaducidad, int lote, String paisOrigen){
        super(fechaCaducidad, lote);
        this.paisOrigen= paisOrigen;
    }

    public String toString(){
        return "producto fresco procedente de: "+paisOrigen+" "+super.toString();
    }
}
