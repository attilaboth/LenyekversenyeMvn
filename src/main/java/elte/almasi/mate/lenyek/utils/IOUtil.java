package elte.almasi.mate.lenyek.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Ebbe az osztalyba tettem ki a file beolvasas műveletét
 */
public class IOUtil {

    public static List<String> fileTartalomBeolvasasa(String pathtoFile) {

        List<String> linesInArray = new ArrayList<>();
        BufferedReader bufferedOlvaso = null;
        try{
            bufferedOlvaso = new BufferedReader(new FileReader(new File(pathtoFile)));

            String egySor;
            while ((egySor = bufferedOlvaso.readLine()) != null) {
                linesInArray.add(egySor.trim());
            }

            bufferedOlvaso.close();
        } catch (IOException e) {
            System.err.format(e.getLocalizedMessage());
        }
        return linesInArray;
    }
}
