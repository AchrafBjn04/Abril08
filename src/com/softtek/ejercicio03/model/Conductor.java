package com.softtek.ejercicio03.model;

public class Conductor {
    private iVehiculo vehiculo;

    public Conductor() {
    }

    public Conductor(iVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String conducir(){
        return vehiculo.moverse();
    }
}
