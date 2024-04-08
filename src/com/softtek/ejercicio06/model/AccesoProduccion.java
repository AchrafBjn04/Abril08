package com.softtek.ejercicio06.model;

public class AccesoProduccion implements iDAO {
    @Override
    public String insertar(Cliente c1) {
        return "Cliente: [Nombre: " + c1.getNombre() + " - NIF: " + c1.getNIF() + "] insertado en AccesoProduccion con éxito.";
    }

    public AccesoProduccion() {
    }
}
