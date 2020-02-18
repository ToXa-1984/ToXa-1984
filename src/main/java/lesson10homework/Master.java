package lesson10homework;

public abstract class Master extends Worker {
    private boolean married;
    private int salary;

    public Master() {
    }

    public Master(String surname, int age) {
        super(surname, age);
    }

    public Master(boolean married, int salary) {
        this.married = married;
        this.salary = salary;
    }

    public Master(String surname, int age, boolean married, int salary) {
        super(surname, age);
        this.married = married;
        this.salary = salary;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void controlImplementation() {
        System.out.println("control implementation");
    }
}
