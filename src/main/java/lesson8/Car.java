package lesson8;

public class Car {
    private byte numberOfWheels;
    private short maximumSpeed;
    private int cost;
    private long engineCapacity;
    private float accelerationToAHundredKm_H;
    private double stoppingDistanceAtOneHundredKm_H;
    private char c;
    private boolean thisIsACar;
    private String name;

    public byte getNumberOfWheels(){
        return numberOfWheels;
    }

    public void setNumberOfWheels(byte numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public short getMaximumSpeed(){
        return maximumSpeed;
    }

    public void setMaximumSpeed(short maximumSpeed){
        this.maximumSpeed = maximumSpeed;
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public long getEngineCapacity(){
        return engineCapacity;
    }

    public void setEngineCapacity(long engineCapacity){
        this.engineCapacity = engineCapacity;
    }

    public float getAccelerationToAHundredKm_H(){
        return accelerationToAHundredKm_H;
    }

    public void setAccelerationToAHundredKm_H(float accelerationToAHundredKm_H){
        this.accelerationToAHundredKm_H = accelerationToAHundredKm_H;
    }

    public double getStoppingDistanceAtOneHundredKm_H(){
        return stoppingDistanceAtOneHundredKm_H;
    }

    public void setStoppingDistanceAtOneHundredKm_H(double stoppingDistanceAtOneHundredKm_H){
        this.stoppingDistanceAtOneHundredKm_H = stoppingDistanceAtOneHundredKm_H;
    }

    public char getC(){
        return c;
    }

    public void setC(char c){
        this.c = c;
    }

    public boolean thisIsACar(){
        return thisIsACar;
    }

    public void setCar(boolean car){
        thisIsACar = car;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Car(){
    }

    public Car(byte numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Car(byte numberOfWheels, short maximumSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.maximumSpeed = maximumSpeed;
    }

    public Car(byte numberOfWheels, short maximumSpeed, int cost) {
        this.numberOfWheels = numberOfWheels;
        this.maximumSpeed = maximumSpeed;
        this.cost = cost;
    }

    public Car(byte numberOfWheels, short maximumSpeed, int cost, long engineCapacity) {
        this.numberOfWheels = numberOfWheels;
        this.maximumSpeed = maximumSpeed;
        this.cost = cost;
        this.engineCapacity = engineCapacity;
    }

    public Car(byte numberOfWheels, short maximumSpeed, int cost, long engineCapacity, float accelerationToAHundredKm_H) {
        this.numberOfWheels = numberOfWheels;
        this.maximumSpeed = maximumSpeed;
        this.cost = cost;
        this.engineCapacity = engineCapacity;
        this.accelerationToAHundredKm_H = accelerationToAHundredKm_H;
    }

    public Car(byte numberOfWheels, short maximumSpeed, int cost, long engineCapacity, float accelerationToAHundredKm_H, double stoppingDistanceAtOneHundredKm_H) {
        this.numberOfWheels = numberOfWheels;
        this.maximumSpeed = maximumSpeed;
        this.cost = cost;
        this.engineCapacity = engineCapacity;
        this.accelerationToAHundredKm_H = accelerationToAHundredKm_H;
        this.stoppingDistanceAtOneHundredKm_H = stoppingDistanceAtOneHundredKm_H;
    }

    public Car(byte numberOfWheels, short maximumSpeed, int cost, long engineCapacity, float accelerationToAHundredKm_H, double stoppingDistanceAtOneHundredKm_H, char c) {
        this.numberOfWheels = numberOfWheels;
        this.maximumSpeed = maximumSpeed;
        this.cost = cost;
        this.engineCapacity = engineCapacity;
        this.accelerationToAHundredKm_H = accelerationToAHundredKm_H;
        this.stoppingDistanceAtOneHundredKm_H = stoppingDistanceAtOneHundredKm_H;
        this.c = c;
    }

    public Car(byte numberOfWheels, short maximumSpeed, int cost, long engineCapacity, float accelerationToAHundredKm_H, double stoppingDistanceAtOneHundredKm_H, char c, boolean thisIsACar) {
        this.numberOfWheels = numberOfWheels;
        this.maximumSpeed = maximumSpeed;
        this.cost = cost;
        this.engineCapacity = engineCapacity;
        this.accelerationToAHundredKm_H = accelerationToAHundredKm_H;
        this.stoppingDistanceAtOneHundredKm_H = stoppingDistanceAtOneHundredKm_H;
        this.c = c;
        this.thisIsACar = true;
    }

    public Car(byte numberOfWheels, short maximumSpeed, int cost, long engineCapacity, float accelerationToAHundredKm_H, double stoppingDistanceAtOneHundredKm_H, char c, boolean thisIsACar, String name) {
        this.numberOfWheels = numberOfWheels;
        this.maximumSpeed = maximumSpeed;
        this.cost = cost;
        this.engineCapacity = engineCapacity;
        this.accelerationToAHundredKm_H = accelerationToAHundredKm_H;
        this.stoppingDistanceAtOneHundredKm_H = stoppingDistanceAtOneHundredKm_H;
        this.c = c;
        this.thisIsACar = true;
        this.name = name;
    }
}