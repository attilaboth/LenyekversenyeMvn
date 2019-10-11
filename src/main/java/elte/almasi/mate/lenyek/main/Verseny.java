package elte.almasi.mate.lenyek.main;

import elte.almasi.mate.lenyek.model.Homokjaro;
import elte.almasi.mate.lenyek.model.Leny;
import elte.almasi.mate.lenyek.model.Szivacs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Verseny {

    public static void main(String[] args) {
        System.out.println("Verseny kezdodik");

        //1. file beolvasása

        //2. objektumok inicializálása
        List<Leny> lenyek = new ArrayList<>();

        /*
        Leny homokjaro = new Homokjaro("Vandor", 4);
        lenyek.add(homokjaro);
*/
        Leny szivacs = new Szivacs("Csuszo", 10);
        lenyek.add(szivacs);


        //3. verseny futtatása

        //String napok = "nffeeennf";
        String napok = "nnn";


        for (int i=0; i<napok.length(); i++){
            String nap = String.valueOf(napok.charAt(i));
            System.out.println(nap);

            for (Leny leny : lenyek) {
                leny.drink(nap);
                if(leny.isAlive()){
                    leny.move(nap);
                    System.out.println("Viz: " + leny.getVizMennyiseg() + " tav: " + leny.getMegtettTavolsag());
                } else {
                    System.out.println("*** halott leny: " + leny);

                }
                // System.out.println(leny);
            }
        }

        lenyek.forEach(System.out::println);

    }
}
