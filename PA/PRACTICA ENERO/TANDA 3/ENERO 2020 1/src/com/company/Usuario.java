package com.company;

import com.company.contenido.Contenido;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {

    private String mail;
    private Suscripcion suscripcion;
    private ArrayList<Contenido> conteidoVisto;

    public Usuario(String mail, Suscripcion suscripcion){
        this.mail= mail;
        this.suscripcion= suscripcion;
        this.conteidoVisto= new ArrayList<>();
    }

    public boolean esUserValido(){
        return this.mail.contains("@");
    }

    public String getMail() {
        return mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(mail, usuario.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mail);
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public ArrayList<Contenido> getConteidoVisto() {
        return conteidoVisto;
    }
}
