package lesson8;

public class Armchair extends Furniture {
    String model;

    public Armchair(int width, int height, int depth, String model){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.model = model;
    }

    public String getInfoArmchair(){
        return getInfoSize() + " Модель: " + model;
    }
}
