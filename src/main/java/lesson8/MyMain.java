package lesson8;

public class MyMain {
    public static void main(String[] args) {

        System.out.println("Первое задание: ");
        Car myCar = new Car((byte)1, (short) 250, 20000, 260, 4.5f,  17.5, 'a');
        myCar.setName("fg");
        System.out.println(myCar.getCost() + " " + myCar.getName() + " " + myCar.getC()+ " "  + myCar.getMaximumSpeed()+ " "  + myCar.getNumberOfWheels()+ " ");

        System.out.println("\nВторое задание: ");
        Tractor myTractor = new Tractor();
        System.out.println(myTractor.cost + " " + myTractor.maximumSpeed + " " + myTractor.getNumberOfWheels());

        System.out.println("\nТретье задание: ");
        House myHouse1 = new House();
        myHouse1.buyArmchair(100, 70, 50, "lux");
        myHouse1.buyCupboard(150, 110, 75, "Ukraine");

        System.out.println("В первом доме есть: ");
        myHouse1.infoAboutHous();

        House myHouse2 = new House();
        myHouse2.buyCupboard(120, 50, 80, "Ukraine");
        myHouse2.buyBed(70, 120, 30, 20);
        myHouse2.buyTable(60, 60, 60, "maple");
        myHouse2.buyTelevisor(100, 75, 10, "black");
        myHouse2.buyArmchair(100, 70, 50, "lux");

        System.out.println("\nВо втором доме есть");
        myHouse2.infoAboutHous();
    }

}
