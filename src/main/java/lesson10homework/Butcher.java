package lesson10homework;

final public class Butcher extends Cook {
    private String name;
    private String Surname;

    public Butcher() {
    }

    public Butcher(int height, int weight) {
        super(height, weight);
    }

    public Butcher(int salary, String name) {
        super(salary, name);
    }

    public Butcher(int height, int weight, int salary, String name) {
        super(height, weight, salary, name);
    }

    public Butcher(String name, String surname) {
        this.name = name;
        Surname = surname;
    }

    public Butcher(int height, int weight, String name, String surname) {
        super(height, weight);
        this.name = name;
        Surname = surname;
    }

    public Butcher(int salary, String name, String name1, String surname) {
        super(salary, name);
        this.name = name1;
        Surname = surname;
    }

    public Butcher(int height, int weight, int salary, String name, String name1, String surname) {
        super(height, weight, salary, name);
        this.name = name1;
        Surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void chopMeat() {
        System.out.println("chop meat");
    }

    @Override
    public void lunchBreak() {
        System.out.println("Butcher lunch break");
    }

    @Override
    public void smokeBreak() {
        System.out.println("Butcher smoke break");
    }

    @Override
    public void comeToWork() {
        System.out.println("Butcher come to work");
    }

    @Override
    public void work() {
        System.out.println("Butcher work");
    }

    @Override
    public void toCook() {
        System.out.println("Butcher to cook");
    }

    @Override
    public void fry() {
        System.out.println("Butcher fry");
    }
}
