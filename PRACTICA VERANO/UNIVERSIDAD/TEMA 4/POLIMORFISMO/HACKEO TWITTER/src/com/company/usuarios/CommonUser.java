package com.company.usuarios;

import com.company.User;

public class CommonUser extends User {
    public CommonUser(String nombreUsuario, String contrasena) {
        super(nombreUsuario, contrasena);
    }

    @Override
    protected boolean esAcordeNivel() {
        return true;
    }

    public String toString(){
        return super.toString()+" no tengo nivel de seguridad";
    }
}
