package com.company.tipoEspacio;

import com.company.Espacio;
import com.company.codigoProporcionado.TipoEvento;

public class NaveChic extends Espacio {



    public NaveChic(String id, int capacidad, int metros, String direccion, int coste, TipoEvento tipoEvento){
        super(id, capacidad, metros, direccion, coste, tipoEvento);
    }

    public boolean esValido(){
        TipoEvento tipoEvento= getTipoEvento();
        return tipoEvento.equals(TipoEvento.BODA) || tipoEvento.equals(TipoEvento.EVENTO_CORPORATIVO) || tipoEvento.equals(TipoEvento.CELEBRACION_FAMILIAR) ||tipoEvento.equals(TipoEvento.FIESTA_EMPRESA) ;
    }
}
/*


 */