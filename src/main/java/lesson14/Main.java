package lesson14;

//import sun.misc.CEStreamExhausted;

import java.io.IOException;
import java.net.BindException;
import java.nio.file.AccessDeniedException;

public class Main {
    public static void main(String[] args) {

//        checkNumber(10);

//        int length = 0;
//        try {
//            length = checkString("");
//        } catch (CustomException e) {
//            System.out.println("Sent string is null or empty");
//        } finally {
//            try {
//                checkNumber(length);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Always work");
//        }

//        //Вызов трех методов, в каждом из которых возможна своя ошибка.
//        //Для разных случаев мы можем задать разную логику обработки ошибок
//        try {
//            MethodsWithExceptions.first();
//            MethodsWithExceptions.second();
//            MethodsWithExceptions.third();
//        } catch (AccessDeniedException | BindException e) {
//            System.out.println(e);
//        } catch (CEStreamExhausted ceStreamExhausted) {
//            ceStreamExhausted.printStackTrace();
//            System.out.println("Critical Error");
//            System.out.println("Critical Error");
//            System.out.println("Critical Error");
//            System.out.println("Critical Error");
//        }

//        //Пример  класса Writer из 6го урока, только переписанный с внутренней обработкой ошибок
//        Writer.write("/Users/kreeck/IdeaProjects/hillel/src/main/resources/lesson14/text.txt", true);
//        Writer.read("/Users/kreeck/IdeaProjects/hillel/src/main/resources/lesson14/text.txt");


//        //Пример вызова  метода,  в котором обрабатываются разные ошибки, но выше прокидывается ошибка,
//        //Созданныя Нами  специально для отлавливания выше.
//        try {
//            logic();
//        } catch (CustomException e) {
//            //...some logic before...
//        }

        try {
            throw new RuntimeException();
        } finally {
            System.out.println("Work always");
        }
    }

    private static void checkNumber(int number) throws IOException {
        if (number == 0) {
//            log.error(number + " is incorrect");
            throw new IOException(number + " is incorrect");
        }
        System.out.println("Received number: " + number);
    }

    private static int checkString(String string) throws CustomException {
        if (string.isEmpty()) {
            throw new CustomException();
        }
        System.out.println("Received string: " + string);
        return string.length();
    }

    private static void logic() throws CustomException {
//        try {
//            MethodsWithExceptions.first();
//            MethodsWithExceptions.second();
//            MethodsWithExceptions.third();
//        } catch (AccessDeniedException e) {
//            System.out.println("MethodsWithExceptions.first method Error: " + e);
//            //custom logic
//            throw new CustomException();
//        } catch (BindException e) {
//            System.out.println("MethodsWithExceptions.second method Error: " + e);
//            throw new CustomException();
//        } catch (CEStreamExhausted ceStreamExhausted) {
//            System.out.println("MethodsWithExceptions.third method Error: " + ceStreamExhausted);
//            throw new CustomException();
//        }
        //...some logic before...
    }
}