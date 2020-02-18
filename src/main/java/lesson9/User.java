package lesson9;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String sex;
    private String country;

    public User() {
    }

    public User(String name, String surname, String email, String password, String sex, String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    final void read(String text) throws IOException {

        System.out.println(text);
    }

    public String write() throws IOException {

        System.out.println("Enter some text");

        Scanner scanner = new Scanner(System.in);
        String writeString = scanner.next();

        String pathFile = "C:/Hillel/src/main/resources/lesson9/User.txt";
        Path dirPath = Paths.get(pathFile);
        if (!Files.exists(dirPath.getParent())) {
            Files.createDirectories(dirPath.getParent());
        }

        FileWriter fileWriter = new FileWriter(pathFile);
        fileWriter.write(writeString);
        fileWriter.close();

        return writeString;
    }
}
