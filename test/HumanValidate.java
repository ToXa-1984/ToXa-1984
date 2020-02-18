package lesson8.test;

public final class HumanValidate {

    public final void validateNameAndSurname(String name, String surname) {
        validateName(name);
        validateSurname(surname);
    }

    private void validateName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            System.out.println("Name is empty or null");
            return;
        }
        System.out.println("Name " + name + " is exist");
    }

    private void validateSurname(String surname) {
        if (surname != null && !surname.trim().isEmpty()) {
            System.out.println("Surname is empty or null");
            return;
        }
        System.out.println("Surname " + surname + " is exist");
    }
}