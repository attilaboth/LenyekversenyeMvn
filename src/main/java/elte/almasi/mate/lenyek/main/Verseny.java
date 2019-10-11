package elte.almasi.mate.lenyek.main;

import elte.almasi.mate.lenyek.model.Homokjaro;
import elte.almasi.mate.lenyek.model.Leny;
import elte.almasi.mate.lenyek.model.Szivacs;

import java.util.ArrayList;
import java.util.List;

public class Verseny {

    public static void main(String[] args) {
        System.out.println("Verseny kezdodik");

        //1. file beolvasása

        //2. objektumok inicializálása
        List<Leny> lenyek = new ArrayList<>();

        Leny homokjaro = new Homokjaro("Vandor", 4);
        lenyek.add(homokjaro);

        Leny szivacs = new Szivacs("Csuszo", 12);
        lenyek.add(szivacs);


        //3. verseny futtatása
        for (Leny leny : lenyek) {
            leny.drink();
            if(leny.isAlive()){
                leny.move();
            }else{
                lenyek.remove(leny);
            }
            System.out.println(leny);
        }

    }
}
