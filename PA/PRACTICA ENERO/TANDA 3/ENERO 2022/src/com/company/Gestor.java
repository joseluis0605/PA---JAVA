package com.company;

import com.company.exceptions.CocheExiste;
import com.company.exceptions.UserRegistrado;
import com.company.exceptions.UsuarioNoExiste;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Gestor {

    private Set<Usuario> listaUsers;
    private Map<String, Usuario> mapaDniUsuario;
    private Map<Usuario, Map<String, Vehiculo>> mapaUsuarioMapaMatricula;
    private Map<String, Vehiculo> mapaVehiculosTodos;

    public Gestor(){
        this.listaUsers= new HashSet<>();
        this.mapaDniUsuario= new HashMap<>();
        this.mapaUsuarioMapaMatricula= new HashMap<>();
        this.mapaVehiculosTodos= new HashMap<>();
    }

    public void addUserLista(String dni) throws  UserRegistrado{
        Usuario usuario= new Usuario(dni);
        if (listaUsers.contains(usuario)){
            throw new UserRegistrado();
        }else {
            listaUsers.add(usuario);
            mapaDniUsuario.put(dni, usuario);
            Map<String, Vehiculo> mapaAux= new HashMap<>();
            mapaUsuarioMapaMatricula.put(usuario, mapaAux);
        }
    }

    public void addUserMapa(String dni)throws UserRegistrado{
        Usuario usuario= mapaDniUsuario.get(dni);
        if (usuario==null){
            usuario= new Usuario(dni);
            mapaDniUsuario.put(dni, usuario);
            listaUsers.add(usuario);
            Map<String, Vehiculo>mapaAux= new HashMap<>();
            mapaUsuarioMapaMatricula.put(usuario, mapaAux);
        }else {
            throw new UserRegistrado();
        }
    }

    public void mostrarUsuariosLista(){
        for (Usuario usuario : listaUsers){
            System.out.println(usuario);
        }
    }

    public void mostrarUsuarioMapa(){
        for (Map.Entry<String, Usuario> valor : mapaDniUsuario.entrySet()){
            System.out.println(valor.getValue());
        }
    }

    public void mostrarDni(){
        System.out.println(mapaDniUsuario.keySet());
    }

    public void addVehiculoUsuario(Vehiculo vehiculo, String dni)throws UsuarioNoExiste, CocheExiste{
        //comprobamos que existe el usuario
        Usuario usuario= mapaDniUsuario.get(dni);
        if (usuario==null){
            throw new UsuarioNoExiste();
        }else {
            //usuario existe
            Vehiculo vehiculo1= mapaVehiculosTodos.get(vehiculo.getMatricula());
            if (vehiculo1==null){
                //no esta registrado
                mapaVehiculosTodos.put(vehiculo.getMatricula(), vehiculo);

                Map<String, Vehiculo> mapaAux= mapaUsuarioMapaMatricula.get(usuario);
                if (mapaAux==null){
                    mapaAux= new HashMap<>();
                    mapaAux.put(vehiculo.getMatricula(), vehiculo);
                    mapaUsuarioMapaMatricula.put(usuario, mapaAux);
                }else {
                    mapaUsuarioMapaMatricula.put(usuario, mapaAux);
                }
            }else {
                throw new CocheExiste();
            }
        }
    }

}
