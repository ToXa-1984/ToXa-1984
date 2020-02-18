package lesson10;

import java.util.Objects;

public class PrintWithPolymorphism {

    public void print(Object i) {
        System.out.println("print: " + i);
    }

    public void print(double d) {
        System.out.println("print: " + d);
    }

    public void print(String s) {
        System.out.println("print: " + s);
    }
}