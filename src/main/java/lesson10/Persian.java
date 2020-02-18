package lesson10;

public class Persian extends Cat {

    @Override
    public void run() {
        System.out.println("Persian cats can't run");
    }

    @Override
    public void say() {
        System.out.println("Say meow");
    }
}