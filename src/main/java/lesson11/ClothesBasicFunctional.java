package lesson11;

import lesson11.model.Clothes;

public interface ClothesBasicFunctional {

    public Clothes create(int type);

    public void utilization(Clothes clothes);
}