package elte.almasi.mate.lenyek.main;

import elte.almasi.mate.lenyek.model.Homokjaro;
import elte.almasi.mate.lenyek.model.Leny;
import elte.almasi.mate.lenyek.model.Lepegeto;
import elte.almasi.mate.lenyek.model.Szivacs;
import elte.almasi.mate.lenyek.utils.IOUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Verseny {

    public static void main(String[] args) {
        //gyűjtemény a lények tárolására
        List<Leny> lenyek = new ArrayList<Leny>();

        //1. Beolvasom a file nevét (teljes elérési úttal együtt)
        System.out.println("Add meg a file nevét teljes elérési úttal:");
        System.out.println("pl.:  C:\\dev\\LenyekversenyeMvn\\src\\main\\resources\\input.txt");
        String fileNeveTeljes = null;

        try(Scanner sc = new Scanner(System.in)){
            fileNeveTeljes = sc.nextLine();  // beolvasom a file teljes utvonalát
            //System.out.println("fileNeveTeljes : " + fileNeveTeljes);  // Output user input
        } catch (Exception ex){
            System.err.println("... hiba a file nevének megadásában. ");
            ex.printStackTrace();
        }

        //2. Input file bejárása és objektumok inicializálása
        List<String> fileTartalmaStringLista = IOUtil.getFileContentAsList(fileNeveTeljes.trim());

        int lenyekSzama = Integer.parseInt(fileTartalmaStringLista.get(0));
        for (int i = 0; i < lenyekSzama; i++) {
            Leny leny = null;
            String egysor = fileTartalmaStringLista.get(i + 1);

            // a sort felbontom spacek mentén
            // sor: Vandor h 4
            String[] egyLenyDefinicioja = egysor.split(" ");

            //eldöntöm, hogy melyik tipusu lenyt definilaja a sor
            if (egyLenyDefinicioja[1].equals("h")) {
                leny = new Homokjaro(egyLenyDefinicioja[0].trim(), Integer.parseInt(egyLenyDefinicioja[2]));
            } else if (egyLenyDefinicioja[1].equals("s")) {
                leny = new Szivacs(egyLenyDefinicioja[0].trim(), Integer.parseInt(egyLenyDefinicioja[2]));
            } else if (egyLenyDefinicioja[1].equals("l")) {
                leny = new Lepegeto(egyLenyDefinicioja[0].trim(), Integer.parseInt(egyLenyDefinicioja[2]));
            } else {
                //mindenki mast kizarunk a versenybol, aki nincs a lenyek listajaban
                // tehat nem adom hozza a gyüjtemé nyhez
                continue;
            }
            //lenyek hozzaadasa a gyujtemenyhez
            lenyek.add(leny);

        }

        // a file utolso sora a verseny napjait definialja
        String napok = fileTartalmaStringLista.get(fileTartalmaStringLista.size() - 1);

        //3. verseny futtatása: - bejarom a napokat
        for (int i = 0; i < napok.length(); i++) {
            String nap = String.valueOf(napok.charAt(i));

            for (Leny leny : lenyek) {
                // a leny az adott napon valtoztat vizmennyiseget
                leny.vizMennyisegValtozas(nap);
                // ha eletben van a leny
                if (leny.isAlive()) {
                    // akkor elmozdul az adott napnak megfeleloen
                    leny.elmozdul(nap);
                } else {
                    // itt halott a leny
                }
            }
        }

        // az összegyüjtött lényeket a gyűjteményben berendezem
        Collections.sort(lenyek);

        //eldöntöm a győztest és a nevét kiiratom
        if (!lenyek.isEmpty()) {
            for (Leny egyLeny: lenyek) {
               //System.out.println(egyLeny);

                if (egyLeny.isAlive()) {
                    // megtaláltuk az életben maradt lényt aki a legmesszebb jutott
                    System.out.println(egyLeny.getNev());
                    return;
                }
            }
            System.out.println("Minden lény elpusztult.");
        }
    }
}
