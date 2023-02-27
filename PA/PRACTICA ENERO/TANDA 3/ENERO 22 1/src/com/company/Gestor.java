package com.company;

import com.company.coche.Coche;
import com.company.exceptions.CocheRegistrado;
import com.company.exceptions.UsuarioNoExiste;
import com.company.exceptions.UsuarioRegistrado;
import com.company.usuario.Usuario;

import java.util.*;

public class Gestor {

    private Set<Usuario> listaUsuario;
    private Map<String, Usuario> mapaDni; //mapa clave dni
    private Set<Coche> listaCoche;
    private Map<Usuario, Map<String, Coche>> mapaUsuarioCoche;

    public Gestor(){
        this.listaUsuario= new HashSet<>();
        this.mapaDni= new HashMap<>();
        this.listaCoche= new HashSet<>();
        this.mapaUsuarioCoche= new HashMap<>();
    }

    public void addUsuario(Usuario usuario)throws UsuarioRegistrado{
        Usuario aux= mapaDni.get(usuario.getDni());
        if (aux==null){
            listaUsuario.add(usuario);
            mapaDni.put(usuario.getDni(), usuario);
        }else {
            throw new UsuarioRegistrado();
        }
    }

    public void addCoche(Coche coche, Usuario usuario)throws UsuarioNoExiste, CocheRegistrado{
        Usuario aux= mapaDni.get(usuario.getDni());//comprobamos que existe
        if (aux!=null){//existe el usuario
            if (!listaCoche.contains(coche)){//si no esta registrado el coche
                listaCoche.add(coche);
                Map<String, Coche> mapaMatricula= mapaUsuarioCoche.get(usuario);
                if (mapaMatricula==null){
                    mapaMatricula= new HashMap<>();
                    mapaMatricula.put(coche.getMatricula(), coche);
                }else {
                    mapaMatricula.put(coche.getMatricula(),  coche);
                }
                mapaUsuarioCoche.put(usuario, mapaMatricula);
            }else{
                throw  new CocheRegistrado();
            }
        }else {
            throw new UsuarioNoExiste();
        }
    }

    public void mostrarUsuario(Usuario usuario){
        System.out.println(mapaUsuarioCoche.get(usuario));
    }

    public void mostrarInfoCoche(Coche coche){
        for (Map.Entry<Usuario, Map<String, Coche>> valor : mapaUsuarioCoche.entrySet()){
            Map<String, Coche> mapaAux= valor.getValue();
            boolean contenido= false;
            Coche coche1= mapaAux.get(coche.getMatricula());
            if (coche1!=null){
                System.out.println(valor.getKey()+" "+coche1);
            }
        }
    }

    public void mostrarTodaInfo(){
        for (Map.Entry<Usuario, Map<String, Coche>> valor : mapaUsuarioCoche.entrySet()){
            System.out.println("con clave ---> "+valor.getKey());
            for (Map.Entry<String, Coche> valorCoche: valor.getValue().entrySet()){
                System.out.println("coche---> "+valorCoche.getValue());
            }
        }
    }

    public void mostrarUsuarios(){
        System.out.println(listaUsuario);
    }

    public void mostrarCoches(){
        System.out.println(listaCoche);
    }

}
