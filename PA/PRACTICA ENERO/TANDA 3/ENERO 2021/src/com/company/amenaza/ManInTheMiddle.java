package com.company.amenaza;

import java.util.ArrayList;

public class ManInTheMiddle extends Amenaza{

    private String remitente;
    private String destinatario;
    private String suplantador;
    private ArrayList<String> conversacion;

    public ManInTheMiddle(int id, String remitente, String destinatario, String suplantador){
        super(id);
        this.remitente= remitente;
        this.destinatario= destinatario;
        this.suplantador= suplantador;
        this.conversacion= new ArrayList<>();
        setDificultad(Dificultad.MEDIA);
    }

    public void addMensaje(String mensaje){
        conversacion.add(mensaje);
        if (conversacion.size()<10){
            setUrgencia(Urgencia.MEDIA);
        }else {
            setUrgencia(Urgencia.ALTA);
        }
    }



}
/*
Man in the middle. En esta amenaza alguien suplanta a otro en un intercambio de mensajes. Por
tanto, se deberá conocer quién es el remitente (String), el destinatario (String), el suplantador
(String), y los mensajes intercambiados (un listado de String). Aquí la urgencia de la amenaza
varía en función del número de mensajes intercambiados, más de 10 será ALTA y la dificultad es
MEDIA.
 */