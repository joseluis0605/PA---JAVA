package com.company;

import com.company.excepciones.UsuarioNoExiste;
import com.company.excepciones.UsuarioRegistrado;
import com.company.excepciones.VehiculoRegistrado;

import java.util.*;

public class Gestor {

    private Map<String, Usuario> mapaDNI;
    private Map<Usuario, Map<String, Vehiculo>> mapaUsuarioMapaVehiculo;
    private Map<String, Vehiculo> mapaMatricula;


    public Gestor(){
        this.mapaDNI= new HashMap<>();
        this.mapaMatricula=new HashMap<>();
        this.mapaUsuarioMapaVehiculo= new HashMap<>();
    }

    public void addUsuario(String dni) throws UsuarioRegistrado {
        Usuario usuarioAux= mapaDNI.get(dni);
        if (usuarioAux==null){
            //no existe
            usuarioAux= new Usuario(dni);
            mapaDNI.put(dni, usuarioAux);
        }else {
            throw new UsuarioRegistrado();
        }
    }

    public void addVehiculoAUsuario(Vehiculo vehiculo, String dni) throws UsuarioNoExiste, VehiculoRegistrado {
        //comprobar que el ciudadano existe
        Usuario usuarioAux= mapaDNI.get(dni);
        if (usuarioAux!=null){
            Vehiculo vehiculoAux= mapaMatricula.get(vehiculo.getMatricula());
            if (vehiculoAux==null){
                //añadir a la lista de vehiculos
                mapaMatricula.put(vehiculo.getMatricula(), vehiculo);

                //añadimos al gestor importante
                Usuario user= new Usuario(dni);
                Map<String,Vehiculo> mapaAux= mapaUsuarioMapaVehiculo.get(user);
                if (mapaAux==null){
                    mapaAux= new HashMap<>();
                    mapaAux.put(vehiculo.getMatricula(), vehiculo);
                    mapaUsuarioMapaVehiculo.put(user, mapaAux);
                }else {
                    mapaAux.put(vehiculo.getMatricula(), vehiculo);
                    mapaUsuarioMapaVehiculo.put(user, mapaAux);
                }
            }else {
                throw new VehiculoRegistrado();
            }
        }else {
            throw new UsuarioNoExiste();
        }
    }

    public void mostrarDni(String dni){
        Usuario usuario= new Usuario(dni);
        ArrayList<Vehiculo> listaVehiculo= new ArrayList<>();
        Map<String, Vehiculo> mapaAux= mapaUsuarioMapaVehiculo.get(usuario);
        for (Map.Entry<String, Vehiculo> valor : mapaAux.entrySet()){
            listaVehiculo.add(valor.getValue());
        }
        Collections.sort(listaVehiculo, new ComparadorMatricula());
        System.out.println(listaVehiculo);
    }

    public void mostrar(String dni, Vehiculo vehiculo){
        Usuario usuario= new Usuario(dni);
        System.out.println(mapaUsuarioMapaVehiculo.get(usuario).get(vehiculo.getMatricula()));

        Map<String, Vehiculo> mapa= mapaUsuarioMapaVehiculo.get(usuario);
        System.out.println(mapa.get(vehiculo.getMatricula()));
    }
}
