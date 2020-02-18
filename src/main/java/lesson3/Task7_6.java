package lesson3;

import java.util.Objects;

 class Employee {
     double salary = 1000;
     String position = "1";
     int age = 20;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee user = (Employee) o;
        return age == user.age &&
                Objects.equals(salary, user.salary) &&
                Objects.equals(position, user.position);
    }
}

public class Task7_6 {
    public static void main(String[] args){
        Employee user1 = new Employee();
        user1.salary = 1000;
        user1.position = "1";
        user1.age = 20;

        Employee user2 = new Employee();
        user2.salary = 1000;
        user2.position = "1";
        user2.age = 20;

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }
}
