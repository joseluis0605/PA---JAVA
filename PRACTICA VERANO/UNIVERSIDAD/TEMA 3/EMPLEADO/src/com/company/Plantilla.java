package com.company;

public class Plantilla {

    private Empleado lista[];
    private int maximoPlantilla;
    private int numeroEmpleados;

    public Plantilla(int maximoPlantilla){
        this.numeroEmpleados=0;
        this.maximoPlantilla= maximoPlantilla;
        this.lista= new Empleado[maximoPlantilla];
    }

    public void addEmpleado( Empleado empleado){
        if (numeroEmpleados<maximoPlantilla){
            this.lista[numeroEmpleados]= empleado;
            numeroEmpleados++;
        }
    }

    public void mostrarPlantilla (){
        System.out.println("--------------------------------");
        System.out.println("PLANTILLA DE LA EMPRESA: ");
        for (int i=0;i<numeroEmpleados;i++){
            System.out.println(lista[i]);
        }
        System.out.println("La plantilla tiene un total de empleados: "+numeroEmpleados);
    }

    public void mostrarDni (Nif nif){
        for (int i=0;i<numeroEmpleados;i++){
            if (lista[i].mismoNif(nif)){
                System.out.println(lista[i]);
            }
        }
    }

    public int masSueldoQue (int sueldo){
        int contador= 0;
        for (int i=0; i<numeroEmpleados;i++){
            if (lista[i].ganaMasDe(sueldo)){
                contador++;
            }
        }
        return contador;
    }

    public void ordenarSueldo(){
        Empleado aux;
        for (int j=0;j<lista.length;j++){
            for (int i=0;i<numeroEmpleados-1;i++){
                if (lista[i].esMayorSueldo(lista[i+1])){
                    aux= lista[i];
                    lista[i]= lista[i+1];
                    lista[i+1]= aux;
                }
            }
        }

        System.out.println("ORDENADO POR SUELDO DE MENOR A MAYOR: ");
        mostrarPlantilla();
    }

    public void mediaPlantilla (){
        int sumador= 0;
        for (int i=0;i<numeroEmpleados;i++){
            sumador= sumador + lista[i].getEdad();
        }
        System.out.println(sumador/numeroEmpleados);
    }

    public void addHorasExtras (Nif nif, int horaExtra){
        for (int i=0;i<numeroEmpleados;i++){
            if (lista[i].mismoNif(nif)){
                lista[i].addHoras(horaExtra);
            }
        }
    }

    public void empleadosPorEdad (){
        int rango;
        int contador1=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;

        for (int i=0;i<numeroEmpleados;i++){
            rango= lista[i].rango();
            switch (rango){
                case 1: contador1++;
                break;
                case 2: contador2++;
                break;
                case 3: contador3++;
                break;
                case 4: contador4++;
                break;
            }
        }
        System.out.println(contador1);
        System.out.println(contador2);
        System.out.println(contador3);
        System.out.println(contador4);
    }

    public int porcientoHorasExtras (){
        int contador= 0;
        for (int i=0;i<numeroEmpleados;i++){
            if (lista[i].tieneExtra()){
                contador++;
            }
        }
        return (contador*100)/numeroEmpleados;
    }
}
