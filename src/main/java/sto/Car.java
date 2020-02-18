package sto;

public class Car {
    int id;
    String mark;
    String model;
    String color;
    String registrationNumber;
    int yearManufacture;

    void displayInfo(){
        System.out.print("id: " + this.id + "\t");
        System.out.print("mark: " + this.mark + "\t");
        System.out.print("model: " + this.model + "\t");
        System.out.print("color: " + this.color + "\t");
        System.out.print("registrationNumber: " + this.registrationNumber + "\t");
        System.out.println("yearManufacture: " + this.yearManufacture);
    }

    public Car(int id, String mark, String model, String color, String registrationNumber, int yearManufacture) {
        this.id = id;
        this.color = color;
        this.mark = mark;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.yearManufacture = yearManufacture;

    }
}
