package lesson10homework;

public class MyMain {
    public static void main(String[] args) {

//        Worker worker = new Worker(); //'Worker' is abstract; cannot be instantiated
//        Master master = new Master(); //'Master' is abstract; cannot be instantiated
//        KitchenWorker kitchenWorker = new KitchenWorker();
//        Cook cook = new Cook();

        Chef chef = new Chef();
        Butcher butcher = new Butcher();
        Confectioner confectioner = new Confectioner();

        chef.setName("Bob");
        chef.setSurname("Qwerty");
        chef.setHeight(180);
        chef.setWeight(80);
        chef.setSalary(10000);
        chef.setNickname("Cookermaster");

        System.out.println("Information about the chef:");
        System.out.println("Name: " + chef.getName() + "\n" + "Surname: " + chef.getSurname() + "\n" + "Height: " + chef.getHeight() + "\n" + "Weight: " + chef.getWeight() + "\n" + "Salary: " + chef.getSalary() + "\n" + "Nickname: " + chef.getNickname());

        chef.comeToWork();
        chef.work();
        chef.toCook();
        chef.fry();
        chef.lunchBreak();
        chef.smokeBreak();

        chef.createMenu();
        chef.cookSoup();
        chef.procurementControl();

        butcher.setName("Pol");
        butcher.setSurname("Trooper");
        butcher.setHeight(185);
        butcher.setWeight(85);
        butcher.setSalary(8000);
        butcher.setNickname("Bloodman");

        System.out.println("\n" + "Information about the butcher:");
        System.out.println("Name: " + butcher.getName() + "\n" + "Surname: " + butcher.getSurname() + "\n" + "Height: " + butcher.getHeight() + "\n" + "Weight: " + butcher.getWeight() + "\n" + "Salary: " + butcher.getSalary() + "\n" + "Nickname: " + butcher.getNickname());

        butcher.comeToWork();
        butcher.work();
        butcher.toCook();
        butcher.fry();
        butcher.lunchBreak();
        butcher.smokeBreak();

        butcher.chopMeat();
        butcher.cookSoup();
        butcher.procurementControl();

        confectioner.setName("Phil");
        confectioner.setSurname("Colins");
        confectioner.setHeight(182);
        confectioner.setWeight(81);
        confectioner.setSalary(8500);
        confectioner.setNickname("Honey");

        System.out.println("\n" + "Information about the confectioner:");
        System.out.println("Name: " + confectioner.getName() + "\n" + "Surname: " + confectioner.getSurname() + "\n" + "Height: " + confectioner.getHeight() + "\n" + "Weight: " + confectioner.getWeight() + "\n" + "Salary: " + confectioner.getSalary() + "\n" + "Nickname: " + confectioner.getNickname());

        confectioner.comeToWork();
        confectioner.work();
        confectioner.toCook();
        confectioner.fry();
        confectioner.lunchBreak();
        confectioner.smokeBreak();

        confectioner.makeDessert();
        confectioner.cookSoup();
        confectioner.procurementControl();

        Director director = new Director();
        Deputy deputy = new Deputy();
        Manager manager = new Manager();

        director.setSurname("Black");
        director.setAge(40);
        director.setSalary(12000);
        director.setMarried(true);
        director.setEngineeringDiploma(true);
        director.setExperience(18);

        System.out.println("\n" + "Information about the director:");
        System.out.println("Surname: " + director.getSurname() + "\n" + "Age: " + director.getAge() + "\n" + "Salary: " + director.getSalary() + "\n" + "Married: " + director.isMarried() + "\n" + "Engineering diploma: " + director.isEngineeringDiploma() + "\n" + "Experience: " + director.getExperience());

        director.holidays();
        director.walk();
        director.relaxTime();
        director.cinema();

        director.controlImplementation();
        director.makeDecisions();
        director.directs();

        deputy.setSurname("White");
        deputy.setAge(42);
        deputy.setSalary(11500);
        deputy.setMarried(true);
        deputy.setEngineeringDiploma(true);
        deputy.setExperience(15);

        System.out.println("\n" + "Information about the deputy:");
        System.out.println("Surname: " + deputy.getSurname() + "\n" + "Age: " + deputy.getAge() + "\n" + "Salary: " + deputy.getSalary() + "\n" + "Married: " + deputy.isMarried() + "\n" + "Engineering diploma: " + deputy.isEngineeringDiploma() + "\n" + "Experience: " + deputy.getExperience());

        deputy.holidays();
        deputy.walk();
        deputy.relaxTime();
        deputy.cinema();

        deputy.makeDecisions();
        deputy.controlImplementation();
        deputy.offer();

        manager.setSurname("Strum");
        manager.setAge(38);
        manager.setSalary(11000);
        manager.setMarried(true);
        manager.setEngineeringDiploma(true);
        manager.setExperience(12);

        System.out.println("\n" + "Information about the manager:");
        System.out.println("Surname: " + manager.getSurname() + "\n" + "Age: " + manager.getAge() + "\n" + "Salary: " + manager.getSalary() + "\n" + "Married: " + manager.isMarried() + "\n" + "Engineering diploma: " + manager.isEngineeringDiploma() + "\n" + "Experience: " + manager.getExperience());

        manager.holidays();
        manager.walk();
        manager.relaxTime();
        manager.cinema();

        manager.makeDecisions();
        manager.controlImplementation();
        manager.supervisor();
    }
}
