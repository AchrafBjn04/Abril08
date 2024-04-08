package com.softtek.ejercicio04.presentacion;

import com.softtek.ejercicio04.model.Coche04;
import com.softtek.ejercicio04.model.SeguroCoche;
import com.softtek.ejercicio04.model.TallerMecanica;
import com.softtek.ejercicio04.model.iTaller;

public class Ejercicio04 {
    public static void main(String[] args) {
        iTaller taller = new TallerMecanica();
        Coche04 c = new Coche04("0000-ABC", "Audi A7");
        SeguroCoche seguro = new SeguroCoche(taller, "Mapfre");
        System.out.println(seguro.reparar(c));
    }
}
