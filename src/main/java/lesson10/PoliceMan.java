package lesson10;

public class PoliceMan extends Employee implements Work, Eat {

    public PoliceMan(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("I'm police worker");
    }

    @Override
    public void skills() {
        System.out.println("I'm a strong man");
    }

    @Override
    public void time() {
        System.out.println("Free time a day is 1 hour.");
    }

    @Override
    public void salary() {
        //TODO: will be later
    }

    @Override
    public void eat() {
        System.out.println("PoliceMan eats three times  a day");
    }
}