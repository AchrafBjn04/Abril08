package com.softtek.ejercicio05.presentacion;

import com.softtek.ejercicio05.model.*;

public class Ejercicio05 {
    public static void main(String[] args) {
        Informe informe1 = new InformeTrimestre1();
        Informe informe2 = new InformeTrimestre2();
        Empleado jefe = new Jefe(informe2);
        Empleado director = new Director(informe2);
        Empleado secretario = new Secretario(informe1, "Softtek", "secretario@softtek.com");

        System.out.println(jefe.getTareas());
        System.out.println(jefe.getInforme());
        System.out.println(director.getTareas());
        System.out.println(director.getInforme());
        System.out.println(secretario.getTareas());
        System.out.println(secretario.getInforme());
        ((Secretario) secretario).setInforme(informe2);
        System.out.println(secretario.getInforme());
    }
}
