package com.company;

public abstract class User {

    private String nombreUsuario;
    private String contrasena;

    public User(String nombreUsuario, String contrasena){
        this.nombreUsuario= nombreUsuario;
        this.contrasena= contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    protected String getContrasena() {
        return contrasena;
    }

    protected abstract boolean esAcordeNivel();


    public String toString(){
        return "nombre: "+nombreUsuario;
    }

}
