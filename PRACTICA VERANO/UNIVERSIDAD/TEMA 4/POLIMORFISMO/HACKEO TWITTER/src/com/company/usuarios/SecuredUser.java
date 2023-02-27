package com.company.usuarios;

import com.company.User;

public class SecuredUser extends User {
    public SecuredUser(String nombreUsuario, String contrasena) {
        super(nombreUsuario, contrasena);
    }

    @Override
    protected boolean esAcordeNivel() {
        boolean tieneLetra=false;
        boolean tieneNumero=false;
        String password= getContrasena();
        for (int i=0;i<getContrasena().length();i++){
            char caracter= password.charAt(i);
            if (caracter <= 122 && caracter >= 97) {
                tieneLetra = true;
            }
        }

        for (int i=0;i<password.length();i++){
            char caracter= password.charAt(i);
            if (caracter<=57 && caracter>=49){
                tieneNumero= true;
            }
        }

        return tieneLetra && tieneNumero;

    }

    public String toString(){
        return super.toString()+" tengo seguridad";
    }
}
