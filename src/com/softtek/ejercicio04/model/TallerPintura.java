package com.softtek.ejercicio04.model;

public class TallerPintura implements iTaller {
    public TallerPintura() {
    }

    @Override
    public String reparar(Coche04 coche) {
        return "Reparando la carroceria del " + coche.getModelo() + " con matrícula " + coche.getMatricula() + ".";
    }
}
