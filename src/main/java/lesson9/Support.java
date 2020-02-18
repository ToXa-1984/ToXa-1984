package lesson9;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

final class Support extends User {

    public boolean verification(String text) throws IOException {

        text = text.trim();

        String pathFile = "C:/Hillel/src/main/resources/lesson9/User.txt";
        if(!Files.exists(Paths.get(pathFile))){
            System.out.println("File not found.");
            return false;
        }

        FileReader fileReader = new FileReader(pathFile);
        Scanner scannerFile = new Scanner(fileReader);

        while (scannerFile.hasNextLine()) {
            if (text.equals(scannerFile.nextLine())) {
                scannerFile.close();
                fileReader.close();
                return true;
            }
        }
        scannerFile.close();
        fileReader.close();

        return false;
    }
}
