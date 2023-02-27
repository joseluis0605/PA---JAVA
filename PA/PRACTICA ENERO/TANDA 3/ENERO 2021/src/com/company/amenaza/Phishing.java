package com.company.amenaza;

import javax.net.ssl.SSLContext;
import java.util.HashSet;
import java.util.Set;

public class Phishing extends Amenaza{

    private String mensaje;
    private Set<String> listadoUsuarios;
    private String informacionFiltrada;

    public Phishing(int id, String mensaje, String informacionFiltrada){
        super(id);
        this.mensaje= mensaje;
        this.informacionFiltrada= informacionFiltrada;
        this.listadoUsuarios= new HashSet<>();
        setDificultad(Dificultad.BAJA);
    }

    public void addUsuario(String usuario){
        listadoUsuarios.add(usuario);
        if (listadoUsuarios.size()>2){
            setUrgencia(Urgencia.ALTA);
        }
    }
}

/*
Phishing. En esta amenaza se quiere conocer el mensaje recibido (String), el listado de usuarios
afectados (un listado de String) y la información filtrada (String). La dificultad de solucionar
esta amenaza es BAJA y la urgencia depende del número de usuarios afectados, si es 1 o 2 es
urgencia MEDIA, pero más de 2 es urgencia ALTA.
 */
