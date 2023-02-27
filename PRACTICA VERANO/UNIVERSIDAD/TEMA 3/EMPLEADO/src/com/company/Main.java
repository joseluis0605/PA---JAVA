package com.company;

public class Main {

    public static void main(String[] args) {

        Plantilla plantilla= new Plantilla(10);

        Empleado empleado1= new Empleado("pedro", "martinez", new Nif(100001, "R"), 18, 2500);
        Empleado empleado2= new Empleado("luis", "perez", new Nif(100002, "S"), 65, 3500);
        Empleado empleado3= new Empleado("pedro", "medina", new Nif(100003, "P"), 90, 2500);
        Empleado empleado4= new Empleado("maria", "martinez", new Nif(100004, "T"), 18, 2100);
        Empleado empleado5= new Empleado("jose", "garcia", new Nif(100005, "R"), 23, 5000);
        Empleado empleado6= new Empleado("marcos", "sanchez", new Nif(100006, "B"), 54, 2500);
        Empleado empleado7= new Empleado("javier", "perez", new Nif(100007, "R"), 48, 750);

        plantilla.addEmpleado(empleado1);
        plantilla.addEmpleado(empleado2);
        plantilla.addEmpleado(empleado3);
        plantilla.addEmpleado(empleado4);
        plantilla.addEmpleado(empleado5);
        plantilla.addEmpleado(empleado6);
        plantilla.addEmpleado(empleado7);

        plantilla.mostrarPlantilla();

        plantilla.mostrarDni(new Nif(100002, "S"));

        plantilla.ordenarSueldo();

        System.out.println(plantilla.masSueldoQue(4000));

        plantilla.mediaPlantilla();

        plantilla.empleadosPorEdad();


    }
}
