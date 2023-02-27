package com.company;

import com.company.codigoProporcionado.CalendarioAnual;
import com.company.codigoProporcionado.TipoEvento;

public class User {

    private TipoEvento tipoEvento;
    private int numeroPersona;
    private Fecha fecha;


    public User(TipoEvento tipoEvento, int numeroPersona, Fecha fecha){
        this.tipoEvento= tipoEvento;
        this.numeroPersona= numeroPersona;
        this.fecha= fecha;
    }

}
