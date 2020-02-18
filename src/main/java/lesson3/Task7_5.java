package lesson3;

import java.util.Random;

public class Task7_5 {
    public static void main(String[] args){
        Random random = new Random();
        zarplata(random);
        System.out.println("зарплата = " + zarplata2() + "$");
        }

    private static void zarplata(Random random){
        System.out.println("зарплата = " + random.nextInt(100000) + "$");
    }

    private static int zarplata2() {
        return  (int) (1000 + Math.random() / 0.0001);
    }
}
