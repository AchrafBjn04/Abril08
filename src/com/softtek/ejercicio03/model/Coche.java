package com.softtek.ejercicio03.model;

public class Coche implements iVehiculo {
    private int deposito;

    public Coche() {
    }

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String moverse() {
        if(deposito>0){
            return "En movimiento...";
        }
        return "No hay suficiente gasolina.";
    }
}
