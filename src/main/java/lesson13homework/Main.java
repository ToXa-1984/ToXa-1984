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
        myTh.mySet = new HashSet();

        HashSet set = new HashSet();
        set.add(myTh);
        set.add(myTh);
        set.add(myTh);

        ArrayList arListMain = new ArrayList();
        checkClass(arListMain, set);
    }

    private static void checkClass(ArrayList<? extends SecondClass> myList, HashSet<? super SecondClass> mySet) {

        ArrayList<SecondClass> arListSecondClass = new ArrayList<>();
        HashSet set = new HashSet();
        ArrayList list = new ArrayList();
        list.addAll(set);
    }
}
