package com.company;

import com.company.contenido.ComparadorNombre;
import com.company.contenido.Contenido;
import com.company.contenido.pelicula.Genero;
import com.company.contenido.pelicula.Pelicula;
import com.company.excepciones.NoValidEmailException;

import java.util.*;

public class Gestor {

    private Map<String, ArrayList<Contenido>> mapaTitulo;
    private Map<Genero, ArrayList<Pelicula>> mapaGenero;
    private Set<Contenido> listaContenido;
    private Map<String, Usuario> mapaMail;
    private Map<String, ArrayList<Usuario>> mapaSuscripcion;

    public Gestor(){
        this.mapaTitulo = new HashMap<>();
        this.mapaGenero=new HashMap<>();
        this.listaContenido= new HashSet<>();
        this.mapaMail= new HashMap<>();
        this.mapaSuscripcion= new HashMap<>();
    }

    public void addConetenido(Contenido contenido){
        //si es una PELICULA
        if (contenido.esPelicula()){
            Pelicula pelicula= (Pelicula) contenido;
            ArrayList<Pelicula> listaPelicula= mapaGenero.get(pelicula.getGenero());
            if (listaPelicula==null){
                listaPelicula= new ArrayList<>();
                listaPelicula.add(pelicula);
                mapaGenero.put(pelicula.getGenero(), listaPelicula);
            }else{
                listaPelicula.add(pelicula);
                mapaGenero.put(pelicula.getGenero(), listaPelicula);
            }
        }

        //añadimos al mapa de contenidos normal
        ArrayList<Contenido> listaContenidoAux= mapaTitulo.get(contenido.getTitulo());
        if (listaContenidoAux== null){
            listaContenidoAux= new ArrayList<>();
            listaContenidoAux.add(contenido);
            mapaTitulo.put(contenido.getTitulo(), listaContenidoAux);
            listaContenido.add(contenido);
        }else {
            listaContenidoAux.add(contenido);
            mapaTitulo.put(contenido.getTitulo(), listaContenidoAux);
            listaContenido.add(contenido);
        }
    }

    public void mostrarGenero(Genero genero){
        System.out.println(mapaGenero.get(genero));
    }

    public void mostrarOrdenadoContenido(){
        ArrayList<Contenido> listado= new ArrayList<>();
        for (Map.Entry<String, ArrayList<Contenido>> valor : mapaTitulo.entrySet()){
            listado.addAll(valor.getValue());
        }

        Collections.sort(listado, new ComparadorNombre());
        System.out.println(listado);
    }

    public void addUsuario(Usuario usuario)throws NoValidEmailException{
        if (usuario.esUserValido()){
            mapaMail.put(usuario.getMail(), usuario);

            ArrayList<Usuario> lista= mapaSuscripcion.get(usuario.getSuscripcion().getTipo());
            if (lista==null){
                lista= new ArrayList<>();
                lista.add(usuario);
                mapaSuscripcion.put(usuario.getSuscripcion().getTipo(), lista);
            }else {
                lista.add(usuario);
                mapaSuscripcion.put(usuario.getSuscripcion().getTipo(),lista);
            }


        }else {
            throw new NoValidEmailException();
        }
    }

    public void deleteUser(String mail){
        mapaMail.remove(mail);
    }

    public void mostrarSuscripcion(Suscripcion suscripcion){
        System.out.println(mapaSuscripcion.get(suscripcion.getTipo()));
    }

    public void mostrarGanancias(){
        int contador= 0;
        for (Map.Entry<String, Usuario> valor : mapaMail.entrySet()){
            contador= contador+ valor.getValue().getSuscripcion().getPrecio();
        }
        System.out.println("valor recaudado ----> "+contador);
    }

    public void mostrarUsuario(String mail){
        Usuario usuario= mapaMail.get(mail);
        for (Contenido contenido: usuario.getConteidoVisto()){
            System.out.println(contenido);
        }
    }
}
