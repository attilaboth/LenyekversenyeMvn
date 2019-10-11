package elte.almasi.mate.lenyek.main;

import elte.almasi.mate.lenyek.model.Homokjaro;
import elte.almasi.mate.lenyek.model.Leny;

import java.util.ArrayList;
import java.util.List;

public class Verseny {

    public static void main(String[] args) {
        System.out.println("Verseny kezdodik");

        //1. file beolvasása

        //2. objektumok inicializálása
        List<Leny> lenyek = new ArrayList<>();
        if("Vandor".equals("Vandor")){
            Homokjaro homokjaro = new Homokjaro("Vandor", 4);
            lenyek.add(homokjaro);
        }

        //3. verseny futtatása
        for (Leny leny : lenyek) {
            System.out.println(leny);
        }

    }
}
