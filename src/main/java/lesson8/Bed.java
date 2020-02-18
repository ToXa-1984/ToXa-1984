package lesson8;

public class Bed extends Furniture {
    int weight;

    public Bed(int width, int height, int depth, int weight){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    public String getInfoBed(){
        return getInfoSize() + " Вес: " + weight;
    }
}
