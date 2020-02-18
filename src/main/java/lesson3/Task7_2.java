package lesson3;

import java.util.Random;

public class Task7_2 {
    public static void main(String[] args){

        Random random = new Random();
        System.out.println("переменные типа int: ");
        int first = random.nextInt();
        System.out.println(first);
        int second = random.nextInt();
        System.out.println(second);
        int third = random.nextInt();
        System.out.println(third);
        System.out.println("переменные типа double: ");
        double firstD = random.nextDouble();
        System.out.println(firstD);
        double secondD = random.nextDouble();
        System.out.println(secondD);
        double thirdD = random.nextDouble();
        System.out.println(thirdD);

        System.out.println("сумма переменных: ");
        double summ = (first + second + third + firstD + secondD + thirdD);
        System.out.println(summ);
    }
}
