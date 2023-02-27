package com.company;

import java.util.Calendar;

public class Fecha {

    private Calendar date;

    public Fecha(int dia, int mes, int año) {
        this.date = Calendar.getInstance();
        date.set(año, mes, dia);
    }

    public boolean after(Fecha f) {
        return this.date.after(f.date);
    }

    @Override
    public String toString() {
        return this.date.get(Calendar.DAY_OF_MONTH) + "/" +
                this.date.get(Calendar.MONTH) + "/" + this.date.get(Calendar.YEAR);
    }

    public boolean esDespuesA(Fecha fecha) {
        return this.date.after(fecha.date);
    }
}
