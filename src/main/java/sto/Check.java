package sto;

import java.util.Random;

public class Check {
    public static int generateId(Car cars[]) {
        Random rm = new Random();
        int id;
        boolean flag;
        while (true) {
            id = rm.nextInt(10000);
            flag = true;

            for (int i = 0; i < cars.length; i++) {
                if (id == cars[i].id) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return id;
            }
        }
    }

    public static boolean checkMark(String mark) {
        switch (mark) {
            case "opel":
                return true;
            case "great wall":
                return true;
            case "bmv":
                return true;
            default:
                System.out.println("Данная марка автомобиля не обслуживается ");
                return false;
        }
    }

    public static boolean checkModel(String model) {
        switch (model) {
            case "vivaro":
                return true;
            case "safe":
                return true;
            case "x5":
                return true;
            default:
                System.out.println("Данная модель автомобиля не обслуживается ");
                return false;
        }
    }

    public static boolean checkColor(String color) {
       if (color.indexOf(' ') == -1){
           return true;
       } else {
           System.out.println("B названии цвета должно быть одно слово ");
           return false;
       }

    }



    public static boolean registrationNumber(String registrationNumber){

        if (registrationNumber.length() == 8) {
            return true;
        } else {
            System.out.println("Регистрационный номер должен иметь 8 символов ");
            return false;
        }
    }

    public static boolean yearManufacture(int yearManufacture) {

        if (yearManufacture >= 1970 & yearManufacture <= 2020) {
            return true;
        }  else {
            System.out.println("Обслуживаем автомобили не старше 1970-го года выпуска ");
            return false;
        }
    }
}
