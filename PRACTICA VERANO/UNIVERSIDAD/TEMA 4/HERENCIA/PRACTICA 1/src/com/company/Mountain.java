package com.company;

public class Mountain extends  Bicicleta{

    private String amortigurador;

    public Mountain(String marca, String modelo, int precioBase, String amortigurador){
        super(marca, modelo, precioBase);
        this.amortigurador= amortigurador;
        changePrecio(precioBase);
    }

    private void changePrecio(int precio){
        if (this.amortigurador.equals("si")){
            int prize= getPrecioBase();
            prize= prize+60;
            modificar(prize);
        }
    }

    public String toString(){
        return super.toString()+" amortiguador: "+amortigurador;
    }
}
