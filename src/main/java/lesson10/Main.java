package lesson10;

public class Main {
    public static void main(String[] args) {

//        //понимание преимещества Полиморфизма в ООП
//        PrintWithoutPolymorphism withoutPolymorphism = new PrintWithoutPolymorphism();
//        withoutPolymorphism.printInt(10);
//        withoutPolymorphism.printDouble(20.5);
//        withoutPolymorphism.printString("test");
//
//        PrintWithPolymorphism withPolymorphism = new PrintWithPolymorphism();
//        withPolymorphism.print("Test");

        /*-----------------Override--------------*/

//        Employee employee = new Employee("Alex"); // Невозможно создать абстрактый класс
//        employee.work();
//
//        PoliceMan policeMan = new PoliceMan("Bob");
//        policeMan.work();
//        policeMan.time();
//        policeMan.salary();

        /*----------------Interface  vs Abstract Class---------------*/

//        new Animal(); // НЕ можем создать
//        Cat cat = new Cat(); // НЕ можем создать
        Persian persian = new Persian();
        persian.run();
        persian.say();
        persian.sleep();
    }
}