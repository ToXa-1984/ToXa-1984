package lesson4;

public class Qwerty {
    public static void main(String[] args) {
        int[] myArray = new int[]{};//24, 140, 79, 106, 2, 346, 120, 50126, 372, 140};
        System.out.println(Qw.myMethod(myArray));
    }


}

class Qw {
    public static int myMethod(int[] myArray) {
        if (myArray.length == 0) {
            return 0;
        }
        int j = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (j > myArray[i]) {
                j = myArray[i];
            }
        }
        return j;
    }
}