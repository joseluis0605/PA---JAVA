package com.company;

import com.company.instrumento.cuerda.Guitarra;
import com.company.instrumento.cuerda.Piano;
import com.company.instrumento.percusion.Timbales;
import com.company.instrumento.percusion.bateria.Acustica;
import com.company.instrumento.percusion.bateria.Electrica;
import com.company.instrumento.viento.Oboe;

public class Main {

    public static void main(String[] args) {

        Tienda tienda= new Tienda(100);

        Guitarra guitarra1= new Guitarra("CUERDA","GUITARRA","GUITARRA1", 100, 16  );
        Guitarra guitarra2= new Guitarra("CUERDA","GUITARRA","GUITARRA2", 200, 15  );
        Guitarra guitarra3= new Guitarra("CUERDA","GUITARRA","GUITARRA3", 300, 10  );
        Guitarra guitarra4= new Guitarra("CUERDA","GUITARRA","GUITARRA4", 100, 9 );

        Piano piano1= new Piano("CUERDA", "PIANO", "PIANO1", 100, 50);

        Electrica electrica1 = new Electrica("BATERIA ELECTRICA", "ELECTRICA","ELECTRICA1", 100);

        Acustica acustica1= new Acustica("BATERIA ACUSTICA", "ACUSTICA","ACUSTICA1", 100, 8,6);

        Timbales timbales1= new Timbales("PERCUSION", "TIMBALES", "TIMBALES1", 100, "laton");

        Oboe oboe1 = new Oboe("VIENTO", "OBOE", "OBOE1", 100);

        tienda.addGuitarra(guitarra1);
        /*tienda.addGuitarra(guitarra2);
        tienda.addGuitarra(guitarra3);
        tienda.addGuitarra(guitarra4);

        tienda.addPiano(piano1);

        tienda.addElectrica(electrica1);

        tienda.addAcustica(acustica1);

        tienda.addTimbales(timbales1);

        tienda.addOboe(oboe1);*/

        tienda.mostrarCatalogo();

        tienda.rebajada(guitarra1, 15);

        tienda.mostrarCatalogo();
    }
}
