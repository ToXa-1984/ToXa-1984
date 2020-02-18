package lesson6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Writer {

    public static void write(String path) throws IOException {
        checkAndCreateDirectory(path);
        FileWriter fileWriter = new FileWriter(path, true);
        Scanner scanner = new Scanner(System.in);
        fileWriter.write(scanner.nextLine()+"\n");
        fileWriter.close();
    }

    public static void read(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        fileReader.close();
        scanner.close();
    }

    private static void checkAndCreateDirectory(String path) throws IOException {
        Path dirPath = Paths.get(path);
        if (!Files.exists(dirPath.getParent())) {
            Files.createDirectories(dirPath.getParent());
        }
    }
}
