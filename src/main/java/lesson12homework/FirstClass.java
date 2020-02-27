package lesson12homework;

public class FirstClass {
    private String name;

    public FirstClass() {
    }

    public FirstClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String FirstMethod(String name) {
        this.name = name;
        System.out.println("First class name: " + this.name);
        return name;
    }
}
