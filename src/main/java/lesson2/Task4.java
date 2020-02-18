public class Task4 {
    public static void main(String[] args) {
        System.out.println("Variables: ");
        byte b = 2;
        System.out.println("b = " + b);
        short s = -145;
        System.out.println("s = " + s);
        long l = 198465734;
        System.out.println("l = " + l);
        float f = 7.654f;
        System.out.println("f = " + f);
        char c = '&';
        System.out.println("c = " + c);
        boolean boo = false;
        System.out.println("boo = " + boo);

        System.out.println("Assignment: ");
        int first = s;
        first *= 4;
        System.out.println("s * 2 = " + first);
        int second = b;
        second /= b;
        System.out.println("b / b = " + second);
        int third = s;
        third -= b;
        System.out.println("s - b = " + third);
        int fourth = b;
        fourth++;
        System.out.println("b + 1 = " + fourth);
        double fifth = s;
        fifth /= b;
        System.out.println("s / b = " + fifth);
        int sixth = 45;
        sixth--;
        System.out.println("45 - 1 = " + sixth);
        int seventh = 1024;
        seventh *= b;
        System.out.println("1024 * b = " + seventh);
        int eighth = 250;
        eighth += 40;
        System.out.println("250 + 40 = " + eighth);
        int ninth = 9;
        ninth += 1024 / 32 * 5;
        System.out.println("9 + 1024 / 32 * 5 = " + ninth);
        int tenth = 15;
        tenth /= 5;
        System.out.println("15 / 5 = " + tenth);


    }
}
