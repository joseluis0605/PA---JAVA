package com.company.contenido.documental;

import com.company.contenido.Contenido;

public class Documental extends Contenido {

    private boolean hechoReal;

    public Documental(String titulo, int duracion, boolean hechoReal){
        super(titulo, duracion);
        this.hechoReal= hechoReal;
    }


}
