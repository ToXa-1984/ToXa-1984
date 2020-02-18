package lesson10;

public abstract class Cat extends Animal implements Eat {
    private String name;

    public Cat() {
    }

    public Cat(String type, int age, String name) {
        super(type, age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("Cats sleep 20 hours a day");
    }

    public abstract void say();

    @Override
    public void eat() {
        System.out.println("Cats eat all free time");
    }
}