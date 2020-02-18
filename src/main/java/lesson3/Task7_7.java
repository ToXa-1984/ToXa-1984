package lesson3;

public class Task7_7 {
    public static void main(String[] args){
        System.out.println(MyMath.mult(20, 4, 2));

        MyMath math1 = new MyMath();
        System.out.println(math1.sum(10, 4));
    }
}
class MyMath{
    public int sum(int first, int second) {
        return first + second;
    }
    public double minus(double first, double second) {
        return first - second;
    }
    public static double div(double first, double second) {
        return first / second;
    }
    public static int mult(int first, int second, int third) {
        return first * second * third;
    }
}