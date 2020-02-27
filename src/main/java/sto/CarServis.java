package sto;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarServis {
    public static void main(String[] args) {

           Car newCar = carRegistration();

//        Car car = new Car(1, "opel", "cadet", "blue", "KB3456", 1990);
//        car.displayInfo();
//        List<Car> carsList = new ArrayList<>();
//
//        carsList.add(car);
//
//        Car cars[] = new Car[carsList.size()];;
//        carsList.toArray(cars);
//
//        System.out.println(Check.generateId(cars));
//        System.out.println(Check.generateId(cars));
//
//        String hello = "Hello";
//
//        int index1 = hello.indexOf('H');
//        int index2 = hello.indexOf('o');
//        int index3 = hello.indexOf('W');
//        System.out.println("Мы ищем букву 'H' в строке "+hello+". Индекс данной буквы "+index1 );
//        System.out.println("Мы ищем букву 'o' в строке "+hello+". Индекс данной буквы "+index2 );
//        System.out.println("Мы ищем букву 'W' в строке "+hello+". Индекс данной буквы "+index3 );
        }

        public  static Car carRegistration(){
            System.out.println("для отмены регистрации введите 'exit'");

            Scanner scanner = new Scanner(System.in);
            String mark;
            String model;
            String color;
            String registrationNumber;
            int yearManufacture;

            do {
                System.out.print("Введите марку вашего автомобиля ");
                mark = scanner.nextLine();
                mark = mark.trim();
                if (mark.equals("exit")) {
                    System.out.println("Отмена!");
                    return null;
                }
            } while (!Check.checkMark(mark));

            do {
                System.out.print("Введите модель вашего автомобиля ");
                model = scanner.nextLine();
                model = model.trim();
                if (model.equals("exit")) {
                    System.out.println("Отмена!");
                    return null;
                }
            } while (!Check.checkModel(model));

            return null;

//            do {
//                System.out.println("Введите цвет вашего автомобиля");
//                color = scanner.nextLine();
//                color = color.trim();
//                if (color.equals("exit")) {
//                    System.out.println("Отмена!");
//                    return null;
//                }
//            } while (!Check.checkColor(color));
//
//            return null;
            
        }
    }

