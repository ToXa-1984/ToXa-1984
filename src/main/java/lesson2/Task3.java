package lesson2;

public class Task3 {
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

        System.out.println("Integer: ");
        int first = s / b + b;
        System.out.println("s / b + b = " + first);
        long second = l / s + b;
        System.out.println("l / s + b = " + second);
        long third = s * b - l;
        System.out.println("s * b - l = " + third);
        long fourth = b + l + s;
        System.out.println("b + l + s = " + fourth);
        int fifth = b - s * b;
        System.out.println("b - s * b = " + fifth);

        System.out.println("Fractional number: ");
        double firstD = l / s + b;
        System.out.println("l / s + b = " + first);
        double secondD = b / l + s;
        System.out.println("b / l + s = " + secondD);
        double thirdD = s * b - l;
        System.out.println("s * b - l = " + thirdD);
        double fourthD = l + b +s;
        System.out.println("l + b +s = " + fourthD);
        double fifthD = l / s * b;
        System.out.println("l / s * b = " + fifthD);


    }
}
