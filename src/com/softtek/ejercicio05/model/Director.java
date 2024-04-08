package com.softtek.ejercicio05.model;

public class Director implements Empleado {
    private Informe informe;

    public Director() {
    }

    public Director(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "El director ha obtenido las tareas.";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
