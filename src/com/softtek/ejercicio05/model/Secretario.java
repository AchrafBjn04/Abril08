package com.softtek.ejercicio05.model;

public class Secretario implements Empleado {
    private Informe informe;
    private String empresa;
    private String email;

    public Secretario() {
    }

    public Secretario(Informe informe, String empresa, String email) {
        this.informe = informe;
        this.empresa = empresa;
        this.email = email;
    }

    @Override
    public String getTareas() {
        return "El secretario ha obtenido las tareas.";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    public void setInforme(Informe informe){
        this.informe = informe;
    }
}
