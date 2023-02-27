package com.company;

public abstract class Billete {

    //Por cada billete se mostrará el tipo de emisión
    //(“Emisión electrónica” o “Emisión normal”); la clase (“Clase Turista” o “Clase
    //Business”); la referencia del billete; el origen y destino del vuelo; la duración; el
    //precio y la fecha del vuelo.

    private String tipoEmision;
    private Fecha fecha;
    private int precio;
    private String origen;
    private String clase;
    private int id;

    public Billete(String tipo, Fecha fecha, String origen, int id){
        this.tipoEmision= tipo;
        this.fecha= fecha;
        this.origen= origen;
        this.id=id;
    }

    protected abstract void cambioPrecio();

    protected boolean esElectronico(){
        return this.tipoEmision.equals("electronico");
    }

    public abstract String tipo();

    public String toString(){
        String destino;
        if (origen.equals("madrid")){
            destino="cophenage";
        }else {
            destino= "madrid";
        }
        return "Emision: "+tipoEmision+" tipo clase: "+clase+" id: "+id+" origen: "+origen+" destino: "+destino+" duracion: 2'30h"+" precio: "+precio+" "+fecha;
    }

    //getter and setter
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipoEmision() {
        return tipoEmision;
    }
    public void setTipoEmision(String tipoEmision) {
        this.tipoEmision = tipoEmision;
    }

    protected Fecha getFecha() {
        return fecha;
    }
    private void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }


    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
