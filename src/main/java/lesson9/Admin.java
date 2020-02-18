package lesson9;

import java.io.File;

final class Admin extends  User{
    public void deleteFile(boolean flag){

        File file = new File("C:/Hillel/src/main/resources/lesson9/User.txt");

        if(flag){
            if(file.delete()){
                System.out.println("delete successful.");
            }
            else {System.out.println("delete failed." + "\n");}
        }
    }
}
