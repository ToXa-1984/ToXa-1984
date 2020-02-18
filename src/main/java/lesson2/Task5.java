public class Task5 {
    public static void main(String[] args) {
        int first = 2, second = 4, third = 8, fourth = 16, fifth = 32, sixth = 64, seventh = 128, eighth = 256, ninth = 512, tenth = 1024;
        System.out.println("Logical operations: ");
        System.out.print("2 * 4 > 7 ");
        System.out.println(first * second > second);
        System.out.print("32 / 16 >= 1024 ");
        System.out.println(fifth / fourth >= tenth);
        System.out.print("1024 / 32 * 2 < 128 ");
        System.out.println(tenth / fifth * first < seventh);
        System.out.print("256 + 512 / 16 <= 4 ");
        System.out.println(eighth + ninth / fourth <= second);
        System.out.print("128 / 4 == 32 ");
        System.out.println(seventh / second == fifth);
        System.out.print("512 * 16 != 1024 * 8 ");
        System.out.println(ninth * fourth != tenth * third);
       /* System.out.print(" && ");
        System.out.println( && );
        System.out.print(" || ");
        System.out.println( || );
        System.out.print(" !  ");
        System.out.println( ! );*/
        //System.out.print("128 + 512 & 32 / 16");
        //System.out.println(seventh + ninth & fifth / fourth );
        //System.out.print("128 + 512 | 2 ");
        // System.out.println(seventh + ninth | first); к закоментареной части кода вернусь чуток позже
        
    }
}
