package com.company;

public class Carretera extends Bicicleta{

    private int peso;

    public Carretera(String marca, String modelo, int precioBase, int peso) {
        super(marca, modelo, precioBase);
        this.peso= peso;
        modificadorBicicletas();
    }

    @Override
    protected void modificadorBicicletas() {
        int valor= getPrecioBase();
        valor= valor+ 50;
        if (peso<6){
            valor= valor + 150;
        }
        setPrecioBase(valor);
    }

    @Override
    public boolean esMONTANA() {
        return false;
    }

    @Override
    public boolean esCARRETERA() {
        return true;
    }
}
