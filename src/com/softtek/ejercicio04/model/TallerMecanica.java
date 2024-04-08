package com.softtek.ejercicio04.model;

public class TallerMecanica implements iTaller {

    public TallerMecanica() {
    }

    @Override
    public String reparar(Coche04 coche) {
        return "Reparando la mecánica del " + coche.getModelo() + " con matrícula " + coche.getMatricula() + ".";
    }
}
