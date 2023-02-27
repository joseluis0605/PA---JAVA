package com.company.tipoEspacio;

import com.company.Espacio;
import com.company.codigoProporcionado.TipoEvento;

public class Loft extends Espacio {


    public Loft(String id, int capacidad, int metros, String direccion, int coste, TipoEvento tipoEvento){
        super(id, capacidad, metros, direccion, coste, tipoEvento);
    }

    public boolean esValido(){
        TipoEvento tipoEvento= getTipoEvento();
        return  tipoEvento.equals(TipoEvento.EVENTO_CORPORATIVO) || tipoEvento.equals(TipoEvento.CELEBRACION_FAMILIAR) ;
    }

}
