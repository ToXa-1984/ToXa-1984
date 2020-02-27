package lesson12homework;

public class ThirdClass {
    private boolean boo;

    public ThirdClass() {
    }

    public ThirdClass(boolean boo) {
        this.boo = boo;
    }

    public boolean isBoo() {
        return boo;
    }

    public void setBoo(boolean boo) {
        this.boo = boo;
    }

    public boolean ThirdMethod() {
        System.out.println("Third class boo: " + this.boo);
        return boo;
    }
}
