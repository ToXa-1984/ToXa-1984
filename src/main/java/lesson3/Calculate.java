package lesson3;

public class Calculate {
    public int sum(int first, int second) {
        return first + second;
    }

    public double sum(double first, double second) {
        return first + second;
    }

    public int sum(int first, int second, int third) {
        return first + second + third;
    }

    public void sum() {
        System.out.println("Don't have parameters");
    }

    public static int minus(int first, int second) {
        return first - second;
    }

}
