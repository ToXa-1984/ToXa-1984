package lesson6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task9 {

   // String str = " Hillel is my feature. I will be developer   ";

    public static void myMethodTask9_1() {
        String str = " Hillel is my feature. I will be developer   ";
        String strTest = " Hillel is my feature. I will be DEVELOPER   ";
        System.out.println(str.isEmpty());
        System.out.println(str.length());
        String trim = str.trim();
        System.out.println(trim.length());
        System.out.println(str.charAt(23) + " - надеюсь, что нужно было вывести заглавную букву I, а не одну из маленьких l :)");
        System.out.println(str.substring(33, 42));
        System.out.println(str.concat("!"));
        System.out.println(str.equalsIgnoreCase(strTest));
        System.out.println(str.equals(strTest));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }

    public static void myMethodTask9_2() {
        char u1 = 9742;
        char u2 = 10764;
        char u3 = 32789;
        char u4 = 10000;
        char u5 = 48673;
        System.out.print(u1);
        System.out.print(u2);
        System.out.print(u3);
        System.out.print(u4);
        System.out.println(u5);
    }

    public static void myMethodTask9_3write() throws IOException {
        String poem = "C:/Hillel/src/main/resources/lesson6/Заповіт.txt";
        Path dirPath = Paths.get(poem);
        if (!Files.exists(dirPath.getParent())) {
            Files.createDirectories(dirPath.getParent());
        }

        FileWriter fileWriter = new FileWriter(poem);
        fileWriter.write("Як умру, то поховайте\n" + "Мене на могилі\n" + "Серед степу широкого\n"
                + "На Вкраїні милій,\n" + "Щоб лани широкополі,\n" + "І Дніпро, і кручі\n"
                + "Було видно, було чути,\n" + "Як реве ревучий. \n");
        fileWriter.close();

        if(Files.exists(Paths.get(poem))){
            System.out.println("Запись успешна." + "\n");
        }
        else {System.out.println("Стих не записан." + "\n");}
    }

    public static void myMethodTask9_3read() throws IOException {
        String poem = "C:/Hillel/src/main/resources/lesson6/Заповіт.txt";
        FileReader fileReader = new FileReader(poem);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        fileReader.close();
        scanner.close();

    }

    public static void myMethodTask9_4() throws IOException {
        System.out.println("Please enter your login ");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.next();
        System.out.println("Please enter your password");
        String passwordFirst = scanner.next();
        passwordFirst.trim();
        System.out.println("Please enter your password again");
        String passwordSecond = scanner.next();
        passwordSecond.trim();
        System.out.println(passwordFirst.equals(passwordSecond));

        if (passwordFirst.equals(passwordSecond) == false) {
            System.out.println("Password is entered incorrectly");
        } else {
            String user = "C:/Hillel/src/main/resources/lesson6/user.txt";
            Path dirPath = Paths.get(user);
            if (!Files.exists(dirPath.getParent())) {
                Files.createDirectories(dirPath.getParent());
            }

            FileWriter fileWriter = new FileWriter(user);
            fileWriter.write(login + " " + passwordFirst);
            fileWriter.close();
        }
    }

    public static void myMethodTask9_5() throws IOException {
        String user = "C:/Hillel/src/main/resources/lesson6/user.txt";
        Path dirPath = Paths.get(user);
        if (!Files.exists(Paths.get(user))) {
            System.out.println("Нет зарегестрированых пользователей.");
            return;
        }


        Scanner scanner = new Scanner(System.in);
        String login;
        String password;
        boolean flag = true;

        int q = 3;
        do{
            FileReader fileReader = new FileReader(user);
            Scanner scannerLogin = new Scanner(fileReader);

            System.out.println("Please enter your login ");
            login = scanner.next();
            System.out.println("Please enter your password");
            password = scanner.next();

            String loginPas = login.trim() + " " + password.trim();

            while (scannerLogin.hasNextLine()) {
                if (loginPas.equals(scannerLogin.nextLine())) {
                    System.out.println("Добро пожаловать");
                    flag = false;
                    break;
                }

            }
            scannerLogin.close();
            fileReader.close();
            q--;
        } while (q > 0 & flag);
        if (flag){
            System.out.println("Повторите попытку позже.");
        }

        scanner.close();
    }
}



