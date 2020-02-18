package lesson9new;

/**
 * Данный класс наследуется от Animal и имплементирует два интерфейса,
 * при этом обязуясь реализовать все методы интерфейса
 */
public class Cat extends Animal implements Functional, Sleep {
    private boolean seeInNight;

    /**
     * конструкция super() вызывает конструктор родительского класса
     */
    public Cat(int legs, boolean seeInNight) {
        super(legs);
        this.seeInNight = seeInNight;
    }

    public Cat(int legs) {
        super(legs);
    }

    public Cat() {

    }

    public boolean isSeeInNight() {
        return seeInNight;
    }

    public void setSeeInNight(boolean seeInNight) {
        this.seeInNight = seeInNight;
    }

    public void meow() {
        System.out.println("Meow");
    }

    public void leave() {
        System.out.println("I am alive in the cat");
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep");
    }
}
