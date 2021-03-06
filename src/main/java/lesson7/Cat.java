package lesson7;

public class Cat {
    String name;
    int weight;
    String woolColor;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Cat(String name, int weight, String woolColor) {
        this.name = name;
        this.weight = weight;
        this.woolColor = woolColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWoolColor(String woolColor) {
        this.woolColor = woolColor;
    }

    public String getWoolColor() {
        return woolColor;
    }
}
