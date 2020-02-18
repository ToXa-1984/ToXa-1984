package lesson4;

import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("lesson4");
        System.out.println("Task 1 : ");
        System.out.print("First option: ");
        Task8_1.myMethod();
        System.out.print("Second option: ");
        Task8_1.myMethod2();
        System.out.println("");
        System.out.println("Task 2 : ");
        Task8_2.myMethod();
        System.out.println("");
        System.out.println("Task 3 : ");
        Task8_3.myMethod();
        System.out.println("");
        System.out.println("Task 4 : ");
        Task8_4.myMethod();
        System.out.println("");
        System.out.println("Task 5 : ");
        int[] myArray = new int[]{24, 140, 79, 106, 2, 346, 120, 50126, 372, 140};
        System.out.println(Task8_5.myMethod(myArray));
        System.out.println("Task 6 : ");
        System.out.println(Task8_6.myMethod(myArray));
        System.out.println("Task 7 : ");
        Task8_7.myMethod();
        System.out.println("Task 8 : ");
        int[] myArrayN = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Task8_8.myMethod(myArrayN);
    }
}

class Task8_1 {

    public static void myMethod() {
        int first = 1;
        int second = 10;

        while (first <= second) {
            System.out.print(first + " ");
            first++;
        }
    }

    public static void myMethod2() {
        int i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }
}

class Task8_2 {

    public static void myMethod() {
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }
    }
}

class Task8_3 {

    public static void myMethod() {
        int i = 100;

        while (i >= 0) {
            System.out.print(i);
            if (i > 0) {
                System.out.print(", ");
            }
            i = i - 10;
        }
    }
}

class Task8_4 {

    public static void myMethod() {
        for (int j = 100; j >= 0; j = j - 10) {
            System.out.print(j);
            if (j > 0) {
                System.out.print(", ");
            }
        }
    }
}

class Task8_5 {

    public static int myMethod(int[] myArray) {
        if (myArray.length == 0) {
            return 0;
        }
        int j = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (j < myArray[i]) {
                j = myArray[i];
            }
        }
        return j;
    }
}

class Task8_6 {

    public static int myMethod(int[] myArrayN) {
        if (myArrayN.length == 0) {
            return 0;
        }
        int j = myArrayN[0];
        for (int i = 1; i < myArrayN.length; i++) {
            if (j > myArrayN[i]) {
                j = myArrayN[i];
            }
        }
        return j;
    }
}

class Task8_7 {

    public static void myMethod() {
        int i = 5;
        do {
            System.out.println("Hillel the Best");
        } while (i < 0);
    }
}

class Task8_8 {

    static void myMethod(int[] myArrayNew) {
        int j = myArrayNew[0];
        for (int i = 0; i < myArrayNew.length; i++) {
            if (myArrayNew[i] % 2 == 1) {
                System.out.println(myArrayNew[i] + " - не чётное число");
            } else {
                System.out.println(myArrayNew[i] + " - чётное число");
            }
        }
    }
}
