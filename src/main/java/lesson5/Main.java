package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        switchCaseExample1();
//        switchCaseExample2();
//        switchCaseExample3();

//        innerConditionsExample1();
//        innerConditionsExample2();

//        continueBreakReturnExample();
//        System.out.println("Main method");

//        Cat cat1 = new Cat();
//        cat1.name = "Max";
//        cat1.age = 2;
//        Cat cat2 = new Cat();
//        cat2.name = "Bob";
//        cat2.age = 2;
//        System.out.println(cat1.equals(cat2));

//        task1();
//        task2();
    }

    /**
     * Предположим что у нас есть сайт, где ограничено посещение пользователей от 18 до 50 лет.
     * Необходимо написать программу, которая будет запрашивать год Вашего рождения и
     * выдавать следующие ответы:
     * о “Вход строго с 18 лет” (Если пользователю меньше 18 лет);
     * о “Добро пожаловать” (Если возраст от 18 до 50 лет);
     * о “Вам будет не интересно на этом сайте(Если больше 50);
     */
    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of your birth:");
        int age = 2020 - scanner.nextInt();
        if (age < 18) {
            System.out.println("Вход строго с 18 лет");
        } else if (age >= 18 && age <= 50) {
            System.out.println("Добро пожаловать");
        } else {
            System.out.println("Вам будет не интересно на этом сайте");
        }
    }

    /**
     * Напишите программу, которая будет запрашивать ввести число, потом будет делить его на 2
     *         и выводить его значение. Ограничить вывод делимых значений не больше 5 раз используя
     *         break.
     */
    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int counter = 0;
        boolean res = true;
        while (true) {
            number /= 2;
            System.out.println(number);
            counter++;
            if (counter >= 5) {
                break;
            }
        }
    }

    private static void switchCaseExample1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
    }

    private static void switchCaseExample2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        switch (number) {
            case 10:
                System.out.println("Number ten");
            case 100:
                System.out.println("One hundred");
                break;
            case 1000:
                System.out.println("1000");
            case 10000:
                System.out.println("10000");
            default:
                System.out.println("Default");
        }
    }

    private static void switchCaseExample3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a month");
        String month = scanner.next();

        switch (month) {
            case "January":
            case "December":
            case "February":
                System.out.println("It's a winter");
                break;
            default:
                System.out.println("Other season");
                break;
        }

        //Эквивалент switch-case выше
        if (month.equals("January") || month.equals("December") || month.equals("February")) {
            System.out.println("It's a winter");
        }
    }

    private static void innerConditionsExample1() {
        int[][] doubleArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                if (doubleArray[i][j] % 2 == 0) {
                    System.out.println(doubleArray[i][j]);
                }
            }
        }
//        System.out.println(doubleArray[0][0]);
//        System.out.println(doubleArray[0][1]);
//        System.out.println(doubleArray[0][2]);
//
//        System.out.println(doubleArray[1][0]);
//        System.out.println(doubleArray[1][1]);
//        System.out.println(doubleArray[1][2]);
//
//        System.out.println(doubleArray[2][0]);
//        System.out.println(doubleArray[2][1]);
//        System.out.println(doubleArray[2][2]);
    }

    private static void innerConditionsExample2() {
        int[] arr = new int[100];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = i;
            } else {
                arr[i] = i * 100;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void continueBreakReturnExample() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                continue;
            }
            if (i > 4) {
                break;
            }
            if (i == 4) {
                return;
            }
        }
        System.out.println("Text after cycle");
    }
}