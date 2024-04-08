package com.softtek.ejercicio04.model;

public class Coche04 {
    private String matricula;
    private String modelo;

    public Coche04() {
    }

    public Coche04(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
