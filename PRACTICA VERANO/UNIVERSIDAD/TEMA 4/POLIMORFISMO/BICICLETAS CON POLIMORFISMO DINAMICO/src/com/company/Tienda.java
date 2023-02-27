package com.company;

public class Tienda {

    private int numeroBicicletas;
    private Bicicleta catalogo[];


    public Tienda(int max){
        this.numeroBicicletas=0;
        this.catalogo= new Bicicleta[max];
    }

    public void addBicicleta(Bicicleta bicicleta){
        if (numeroBicicletas<catalogo.length){
            catalogo[numeroBicicletas]= bicicleta;
            numeroBicicletas++;
        }
    }

    public void mostrarCatalogo(){
        for (int i=0; i<numeroBicicletas;i++){
            System.out.println(catalogo[i]);
            System.out.println("***************************");
        }
    }

    public void mostrarTipo (String tipo){
        if (tipo.equals("montana")){
            for (int i=0;i<numeroBicicletas;i++){
                if (catalogo[i].esMONTANA()){
                    System.out.println(catalogo[i]);
                }
            }
        }else {
            for (int i=0;i<numeroBicicletas;i++){
                if (catalogo[i].esCARRETERA()){
                    System.out.println(catalogo[i]);
                }
            }
        }
    }

    public void mostrarMarca (String marca){
        for (int i=0;i<numeroBicicletas;i++){
            if (catalogo[i].esMARCA(marca)){
                System.out.println(catalogo[i]);
            }
        }
    }

}
