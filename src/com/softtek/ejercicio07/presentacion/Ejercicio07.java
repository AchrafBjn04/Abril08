package com.softtek.ejercicio07.presentacion;

import com.softtek.ejercicio07.model.Producto;
import com.softtek.ejercicio07.model.ProductoException;

public class Ejercicio07 {
    public static void main(String[] args) {
        Producto p1 = new Producto(10, "Product1", 20, "Proveedor1", "Primer producto");
        Producto p2 = new Producto(0, "Product2", 15, "Proveedor2", "Segundo producto");

        try {
            System.out.println(p1.comprobar());
            System.out.println(p2.comprobar());
        } catch (ProductoException e) {
            e.printStackTrace();
        }
    }
}
