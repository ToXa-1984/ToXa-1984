package lesson13homework;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

class QuestionnaireClass {
    public static void mQuestionnaire(String nameFile) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String first = scanner.next();
        System.out.println("How are you: ");
        String second = scanner.next();
        System.out.println("What day is today: ");
        String third = scanner.next();

        HashMap questionnaire = new HashMap();

        HashMap mm = new HashMap<>();
        mm.put("How are you: ", second);

        mm.put("What day is today: ", third);
        questionnaire.put(first, mm);

//        System.out.println(((HashMap)questionnaire.get(first)).get("What day is today: "));
//        System.out.println(((HashMap)questionnaire.get(first)).values());
//        System.out.println(questionnaire.values());

        Path dirPath = Paths.get(nameFile);
        if (!Files.exists(dirPath.getParent())) {
            Files.createDirectories(dirPath.getParent());
        }

        FileWriter fileWriter = new FileWriter(nameFile, true);
        fileWriter.write(String.valueOf(questionnaire) + "\n");
        fileWriter.close();
    }
}
