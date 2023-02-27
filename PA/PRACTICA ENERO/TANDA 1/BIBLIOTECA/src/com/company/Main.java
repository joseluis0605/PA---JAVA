package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Autor autor1= new Autor("autor1", "1", new Fecha(1,1,2020));
        Autor autor2= new Autor("autor2", "2", new Fecha(1,2,2018));
        Autor autor3= new Autor("autor3", "3", new Fecha(1,4,2015));
        Autor autor4= new Autor("autor4", "4", new Fecha(1,11,2010));
        Autor autor5= new Autor("autor5", "5", new Fecha(1,8,2022));
        Autor autor6= new Autor("autor6", "6", new Fecha(1,12,2020));

        Libro libro1= new Libro("libro1", 20);
        Libro libro2 = new Libro("libro2", 35);
        Libro libro3= new Libro("libro3", 10);

        libro1.addAutor(autor1);
        libro1.addAutor(autor2);
        libro1.addAutor(autor3);
        libro1.addAutor(autor4);
        libro2.addAutor(autor4);
        libro2.addAutor(autor5);
        libro2.addAutor(autor6);

        Gestor gestor= new Gestor();
        gestor.addLibro(libro1);
        gestor.addLibro(libro2);
        gestor.addLibro(libro3);

        try{
            gestor.busquedaTitulo("23");
        }catch (NoExisteLibroException e){
            System.out.println("no existe");
        }

    }
}
