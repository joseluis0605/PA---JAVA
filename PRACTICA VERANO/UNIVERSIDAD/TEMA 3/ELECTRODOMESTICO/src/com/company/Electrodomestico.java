package com.company;

public class Electrodomestico {

    private String nombre;
    private int peso;
    private int precio;
    private String consumoEnergetico;
    private String marca;

    public Electrodomestico(String nombre, int precio, int peso){
        this(nombre, peso, precio, "F", "BOSH");
    }

    public Electrodomestico(String nombre, int peso, int precio, String consumoEnergetico, String marca){
        this.nombre=nombre;
        this.precio= precio;
        this.peso=peso;
        this.consumoEnergetico= consumoEnergetico;
        this.marca= marca;
        addConsumoCoste(consumoEnergetico);
    }

    private void addConsumoCoste(String consumoEnergetico) {
        switch (consumoEnergetico){
            case "A":
                this.precio= this.precio+100;
            break;
            case "B":
                this.precio= this.precio+80;
            break;
            case "C":
                this.precio= this.precio+60;
            break;
            case "D":
                this.precio= this.precio+50;
            break;
            case "E":
                this.precio= this.precio+30;
            break;
            case "F":
                this.precio= this.precio+10;
            break;
            default:

        }
    }

    public String toString (){
        return "Marca: "+marca+" precio:"+precio+" es un/una "+nombre;
    }

    public boolean esMismoValorEnergetico(String valor) {
        return this.consumoEnergetico.equals(valor);
    }

    public boolean esMismoTipo(String tipo) {
        return this.nombre.equals(tipo);
    }

    public boolean menorPeso(int peso) {
        return this.peso < peso;
    }
}
