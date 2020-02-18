package lesson6;

import lesson6.Writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//        //Неизменяемы объект
//        final int VAR = 12;
//        VAR = 10; // невозможное изменение

//        //String - неизменяемый объект
        String str = "First";
        str = "Second  ";
//        String string = "Third";
//        string = str + string;

//        //String методы:
//        String str = "  Hello world  ";
//        System.out.println("String.length(): " + str.length());
//
//        char[] chars = str.toCharArray(); // преобразует в массив символов
//        System.out.println("chars[10]: " + chars[10]);
//
//
        String trim = str.trim(); // Убирает пробелы вначале и вконце строки
        System.out.println("str.trim().length(): " + trim.length());
//
//        System.out.println("str.isEmpty(): " + str.isEmpty()); // Проверка на наличие значения в строке
//        String empty = "";
//        System.out.println("empty.isEmpty(): " + empty.isEmpty());
//
//        String valueOf = String.valueOf('a'); // Преобразует примитив в строку
//        System.out.println("char to String: " + valueOf);
//
//        char charAt = str.charAt(6);// Достает символ по индексу
//        System.out.println("str.charAt(n): " + charAt);
//
//        String concat = str.concat("123"); // Аналог выполнения сложения(+) строк
//        System.out.println("str.concat(123): " + concat);
//        System.out.println("str + 123: " + str + "123");
//
//        System.out.println("str.equals(concat): " + str.equals(concat));
//
//        String upper = "HELLO";
//        String lower = "hello";
//        System.out.println("equals: " + upper.equals(lower));
//        System.out.println("equalsIgnoreCase: " + upper.equalsIgnoreCase(lower));
//
//        String substr = "lesson 5";
//        // оставить часть строки с указаннго индекса
//        System.out.println("substr.substring(n): " + substr.substring(7));
//        // обпркзать строку в рамках указанных индексов
//        System.out.println(substr.substring(0, 7).concat("6"));
//
//        String password = "QwErTyUi";
//        System.out.println("password.toLowerCase(): " + password.toLowerCase());
//        System.out.println("password.toUpperCase(): " + password.toUpperCase());

//        char unicodeChar = 681;
//        System.out.println(unicodeChar);

        //Считывание и запись файла:
//        write();
//        read();


        /*--------------------Practice------------------*/
//
//        String path = "/Users/kreeck/IdeaProjects/hillel/src/main/resources/practice/file.txt";
//        System.out.println("Enter first line");
//        Writer.write(path);
//
//        System.out.println("Enter second line");
//        Writer.write(path);
//
//        Writer.read(path);
//    }
//
//    private static void read() throws IOException {
//        String path = "/Users/kreeck/IdeaProjects/hillel/src/main/resources/file.txt";
//        FileReader fileReader = new FileReader(path);
//        Scanner scanner = new Scanner(fileReader);
//
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
//
//        fileReader.close();
//        scanner.close();
//    }
//
//    private static void write() throws IOException {
//        String path = "/Users/kreeck/IdeaProjects/hillel/src/main/resources/lesson6/file.txt";
//        Path dirPath = Paths.get(path);
//        if (!Files.exists(dirPath.getParent())) {
//            Files.createDirectories(dirPath.getParent());
//        }
//
////        FileWriter fileWriter = new FileWriter(path, true);
//        FileWriter fileWriter = new FileWriter(path);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter data for saving:");
//
////        fileWriter.write("Hillel: Lesson 6\nSecond line\n");
//        fileWriter.write(scanner.nextLine());
//        fileWriter.close();
////        fileWriter.write("123"); // будет ошибка выполнения программы
    }
}
