package com.company;

public class NumerosPescaderia {
    private int numeroMaximo;
    private int vez = 0;

    public NumerosPescaderia(int numeroMaximo) {
        this.numeroMaximo = numeroMaximo;
    }

    public int getNumero() throws NoMoreNumbersException {
        this.vez++;
        if(this.vez >= this.numeroMaximo){
            throw new NoMoreNumbersException(this.numeroMaximo);
        }

        return this.vez;
    }
}
