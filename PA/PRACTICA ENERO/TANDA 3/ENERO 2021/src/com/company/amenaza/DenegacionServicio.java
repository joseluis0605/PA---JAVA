package com.company.amenaza;

import java.util.HashSet;
import java.util.IllegalFormatCodePointException;
import java.util.Set;

public class DenegacionServicio extends Amenaza{

    private String servidor;
    private int puerto;
    private Set<String> listaIP;

    public DenegacionServicio(int id, String servidor, int puerto){
        super(id);
        this.servidor= servidor;
        this.puerto= puerto;
        this.listaIP= new HashSet<>();
        setUrgencia(Urgencia.ALTA);
    }

    public void addIp(String ip){
        listaIP.add(ip);
        if (listaIP.size()<3){
            setDificultad(Dificultad.BAJA);
        }else if (listaIP.size()<5){
            setDificultad(Dificultad.MEDIA);
        }else {
            setDificultad(Dificultad.ALTA);
        }
    }
}
/*
Denegación de servicio. Cuando un servidor se cae porque se hacen muchas peticiones desde
diferentes máquinas y el servidor no puede atenderlas todas. En este caso interesa conocer qué
servidor ha sido afectado (String), en qué puerto se están realizando las peticiones (int) y quienes
han causado la denegación de servicio, es decir, desde qué IPs se está intentando colapsar el
servidor. Para representar una IP también es válido el tipo String.
 */