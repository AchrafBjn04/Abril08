package com.softtek.ejercicio03.presentacion;

import com.softtek.ejercicio03.model.Coche;
import com.softtek.ejercicio03.model.Conductor;
import com.softtek.ejercicio03.model.iVehiculo;

public class Ejercicio03 {
    public static void main(String[] args) {
        iVehiculo vehiculo = new Coche(10);
        Conductor conductor = new Conductor(vehiculo);
        System.out.println(conductor.conducir());
    }
}
