package com.company.usuarios;

import com.company.User;

public class SuperSecuredUser extends User {
    public SuperSecuredUser(String nombreUsuario, String contrasena) {
        super(nombreUsuario, contrasena);
    }

    @Override
    protected boolean esAcordeNivel() {
        boolean tieneLetra=false;
        boolean tieneNumero=false;
        boolean tieneOtro= false;
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

        for (int i=0;i<password.length();i++){
            char caracter= password.charAt(i);
            if (caracter <= 47 || 58 <= caracter && caracter <= 96 || caracter >= 123){
                tieneOtro= true;
            }
        }

        return tieneLetra && tieneNumero && tieneOtro;

    }

    public String toString(){
        return super.toString()+" tengo seguridad maxima";
    }
}

