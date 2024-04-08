package com.softtek.ejercicio04.model;

public class SeguroCoche {
    private iTaller taller;
    private String aseguradora;

    public SeguroCoche() {
    }

    public SeguroCoche(iTaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public String reparar(Coche04 c){
        return taller.reparar(c) + " [" + aseguradora + "]";
    }
}
