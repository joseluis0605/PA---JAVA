package com.company;

public class Main {

    public static void main(String[] args) {

        Libro libro1= new Libro("titulo1", 1, 100, "editorial1", new Fecha(1,"enero", 2022), 5);

        libro1.addAutor(new Persona("Pedro"));
        libro1.addAutor(new Persona("Luis"));
        libro1.addAutor(new Persona("Antonio"));
        libro1.addAutor(new Persona("Mario"));

        Libro libro2= new Libro("titulo2", 2, 250, "editorial1", new Fecha(1,"marzo", 2022), 5);

        libro1.addAutor(new Persona("Antonio"));
        libro2.addAutor(new Persona("Luis"));


        Catalogo catalogo1= new Catalogo(10);

        catalogo1.addLibro(libro1);
        catalogo1.addLibro(libro2);

        //catalogo1.mostrar();

        //catalogo1.mostrarPorAutor(new Persona("Mario"));

        //catalogo1.ordenarCatalogo();

        //catalogo1.mostrarPorEditorial("editorial");

        //catalogo1.mostrarAnyo(2022);
    }
}
