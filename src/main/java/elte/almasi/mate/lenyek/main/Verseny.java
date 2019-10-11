package elte.almasi.mate.lenyek.main;

import elte.almasi.mate.lenyek.model.Homokjaro;
import elte.almasi.mate.lenyek.model.Leny;
import elte.almasi.mate.lenyek.model.Lepegeto;
import elte.almasi.mate.lenyek.model.Szivacs;
import elte.almasi.mate.lenyek.utils.IOUtil;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Verseny {

    private static String rootPath = Paths.get("").toAbsolutePath().toString();
    private static List<String> fileTartalmaStringLista = null;
    private static List<Leny> lenyek = null;

    public static void main(String[] args) {

        lenyek = new ArrayList<Leny>();

        //0. Bekérni a File nevét


        //1. file beolvasása
        fileTartalmaStringLista = IOUtil.getFileContentAsList("C:\\Archive\\personal\\LenyekversenyeMvn\\src\\main\\resources\\input.txt");
        //fileTartalmaStringLista.forEach(System.out::println);

        //2. objektumok inicializálása
        int lenyekSzama = Integer.parseInt(fileTartalmaStringLista.get(0));
        for (int i = 0; i < lenyekSzama; i++) {
            Leny leny = null;
            String egysor = fileTartalmaStringLista.get(i + 1);
            System.out.println(egysor);
            String[] egyLenyDefinicioja = egysor.split(" ");

            if (egyLenyDefinicioja[1].equals("h")) {
                leny = new Homokjaro(egyLenyDefinicioja[0].trim(), Integer.parseInt(egyLenyDefinicioja[2]));
            } else if (egyLenyDefinicioja[1].equals("s")) {
                leny = new Szivacs(egyLenyDefinicioja[0].trim(), Integer.parseInt(egyLenyDefinicioja[2]));
            } else if (egyLenyDefinicioja[1].equals("l")) {
                leny = new Lepegeto(egyLenyDefinicioja[0].trim(), Integer.parseInt(egyLenyDefinicioja[2]));
            } else {
                //mindenki mast kizarunk a versenybol
                continue;
            }
            //lenyek hozzaadasa a gyujtemenyhez
            lenyek.add(leny);

        }

        String napok = fileTartalmaStringLista.get(fileTartalmaStringLista.size() - 1);

        //3. verseny futtatása
        for (int i = 0; i < napok.length(); i++) {
            String nap = String.valueOf(napok.charAt(i));

            for (Leny leny : lenyek) {
                leny.vizetVeszit(nap);
                if (leny.isAlive()) {
                    leny.elmozdul(nap);
                    // System.out.println("Viz: " + leny.getVizMennyiseg() + " tav: " + leny.getMegtettTavolsag());
                } else {
                    //System.out.println("*** halott leny: " + leny);

                }
                // System.out.println(leny);
            }
        }

        Collections.sort(lenyek);
        lenyek.forEach(System.out::println);

        if (!lenyek.isEmpty()) {
            Leny elsoLeny = lenyek.get(0);
            if (elsoLeny.isAlive()) {
                System.out.println(elsoLeny.getNev());
            }

        } else {
            System.out.println("Minden lény elpusztult.");
        }
    }
}
