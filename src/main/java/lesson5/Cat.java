package lesson5;

import java.util.Objects;

public class Cat {
    String name;
    int age;
    double weight;

    public void say() {
        System.out.println("мяу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Double.compare(cat.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }
}