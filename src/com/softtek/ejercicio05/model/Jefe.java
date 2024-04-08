package com.softtek.ejercicio05.model;

public class Jefe implements Empleado {
    private Informe informe;

    public Jefe() {
    }

    public Jefe(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "El jefe ha obtenido las tareas.";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
