package lesson13homework;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Зад1
        String nameFile = "C:/Hillel/src/main/resources/lesson13/questionnaire.txt";
        QuestionnaireClass.mQuestionnaire(nameFile);
        QuestionnaireClass.mQuestionnaire(nameFile);

        //Зад2
        ThirdClass myTh = new ThirdClass();
        myTh.getMySet();
        ThirdClass myTh2 = new ThirdClass();
        ThirdClass myTh3 = new ThirdClass();

        HashSet set = new HashSet();
        set.add(myTh);
        set.add(myTh2);
        set.add(myTh3);

        SecondClass mySC = new SecondClass();
        ArrayList arListMain = new ArrayList();
        arListMain.add(mySC);
        arListMain.add(mySC);
        arListMain.add(mySC);

        ArrayList arListMain2 = checkClass(set, arListMain);
        for (Object o : arListMain2) {
            System.out.println(o);
        }
    }

    private static ArrayList checkClass(HashSet<? extends SecondClass> mySet, ArrayList<? super SecondClass> myList) {
        ArrayList<Object> myArrL = new ArrayList<>();
        myArrL.addAll(mySet);
        myArrL.addAll(myList);

        return myArrL;
    }
}
