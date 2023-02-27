package com.company;

import com.company.usuarios.CommonUser;
import com.company.usuarios.SecuredUser;
import com.company.usuarios.SuperSecuredUser;

public class Main {

    public static void main(String[] args) {


        Listado listado= new Listado(10);

        CommonUser user1= new CommonUser("use1", "user");
        SecuredUser user2= new SecuredUser("user2", "user2");
        SuperSecuredUser use3= new SuperSecuredUser("user3", "user3.");


        listado.addUsuario(user1, "comon");
        listado.addUsuario(user2, "secured");
        listado.addUsuario(use3, "super");

        listado.mostrar();
    }
}
