package lesson3;

import java.util.Scanner;

public class Task7_1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String first = scanner.next();
        System.out.println("Введите Вашу фамилию:");
        String sekond = scanner.next();
        System.out.println("Укажите сколько Вам полных лет:");
        int third = scanner.nextInt();
        System.out.println("Введите Вашу почту для регистрации:");
        String fourth = scanner.next();
        scanner.nextLine();
        System.out.println("Напишите несколько слов о себе:");
        String fifth = scanner.nextLine();

        System.out.println("Ваше имя: " + first + "\nВаша фамилия: " + sekond + "\nсколько Вам полных лет: " + third + "\nВаша почта для регистрации: " + fourth + "\nО себе: " + fifth);
    }

}
