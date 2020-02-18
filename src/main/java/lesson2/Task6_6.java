public class Task6_6 {
    public static void main(String[] args) {
        int[][] i = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("до изменений");
        System.out.print(i[0][0] + "  ");
        System.out.print(i[0][1] + "  ");
        System.out.println(i[0][2]);
        System.out.print(i[1][0] + "  ");
        System.out.print(i[1][1] + "  ");
        System.out.println(i[1][2]);
        System.out.print(i[2][0] + "  ");
        System.out.print(i[2][1] + "  ");
        System.out.println(i[2][2]);


        System.out.println("после изменений");
        i[0][0] = 9;
        i[0][1] = 8;
        i[0][2] = 7;
        i[1][0] = 6;
        i[1][1] = 5;
        i[1][2] = 4;
        i[2][0] = 3;
        i[2][1] = 2;
        i[2][2] = 1;

        System.out.print(i[0][0] + "  ");
        System.out.print(i[0][1] + "  ");
        System.out.println(i[0][2]);
        System.out.print(i[1][0] + "  ");
        System.out.print(i[1][1] + "  ");
        System.out.println(i[1][2]);
        System.out.print(i[2][0] + "  ");
        System.out.print(i[2][1] + "  ");
        System.out.println(i[2][2]);
    }
}
