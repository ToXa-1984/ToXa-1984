package lesson10homework;

final public class Confectioner extends Cook {
    private String name;
    private String Surname;

    public Confectioner() {
    }

    public Confectioner(int height, int weight) {
        super(height, weight);
    }

    public Confectioner(int salary, String name) {
        super(salary, name);
    }

    public Confectioner(int height, int weight, int salary, String name) {
        super(height, weight, salary, name);
    }

    public Confectioner(String name, String surname) {
        this.name = name;
        Surname = surname;
    }

    public Confectioner(int height, int weight, String name, String surname) {
        super(height, weight);
        this.name = name;
        Surname = surname;
    }

    public Confectioner(int salary, String name, String name1, String surname) {
        super(salary, name);
        this.name = name1;
        Surname = surname;
    }

    public Confectioner(int height, int weight, int salary, String name, String name1, String surname) {
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

    public void makeDessert() {
        System.out.println("make dessert");
    }

    @Override
    public void lunchBreak() {
        System.out.println("Confectioner lunch break");
    }

    @Override
    public void smokeBreak() {
        System.out.println("Confectioner smoke break");
    }

    @Override
    public void comeToWork() {
        System.out.println("Confectioner come to work");
    }

    @Override
    public void work() {
        System.out.println("Confectioner work");
    }

    @Override
    public void toCook() {
        System.out.println("Confectioner to cook");
    }

    @Override
    public void fry() {
        System.out.println("Confectioner fry");
    }
}
