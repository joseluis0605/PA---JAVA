package com.company;

public class Libro {

    private String titulo;
    private Persona autor[];
    private int numeroAutores;
    private long isbn;
    private int paginas;
    private String editorial;
    private Fecha fechaEdicion;

    public Libro(String titulo, long isbn, int paginas, String editorial, Fecha fechaEdicion, int maximoAutores){
        this.titulo= titulo;
        this.isbn= isbn;
        this.paginas= paginas;
        this.editorial= editorial;
        this.fechaEdicion= fechaEdicion;
        this.numeroAutores=0;
        this.autor= new Persona[maximoAutores];
    }

    public void addAutor(Persona persona){
        if (numeroAutores < autor.length){
            autor[numeroAutores]= persona;
            numeroAutores++;
        }
    }

    public String toString(){
        String  cadena= "";
        for (int i=0;i<numeroAutores;i++){
            cadena= cadena+ autor[i]+ " ";
        }
        return "Titulo: "+titulo+" isbn: "+isbn+" autor: "+cadena+" fecha: "+fechaEdicion;
    }

    public boolean tieneAutor(Persona persona) {
        for (int i=0;i<numeroAutores;i++){
            if (autor[i].mismaPersona(persona)){
                return true;
            }
        }
        return false;
    }


    public int comparador(Libro libro) {
        return this.titulo.compareTo(libro.titulo);
    }

    public boolean esMismoEditorial(String editorial) {
        return this.editorial.equals(editorial);
    }

    public boolean esMismoAnyo(int year) {
        return fechaEdicion.esMismo(year);
    }
}
