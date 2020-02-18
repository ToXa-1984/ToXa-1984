package lesson8;

public class Tractor {
    final byte numberOfWheels = 6;//здесь идея сразу прсит инициализировать все переменные
    final short maximumSpeed = 45;
    final int cost = 60000;

    public Tractor(){
    }

    public Tractor(byte numberOfWheels){
//        this.numberOfWheels = numberOfWheels;//нельзя присвоить значение финальной переменной
    }

    public Tractor(byte numberOfWheels, short maximumSpeed){
//        this.numberOfWheels = numberOfWheels;//нельзя присвоить значение финальной переменной
//        this.maximumSpeed = maximumSpeed;//нельзя присвоить значение финальной переменной
    }

    public Tractor(byte numberOfWheels, short maximumSpeed, int cost){
//        this.numberOfWheels = numberOfWheels;//нельзя присвоить значение финальной переменной
//        this.maximumSpeed = maximumSpeed;//нельзя присвоить значение финальной переменной
//        this.cost = cost;//нельзя присвоить значение финальной переменной
    }

    public byte getNumberOfWheels(){
        return numberOfWheels;
    }

    public void setNumberOfWheels(byte numberOfWheels){
//        this.numberOfWheels = numberOfWheels;//нельзя присвоить значение финальной переменной
    }

    public short getMaximumSpeed(){
        return maximumSpeed;
    }

    public void setMaximumSpeed(short maximumSpeed){
//        this.maximumSpeed = maximumSpeed;//нельзя присвоить значение финальной переменной
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
//        this.cost = cost;//нельзя присвоить значение финальной переменной
    }
}
