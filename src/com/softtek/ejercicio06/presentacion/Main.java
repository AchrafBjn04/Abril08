package com.softtek.ejercicio06.presentacion;

import com.softtek.ejercicio06.model.AccesoDesarrollo;
import com.softtek.ejercicio06.model.AccesoProduccion;
import com.softtek.ejercicio06.model.Cliente;
import com.softtek.ejercicio06.model.iDAO;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Achraf", "123456789P");
        Cliente c2 = new Cliente("Marcos", "987654321P");
        iDAO idao1 = new AccesoDesarrollo();
        iDAO idao2 = new AccesoProduccion();
        System.out.println(idao1.insertar(c1));
        System.out.println(idao2.insertar(c2));
    }
}
