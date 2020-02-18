package lesson9;

import java.io.FileNotFoundException;
import java.io.IOException;

public class General {
    public static void main(String[] args) throws IOException {

        User user = new User();
        instanceofExample(user);

        User supportUser = new Support();
        instanceofExample(supportUser);

        User adminUser = new Admin();
        instanceofExample(adminUser);
    }

    public static void instanceofExample(User user) throws IOException {

        if (user instanceof User & !(user instanceof Support) & !(user instanceof Admin)) {
            user.write();
            System.out.println("This is user." + "\n");
        }

        if (user instanceof Support) {
            String text = user.write();
            if(((Support)user).verification(text)){
                System.out.println("file contains text.");
            }
            else {System.out.println("file not contains text.");}
            System.out.println("This is support." + "\n");
        }

        if (user instanceof Admin) {
            String text = user.write();
            Support support = new Support();
            ((Admin)user).deleteFile(support.verification(text));
            System.out.println("This is admin." + "\n");
        }
    }
}
