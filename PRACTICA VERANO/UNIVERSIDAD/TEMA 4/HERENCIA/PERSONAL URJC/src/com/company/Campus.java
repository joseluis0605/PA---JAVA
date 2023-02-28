package com.company;

public enum Campus {

    //Alcorcón, Aranjuez, Fuenlabrada, Madrid
    //(Quintana), Madrid (Vicálvaro) y Móstoles.
    ALCORCON("alcorcon"), ARANJUEZ("aranjuez"), FUENLABRADA("fuenlabrada"), MADRID("madrid"), VICALCARO("vicalcaro"), MOSTOLES("mostoles");

    private String ciudad;

    Campus(String ciudad){
        this.ciudad= ciudad;
    }

    public String toString(){
        return "Ciudad: "+this.ciudad;
    }


}
