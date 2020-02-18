package lesson9new;


public class Main {
    public static void main(String[] args) {

        /*------------------Базовые примеры с наследованием----------------*/

//        Animal animal = new Animal();
//        Cat cat = new Cat();
//        Persian persian = new Persian(true);
//
//        animal.leave();
//        cat.leave();
//        persian.leave();
//
////        animal.meow(); // Этого метода нет в классе Animal
//        cat.meow();
//        cat.setSeeInNight(true);
//        persian.meow();
//        persian.setSeeInNight(true);
//
////        animal.isGrey(); // Не определен в классе
////        cat.isGray(); // Не определен в классе
//        persian.isGrey();
//
//        Dog dog = new Dog();
//        dog.run();
//        cat.run();
//
//        persian.run();
//        persian.sleep();

        /*----------------Пример динамической диспетчеризации--------------*/

        Cat cat = new Cat();
        cat.isSeeInNight();
        Animal catAnimal = new Cat();
        catAnimal.leave();

        Dog dog = new Dog();
        Animal dogAnimal = new Dog();
        dog.run();
        dogAnimal.leave();

        /*----Без использования диспетчеризации----*/
        catChanges(cat, 2);
        dogChanges(dog, 3);

        /*----С использованием диспетчеризации----*/
        animalChanges(cat, 0);
        animalChanges(dog, 1);

        /*----Пример работы со сравнением типов объектов----*/
        instanceofExample(cat);
        instanceofExample(dog);
        instanceofExample(catAnimal);
        instanceofExample(dogAnimal);

        Persian persian = new Persian(true);
        System.out.println(persian.isGrey());
        instanceofExample(persian);
        System.out.println(persian.isGrey());

    }

    private static void dogChanges(Dog dog, int legs) {
        if (legs == 4) {
            dog.setLegs(legs);
        } else {
            System.out.println(legs + " is wrong value");
        }
        dog.leave();
    }

    private static void catChanges(Cat cat, int legs) {
        if (legs == 4) {
            cat.setLegs(legs);
        } else {
            System.out.println(legs + " is wrong value");
        }
        cat.leave();
    }

    private static void animalChanges(Animal animal, int legs) {
        if (legs == 4) {
            animal.setLegs(legs);
        } else {
            System.out.println(legs + " is wrong for animal");
        }
        animal.leave();
    }

    private static void instanceofExample(Animal animal) {
        if (animal instanceof Cat) {
            ((Cat)animal).meow();
            System.out.println("It's a cat");
        }

        if (animal instanceof Dog) {
            ((Dog)animal).run();
            System.out.println("It's a dog");
        }

        if (animal instanceof Persian) {
            Persian pers = (Persian) animal;
            pers.setGrey(true);
            pers.meow();
        }
    }
}