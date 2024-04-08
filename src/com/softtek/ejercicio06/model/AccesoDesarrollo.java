package com.softtek.ejercicio06.model;

public class AccesoDesarrollo implements iDAO {
    @Override
    public String insertar(Cliente c1) {
        return "Cliente: [Nombre: " + c1.getNombre() + " - NIF: " + c1.getNIF() + "] insertado en AccesoDesarrollo con éxito.";
    }

    public AccesoDesarrollo() {
    }
}
