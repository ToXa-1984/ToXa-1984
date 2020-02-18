package lesson10homework;

public abstract class KitchenWorker implements ComeToWork, LunchBreak, ToCook{
    private int height;
    private int weight;

    public KitchenWorker() {
    }

    public KitchenWorker(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void procurementControl() {
        System.out.println("procurement control");
    }
}
