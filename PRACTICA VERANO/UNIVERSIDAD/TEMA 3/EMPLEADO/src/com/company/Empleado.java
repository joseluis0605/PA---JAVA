package com.company;

public class Empleado {

    private String nombre;
    private String apellido;
    private Nif nif;
    private int edad;
    private int horasExtras;
    private int sueldo;

    public Empleado (String nombre, String apellido, Nif nif){
        this(nombre, apellido, nif, 18, 900);
    }

    public Empleado(String nombre, String apellido, Nif nif, int edad, int sueldo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.nif= nif;
        this.edad= edad;
        this.horasExtras=0;
        this.sueldo= sueldo;
    }

    public String toString(){
        return "Nombre y apelidos: "+nombre+" "+apellido+nif+" Edad: "+edad+" Sueldo: "+sueldo+ " Horas extras: "+horasExtras;
    }

    public boolean mismoNif(Nif nif) {
        return this.nif.igual(nif);
    }

    public boolean esMayorSueldo(Empleado empleado) {
        return sueldo> empleado.sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean ganaMasDe(int sueldo) {
        return sueldo < this.sueldo;
    }

    public void addHoras(int horaExtra) {
        this.horasExtras= this.horasExtras+horaExtra;
    }

    public int rango(){
        if (18<=edad && edad<25){
            return 1;
        }else if(26<edad && edad<35){
            return 2;
        }else if(36<edad && edad<45){
            return 3;
        }else {
            return 4;
        }
    }

    public boolean tieneExtra() {
        return horasExtras>0;
    }
}
