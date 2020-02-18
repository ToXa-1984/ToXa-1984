public class Task6_3 {
    public static void main(String[] args) {
        byte b = 16;
        short s = 32;
        int i = 128;
        float first = 0.25f;
        float second = 0.5f;
        float third = 0.75f;

        long l = b;
        float f = s;
        double d = i;
        double firstD = first;
        double secondD = second;
        double thirdD = third;

        String str = Integer.toString ((int) (l + f + d + firstD + secondD + thirdD));
        String str1 = String.valueOf(l + f + d + firstD + secondD + thirdD);
        System.out.println("преобразованное к int " + str);
        System.out.println("полная сумма " + str1);
    }
}
