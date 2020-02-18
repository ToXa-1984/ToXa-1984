package lesson10homework;

final public class Manager extends Master {
    private boolean engineeringDiploma;
    private int experience;

    public Manager() {
    }

    public Manager(String surname, int age) {
        super(surname, age);
    }

    public Manager(boolean married, int salary) {
        super(married, salary);
    }

    public Manager(String surname, int age, boolean married, int salary) {
        super(surname, age, married, salary);
    }

    public Manager(boolean married, int salary, boolean engineeringDiploma, int experience) {
        super(married, salary);
        this.engineeringDiploma = engineeringDiploma;
        this.experience = experience;
    }

    public Manager(String surname, int age, boolean married, int salary, boolean engineeringDiploma, int experience) {
        super(surname, age, married, salary);
        this.engineeringDiploma = engineeringDiploma;
        this.experience = experience;
    }

    public boolean isEngineeringDiploma() {
        return engineeringDiploma;
    }

    public void setEngineeringDiploma(boolean engineeringDiploma) {
        this.engineeringDiploma = engineeringDiploma;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void supervisor() {
        System.out.println("supervisor");
    }

    @Override
    public void relaxTime() {
        System.out.println("Relax time");
    }

    @Override
    public void cinema() {
        System.out.println("Let's go to the cinema");
    }

    @Override
    public void holidays() {
        System.out.println("Let's celebrate");
    }

    @Override
    public void walk() {
        System.out.println("Go for a walk");
    }
}
