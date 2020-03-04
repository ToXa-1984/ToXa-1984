package lesson14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Writer {

    public static void write(String path, boolean append) {
        checkAndCreateDirectory(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, append);
            System.out.println("Enter some text:");
            Scanner scanner = new Scanner(System.in);
            fileWriter.write(scanner.nextLine()+"\n");

        } catch (IOException e) {
            System.out.println("Cannot write this file: " + e);
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Cannot close fileWrite: " + e);
            }
        }
    }

    public static void read(String path) {

        try(FileReader fileReader = new FileReader(path);
            Scanner scanner = new Scanner(fileReader)){

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Read file exception: ");
            e.printStackTrace();
        }
    }

    private static void checkAndCreateDirectory(String path) {
        Path dirPath = Paths.get(path);
        if (!Files.exists(dirPath.getParent())) {
            try {
                Files.createDirectories(dirPath.getParent());
            } catch (IOException e) {
                System.out.println("Cannot create directory: " + e);
            }
        }
    }
}