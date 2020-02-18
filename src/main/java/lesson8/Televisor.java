package lesson8;

public class Televisor extends Furniture {
    String color;

    public Televisor(int width, int height, int depth, String color){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
    }

    public String getInfoTelevisor(){
        return getInfoSize() + " Вес: " + color;
    }
}
