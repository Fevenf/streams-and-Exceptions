package Reading;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        doc ("src/Reading/file.txt");
    }

    public static List<String> doc (String file) {
        List<String> doc  = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(row -> doc .add(row));
            doc .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return doc ;
    }
}