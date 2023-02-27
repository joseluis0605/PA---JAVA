package com.company;

public class Montana extends Bicicleta{

    private String amortiguador;

    public Montana(String marca, String modelo, int precioBase, String amortiguador) {
        super(marca, modelo, precioBase);
        this.amortiguador= amortiguador;
        modificadorBicicletas();
    }

    @Override
    protected void modificadorBicicletas() {
        int valor= getPrecioBase();
        if (amortiguador.equals("si")){
            valor= valor + 60;
        }
        setPrecioBase(valor);
    }

    @Override
    public boolean esMONTANA() {
        return true;
    }

    @Override
    public boolean esCARRETERA() {
        return false;
    }
}
