package lesson12homework;

public class SecondClass {
    private int length;

    public SecondClass() {
    }

    public SecondClass(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int SecondMethod(int length) {
        this.length = length;
        System.out.println("Second class length: " + this.length);
        return length;
    }
}
