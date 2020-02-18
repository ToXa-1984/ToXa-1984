package lesson8;

public class Cupboard extends Furniture {
    String countryOfManufacture;

    public Cupboard(int width, int height, int depth, String countryOfManufacture){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.countryOfManufacture = countryOfManufacture;
    }

    public String getInfoCupboard(){
        return getInfoSize() + " Страна производитель: " + countryOfManufacture;
    }
}
