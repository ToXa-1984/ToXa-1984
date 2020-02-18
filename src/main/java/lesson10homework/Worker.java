package lesson10homework;

public abstract class Worker implements Holiday, Relax {
    private String surname;
    private int age;

    public Worker() {
    }

    public Worker(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeDecisions() {
        System.out.println("make decisions");
    }
}
