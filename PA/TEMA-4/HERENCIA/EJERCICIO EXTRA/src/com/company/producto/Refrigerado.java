package com.company.producto;

import com.company.Fecha;
import com.company.producto.Producto;

public class Refrigerado extends Producto {

    private int codigoSupervisor;

    public Refrigerado(Fecha fechaCaducidad, int lote, int codigoSupervisor){
        super(fechaCaducidad, lote);
        this.codigoSupervisor= codigoSupervisor;
    }

    public String toString(){
        return "soy un producto refrigerado y mi codigo de supervisor es: "+this.codigoSupervisor+" "+super.toString();
    }
}
