package com.company.tipoEspacio;

import com.company.Espacio;
import com.company.codigoProporcionado.TipoEvento;

public class Infantil extends Espacio {

    public Infantil(String id, int capacidad, int metros, String direccion, int coste, TipoEvento tipoEvento){
        super(id, capacidad, metros, direccion, coste, tipoEvento);
    }

    public boolean esValido(){
        return true;
    }


}
