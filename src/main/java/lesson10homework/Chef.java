package lesson10homework;

        final public class Chef extends Cook {
    private String name;
    private String Surname;

    public Chef() {
    }

    public Chef(int height, int weight) {
        super(height, weight);
    }

    public Chef(int salary, String name) {
        super(salary, name);
    }

    public Chef(int height, int weight, int salary, String name) {
        super(height, weight, salary, name);
    }

    public Chef(String name, String surname) {
        this.name = name;
        Surname = surname;
    }

    public Chef(int height, int weight, String name, String surname) {
        super(height, weight);
        this.name = name;
        Surname = surname;
    }

    public Chef(int salary, String name, String name1, String surname) {
        super(salary, name);
        this.name = name1;
        Surname = surname;
    }

    public Chef(int height, int weight, int salary, String name, String name1, String surname) {
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

    public void createMenu() {
        System.out.println("create menu");
    }

    @Override
    public void lunchBreak() {
        System.out.println("Chef lunch break");
    }

    @Override
    public void smokeBreak() {
        System.out.println("Chef smoke break");
    }

    @Override
    public void comeToWork() {
        System.out.println("Chef come to work");
    }

    @Override
    public void work() {
        System.out.println("Chef work");
    }

    @Override
    public void toCook() {
        System.out.println("Chef to cook");
    }

    @Override
    public void fry() {
        System.out.println("Chef fry");
    }
}
