package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task7_3 {

    public static void main(String[] args){
        lotereja();
   }

    public static void lotereja(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Мы начинаем лотерею - введите количество участников:  ");
        int first = scanner.nextInt();

        System.out.print("И победителем становится - ");
        Random random = new Random();
        System.out.println(random.nextInt(first) + "  - конгратюлэйш:)");
    }
}

