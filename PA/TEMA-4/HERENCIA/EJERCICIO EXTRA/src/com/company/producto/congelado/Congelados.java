package com.company.producto.congelado;

import com.company.Fecha;
import com.company.producto.Producto;

public class Congelados extends Producto {

    private int temperatura;

    public Congelados(Fecha fechaCaducidad, int lote, int temperatura){
        super(fechaCaducidad, lote);
        this.temperatura= temperatura;
    }

    public String toString(){
        return "soy un producto congelado y mi temperatura de congelacion es: "+this.temperatura+" "+super.toString();
    }
}
