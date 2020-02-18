package lesson10homework;

public abstract class Cook extends KitchenWorker implements ComeToWork, LunchBreak, ToCook{
    private int salary;
    private String nickname;

    public Cook() {
    }

    public Cook(int height, int weight) {
        super(height, weight);
    }

    public Cook(int salary, String name) {
        this.salary = salary;
        this.nickname = name;
    }

    public Cook(int height, int weight, int salary, String nickname) {
        super(height, weight);
        this.salary = salary;
        this.nickname = nickname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void cookSoup() {
        System.out.println("cook soup");
    }
}
