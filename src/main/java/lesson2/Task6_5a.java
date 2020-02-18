package lesson2;

public class Task6_5a {
    public static void main(String[] args) {
        int[] mas = new int[]{2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        System.out.println("переменные");

        System.out.print("i0 = " + mas[0] + ";  ");
        System.out.print("i1 = " + mas[1] + ";  ");
        System.out.print("i2 = " + mas[2] + ";  ");
        System.out.print("i3 = " + mas[3] + ";  ");
        System.out.print("i4 = " + mas[4] + ";  ");
        System.out.print("i5 = " + mas[5] + ";  ");
        System.out.print("i6 = " + mas[6] + ";  ");
        System.out.print("i7 = " + mas[7] + ";  ");
        System.out.print("i8 = " + mas[8] + ";  ");
        System.out.println("i9 = " + mas[9] + ";  ");

        System.out.println("Значение в ячейках, индекс которых имеет нечетное значение, увеличить вдвое. ");
        mas[1] *= 2;
        mas[3] *= 2;
        mas[5] *= 2;
        mas[7] *= 2;
        mas[9] *= 2;

        System.out.println("Значение в ячейках, индекс которых имеет четное значение, уменьшить на 2.");
        mas[0] -= 2;
        mas[2] -= 2;
        mas[4] -= 2;
        mas[6] -= 2;
        mas[8] -= 2;

        System.out.print("i0 = " + mas[0] + ";  ");
        System.out.print("i1 = " + mas[1] + ";  ");
        System.out.print("i2 = " + mas[2] + ";  ");
        System.out.print("i3 = " + mas[3] + ";  ");
        System.out.print("i4 = " + mas[4] + ";  ");
        System.out.print("i5 = " + mas[5] + ";  ");
        System.out.print("i6 = " + mas[6] + ";  ");
        System.out.print("i7 = " + mas[7] + ";  ");
        System.out.print("i8 = " + mas[8] + ";  ");
        System.out.print("i9 = " + mas[9] + ";  ");
    }
}
