package lesson2;

public class Task6_5 {
    public static void main(String[] args) {
        System.out.println("primitives");
        int first = 2, second = 4, third = 8, fourth = 16, fifth = 32, sixth = 64, seventh = 128, eighth = 256, ninth = 512, tenth = 1024;
        int[] ints = new int[10];
        ints[0] = first;
        ints[1] = second;
        ints[2] = third;
        ints[3] = fourth;
        ints[4] = fifth;
        ints[5] = sixth;
        ints[6] = seventh;
        ints[7] = eighth;
        ints[8] = ninth;
        ints[9] = tenth;

        System.out.println("first cell = " + ints[0]);
        System.out.println("second cell = " + ints[1]);
        System.out.println("third cell = " + ints[2]);
        System.out.println("fourth cell = " + ints[3]);
        System.out.println("fifth cell = " + ints[4]);
        System.out.println("sixth cell = " + ints[5]);
        System.out.println("seventh cell = " + ints[6]);
        System.out.println("eighth cell = " + ints[7]);
        System.out.println("ninth cell = " + ints[8]);
        System.out.println("tenth cell = " + ints[9]);

        System.out.println("odd cells * 2");
        ints[1] = ints[1] * 2;
        ints[3] = ints[3] * 2;
        ints[5] = ints[5] * 2;
        ints[7] = ints[7] * 2;
        ints[9] = ints[9] * 2;

        System.out.println(ints[1]);
        System.out.println(ints[3]);
        System.out.println(ints[5]);
        System.out.println(ints[7]);
        System.out.println(ints[9]);

        System.out.println("even cells - 2");
        ints[0] = ints[0] - 2;
        ints[2] = ints[2] - 2;
        ints[4] = ints[4] - 2;
        ints[6] = ints[6] - 2;
        ints[8] = ints[8] - 2;

        System.out.println(ints[0]);
        System.out.println(ints[2]);
        System.out.println(ints[4]);
        System.out.println(ints[6]);
        System.out.println(ints[8]);
    }
}
