package com.company;

import java.util.Objects;

public class Usuario {

    private String dni;

    public Usuario(String dni){
        this.dni= dni;
    }

    //SETTER GETTER EQUALS

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(dni, usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }


}
