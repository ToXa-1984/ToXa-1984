package lesson9new;

public class Animal {
    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public Animal() {

    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void leave() {
        System.out.println("I am alive");
    }
}
