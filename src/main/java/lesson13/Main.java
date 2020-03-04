package lesson13;

//import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import lesson7.User;
import lesson9new.Animal;
import lesson9new.Cat;
import lesson9new.Dog;
import lesson9new.Persian;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*--------Map(HashMap) - пример использования описанных команд------*/

        HashMap map = new HashMap();
        map.put("firstKey", "firstValue");
        map.put("secondKey", "secondValue");
        map.put("thirdKey", "thirdValue");
        map.put("Users", new HashMap<>());
        map.put("Cats", new HashMap<>());
        map.put("Things", new ArrayList<>());

        System.out.println(map.containsKey("random"));
        System.out.println(map.containsValue("firstValue"));
        System.out.println(map.containsValue("secondValue"));
        System.out.println(map.containsValue("thirdValue"));
        System.out.println(map.isEmpty());
        System.out.println(map.get("firstKey"));
        System.out.println(map.size());

        Set set = map.keySet();
        System.out.println(set.contains("secondKey"));
        Collection values = map.values();
//        map.values().clear();
        System.out.println(values.contains("thirdValue"));

        System.out.println(map.get("firstKey"));
        map.remove("secondKey");
        System.out.println(map.containsValue("secondValue"));
        System.out.println(map.size());

        map.clear();

        /*-------Пример использования класса-обертки для примитивов-----*/

        int val = 123;
        Integer integer = 123;
        integer = val;

        double d = 12.34;
        Double dd = 12.34;

        boolean b = true;
        Boolean bool = true;

        /*------------Использование дженериков с  использование Diamond operator---------------*/

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User());

        //......
//        userList.add(true);

        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            System.out.println(user.toString());
        }

        HashSet<String> strings = new HashSet<>();
        HashMap<String, HashMap<Integer, Boolean>> tests = new HashMap<>();
        HashMap<Integer, Boolean> alexTest = new HashMap<>();
        alexTest.put(1, true);
        alexTest.put(2, true);
        alexTest.put(3, false);
        alexTest.put(4, true);
        alexTest.put(5, true);

        tests.put("Alex", alexTest);

        /*---- Пример  использования extends &  super в дженериках----*/

        Cat cat = new Cat();
        Dog dog = new Dog();
        check(cat, dog);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        ArrayList<Animal> dogs = new ArrayList<>();
        dogs.add(new Dog());

        checkAnimal(cats, dogs);
        checkAnimal(new ArrayList<Dog>(), new ArrayList<Object>());

//        ArrayList<Persian> persians = new ArrayList<>();
//        persians.add(new Cat()); // Невозможно добавить Родительнский класс в список с дочерними классами
    }

    /**
     * @param cat Наследник от класса Animal
     * @param dog Наследник от класса Animal
     * Зная принцип работы наследования и используя принцип динамической диспетчеризации,
     * и в первую, и во вторую переменную можем передать любого наследника от класса Animal.
     */
    private static void check(Animal cat, Animal dog) {

    }

    /**
     * @param cats список - ArrayList
     * @param dogs список - ArrayList
     * Так как внутри дженериков нет прописываются строгие правила принимаемых параметор,
     * то нам необходимо не просто указать родительский класс, а прописать правило передачи.
     *
     * Для такого отображения используются Wildcards:
     *
     * "? extends Animal" говорит о том, что входящим параметром мужет быть список,
     * дженериком которого может быть как класс Animal, так и его наследники:
     *             ArrayList<Animal> cars;
     *             ArrayList<Cat> cats;
     *             ArrayList<Dog> cats;
     *             ArrayList<Persian> cats;
     * При использовании такого Wildcard надо понимать, что прочитать параметры списка мы можем,
     *             а записать нет, так как не можем гарантировать, что прийдет список с  нужным дженериком.
     *
     * "? super Animal" говорит о том, что входящим параметром может быть список,
     * дженериком которого может быть как  класс Animal, так и те, от кого он наследуется:
     *             ArrayList<Animal> dogs;
     *             ArrayList<Object> dogs;
     * Надо понимать, что использование такого Wildcard гарантирует нам, что входящий список  будет с дженериком,
     * не ниже чем класс Animal, что дает нам возможность добавлять любой элемент, наследующийся от Animal и дальше, в список.
     */
    private static void checkAnimal(ArrayList<? extends Animal> cats, ArrayList<? super Animal> dogs) {
        cats.get(0);
//        cats.add(new Cat()); // Невозможно добавить!!!

        dogs.get(0);
        dogs.add(new Dog());
        dogs.add(new Animal());
        dogs.add(new Cat());
    }
}