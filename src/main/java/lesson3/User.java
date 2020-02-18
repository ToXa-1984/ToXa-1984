package lesson3;

import java.util.Objects;

public class User {
    String name;
    String surname;
    int age;

    public void move() {
        System.out.println("User move");
        work(); // Внутренний метод
    }

    String print() {
        System.out.println("User print");
        return "some string";
    }

    protected int danceHours() {
        return 2;
    }

    private void work() {
        System.out.println("User work");
    }

    public void introduce() {
        System.out.println("My name is " + name);
        System.out.println("My surname is " + surname);
        System.out.println("I'm " + age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
