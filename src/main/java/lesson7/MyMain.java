package lesson7;

public class MyMain {
    public static void main(String[] args) {
//      Dog dogb;
//      if (dogb == null) {}
      Dog dog1 = new Dog();
      Dog dog2 = new Dog("butch");
      Dog dog3 = new Dog("fox", 10);
      Dog dog4 = new Dog("rex", 12, "red");
      Cat cat1 = new Cat();
      Cat cat2 = new Cat("tom");
      Cat cat3 = new Cat("xx", 4);
      Cat cat4 = new Cat("pussy", 6, "bald");

      dog1.name = "sharik";
      System.out.println(dog1.name);
      System.out.println(dog1.getName());

      System.out.println("Было: " + "name: " + cat4.name + ", weight: " + cat4.weight + ", woolColor: " + cat4.woolColor);

      cat4.setName("qwerty");
      cat4.setWeight(7);
      cat4.setWoolColor("black");

      System.out.println("Стало: " + "name: " + cat4.getName() + ", weight: " + cat4.getWeight() + ", woolColor: " + cat4.getWoolColor());
    }
}
