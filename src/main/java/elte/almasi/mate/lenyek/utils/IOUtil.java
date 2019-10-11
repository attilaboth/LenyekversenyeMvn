package elte.almasi.mate.lenyek.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IOUtil {

    public static List<String> getFileContentAsList(String pathtoFile) {

        List<String> linesInArray = new ArrayList<>();
        try (Stream<String> fileAsStream = Files.lines(Paths.get(pathtoFile))) {

            fileAsStream.forEach(aLine -> {

                linesInArray.add(aLine.trim());

            });

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return linesInArray;
    }
}
