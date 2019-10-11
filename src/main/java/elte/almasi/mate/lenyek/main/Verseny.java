package elte.almasi.mate.lenyek.main;

import elte.almasi.mate.lenyek.model.Homokjaro;
import elte.almasi.mate.lenyek.model.Leny;
import elte.almasi.mate.lenyek.model.Szivacs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

        Leny szivacs2 = new Szivacs("Csuszo2", 4);
        lenyek.add(szivacs2);


        //3. verseny futtatása

        String napok = "nffeeennf";


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

        Collections.sort(lenyek);
        lenyek.forEach(System.out::println);

        if(!lenyek.isEmpty()){
            System.out.println(lenyek.get(0).getNev());
        }else{
            System.out.println("Minden lény elpusztult.");
        }
    }
}
