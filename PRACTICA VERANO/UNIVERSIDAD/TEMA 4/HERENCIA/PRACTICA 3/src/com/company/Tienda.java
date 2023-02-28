package com.company;

import com.company.instrumento.cuerda.Guitarra;
import com.company.instrumento.cuerda.Piano;
import com.company.instrumento.percusion.Timbales;
import com.company.instrumento.percusion.bateria.Acustica;
import com.company.instrumento.percusion.bateria.Electrica;
import com.company.instrumento.viento.Oboe;

public class Tienda {

    private Instrumento catalogo[];
    private int numeroAcutal;

    public Tienda(int max){
        this.numeroAcutal=0;
        this.catalogo= new Instrumento[max];
    }

    public void mostrarCatalogo(){
        for (int i=0;i<numeroAcutal;i++){
            System.out.println(catalogo[i]);
            System.out.println("---------------------------------");
        }
    }

    public void addOboe(Oboe oboe){
        if (numeroAcutal<catalogo.length){
            catalogo[numeroAcutal]= oboe;
            numeroAcutal++;
        }
    }

    public void addGuitarra (Guitarra guitarra){
        if (numeroAcutal<catalogo.length){
            catalogo[numeroAcutal]= guitarra;
            numeroAcutal++;
        }
    }

    public void addPiano(Piano piano){
        if (numeroAcutal<catalogo.length){
            catalogo[numeroAcutal]= piano;
            numeroAcutal++;
        }
    }

    public void addTimbales (Timbales timbales){
        if (numeroAcutal<catalogo.length){
            catalogo[numeroAcutal]= timbales;
            numeroAcutal++;
        }
    }

    public void addElectrica (Electrica electrica){
        if (numeroAcutal<catalogo.length){
            catalogo[numeroAcutal]= electrica;
            numeroAcutal++;
        }
    }

    public void addAcustica (Acustica acustica){
        if (numeroAcutal<catalogo.length){
            catalogo[numeroAcutal]= acustica;
            numeroAcutal++;
        }
    }

    public void rebajada (Instrumento instrumento, int porcentaje){
        String nombre= instrumento.getNombreInstrumento();
        String marca= instrumento.getMarca();

        for (int i=0;i<numeroAcutal;i++){
            if (catalogo[i].encontrado(instrumento)){
                catalogo[i].rebajarPrecio(instrumento, porcentaje);
            }
        }
    }

}
