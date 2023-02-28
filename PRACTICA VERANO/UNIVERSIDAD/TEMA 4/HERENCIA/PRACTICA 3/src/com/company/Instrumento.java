package com.company;

public abstract class Instrumento {

    private String tipo;
    private String nombreInstrumento;
    private String marca;
    private int precioVenta;
    private String estaRebajado;
    private int precioRebajado;
    private int precioFabrica;

    public Instrumento(String tipo, String nombreInstrumento, String marca, int precioFabrica){
        this.tipo= tipo;
        this.nombreInstrumento= nombreInstrumento;
        this.marca= marca;
        this.precioFabrica= precioFabrica;
        this.estaRebajado= "NO";
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreInstrumento() {
        return nombreInstrumento;
    }
    public void setNombreInstrumento(String nombreInstrumento) {
        this.nombreInstrumento = nombreInstrumento;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getEstaRebajado() {
        return estaRebajado;
    }
    public void setEstaRebajado(String estaRebajado) {
        this.estaRebajado = estaRebajado;
    }

    public int getPrecioRebajado() {
        return precioRebajado;
    }
    public void setPrecioRebajado(int precioRebajado) {
        this.precioRebajado = precioRebajado;
    }

    protected int getPrecioFabrica() {
        return precioFabrica;
    }
    protected void setPrecioFabrica(int precioFabrica) {
        this.precioFabrica = precioFabrica;
    }

    public abstract void precioFinal();

    public String toString(){
        String cadena= "Instrumento de: "+this.tipo+"\n"+"Nombre: "+nombreInstrumento+"\n"+"Precio: "+precioVenta;
        if (this.estaRebajado.equals("SI")){
            cadena= cadena + "Rebajado: "+precioRebajado;
        }
        return cadena;
    }

    public void rebajarPrecio(Instrumento instrumento, int porcentajeDescuento){
        int valor= precioVenta*porcentajeDescuento/100;
        valor= getPrecioVenta() - valor;
        setPrecioRebajado(valor);
        setEstaRebajado("SI");

    }

    public boolean encontrado(Instrumento instrumento) {
        return this.marca.equals(instrumento.marca) && this.nombreInstrumento.equals(instrumento.nombreInstrumento);
    }
}
